import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DummyTest {
  @Test
  public void veryfyCaracterTest() {
    Dummy dummy = new Dummy();

    assertTrue(dummy.verifyCaracter("a","b","c","d"));
    assertFalse(dummy.verifyCaracter("a","b","c","b"));
    assertFalse(dummy.verifyCaracter("a","b","a","d"));
    assertFalse(dummy.verifyCaracter("a","d","c","d"));
  }

  @Test
  public void browseContentTest(){
    Dummy dummy = new Dummy();
    String string1 = "bvwbjplbgvbhsrlpgdmjqwftvncz";
    String string2 = "nppdvjthqldpwncqszvftbrmjlhg";
    String string3 = "nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg";
    String string4 = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";
    assertEquals(5,dummy.browseContent(string1));
    assertEquals(6,dummy.browseContent(string2));
    assertEquals(10,dummy.browseContent(string3));
    assertEquals(11,dummy.browseContent(string4));
  }

  @Test
  public void browseContent2Test(){
    Dummy dummy = new Dummy();
    String string1 = "bvwbjplbgvbhsrlpgdmjqwftvncz";
    String string2 = "nppdvjthqldpwncqszvftbrmjlhg";
    String string3 = "nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg";
    String string4 = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";
    assertEquals(5,dummy.browseContent2(string1,4));
    assertEquals(6,dummy.browseContent2(string2,4));
    assertEquals(10,dummy.browseContent2(string3,4));
    assertEquals(11,dummy.browseContent2(string4, 4));
  }
}
