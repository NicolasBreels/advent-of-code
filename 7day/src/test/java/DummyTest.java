import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {
  @Test
  public void itSaysHelloWorld() {
    Dummy dummy = new Dummy();
    assertEquals("Hello World!", dummy.hello());
  }
  @Test
  public void adding_contentTest(){
    Dummy dummy = new Dummy();
    Directory directory = new Directory("/");
    String content_1= "dir a";
    String content_2= "14848514 b.txt";
    String content_3= "8504156 c.dat";
    String content_4= "dir d";


    dummy.adding_content(content_1,directory);
    dummy.adding_content(content_2,directory);
    dummy.adding_content(content_3,directory);
    dummy.adding_content(content_4,directory);

    assertEquals(2,directory.directories.size());
    assertEquals(2,directory.files.size());
  }


  @Test
  public void browseContentTest() {
    Dummy dummy = new Dummy();
    Directory directory = new Directory("/");
    String content = "dir a\n"
            + "14848514 b.txt\n"
            + "8504156 c.dat\n"
            + "dir d\n"
            + "$ cd a\n"
            + "$ ls\n"
            + "dir e\n"
            + "29116 f\n"
            + "2557 g\n"
            + "62596 h.lst\n"
            + "$ cd e\n"
            + "$ ls\n"
            + "584 i\n"
            + "$ cd ..\n"
            + "$ cd ..\n"
            + "$ cd d\n"
            + "$ ls\n"
            + "4060174 j\n"
            + "8033020 d.log\n"
            + "5626152 d.ext\n"
            + "7214296 k";
    dummy.browseContent(content,directory);
    assertEquals(2,directory.directories.size());
    assertEquals(2,directory.files.size());
    assertEquals(directory,directory.getDir("a").parent);
    assertEquals(directory,directory.getDir("a").parent);
    assertEquals(0,directory.getDir("a").getDir("e").directories.size());
    assertEquals(1,directory.getDir("a").getDir("e").files.size());
  }

  @Test
  public void getSizeTest() {
    Dummy dummy = new Dummy();
    Directory directory = new Directory("/");
    String content = "dir a\n"
            + "14848514 b.txt\n"
            + "8504156 c.dat\n"
            + "dir d\n"
            + "$ cd a\n"
            + "$ ls\n"
            + "dir e\n"
            + "29116 f\n"
            + "2557 g\n"
            + "62596 h.lst\n"
            + "$ cd e\n"
            + "$ ls\n"
            + "584 i\n"
            + "$ cd ..\n"
            + "$ cd ..\n"
            + "$ cd d\n"
            + "$ ls\n"
            + "4060174 j\n"
            + "8033020 d.log\n"
            + "5626152 d.ext\n"
            + "7214296 k";
    dummy.browseContent(content,directory);
    Directory directory_a = directory.getDir("a");
    Directory directory_e = directory_a.getDir("e");
    Directory directory_d = directory.getDir("d");

    assertEquals(94853,directory_a.getSize());
    assertEquals(584,directory_e.getSize());
    assertEquals(24933642,directory_d.getSize());
    assertEquals(48381165,directory.getSize());

    assertEquals(95437,directory_a.getTotalSize());
  }
}
