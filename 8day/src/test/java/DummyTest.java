import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {

  @Test
  public void parseContentTest(){
    Dummy dummy = new Dummy();
    String content = "30373\n"
            + "25512\n"
            + "65332\n"
            + "33549\n"
            + "35390";
    int[][] tab = dummy.parseContent(content);
    System.out.println(tab.length);
    System.out.println(tab[0].length);

    assertEquals(tab[0][0],  3);
    assertEquals(tab[3][3], 4);
    assertEquals(tab[4][4], 0);
    assertEquals(tab[0][3], 7);
    assertEquals(tab[3][2], 5);
  }


  @Test
  public void apply_ruleTest(){
    Dummy dummy = new Dummy();
    String content = "30373\n"
            + "25512\n"
            + "65332\n"
            + "33549\n"
            + "35390";
    int[][] tab = dummy.parseContent(content);

    int result = dummy.apply_rule(tab);
    System.out.println(result);
    assertEquals(result, 21);

  }
  @Test
  public void apply_rule2Test(){
    Dummy dummy = new Dummy();
    String content = "30373\n"
            + "25512\n"
            + "65332\n"
            + "33549\n"
            + "35390";
    int[][] tab = dummy.parseContent(content);

    int result = dummy.apply_rule2(tab);

    assertEquals(result, 8);

  }
}
