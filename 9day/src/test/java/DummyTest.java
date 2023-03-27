import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {
  @Test
  public void playRuleTest() {
    Dummy dummy = new Dummy();
    String content = "R 4\n"
            + "U 4\n"
            + "L 3\n"
            + "D 1\n"
            + "R 4\n"
            + "D 1\n"
            + "L 5\n"
            + "R 2";
    assertEquals(13, dummy.playRule(content));
  }
}
