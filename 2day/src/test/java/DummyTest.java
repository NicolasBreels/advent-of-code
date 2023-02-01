import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {
  @Test
  public void compareHandTest() {
    Dummy dummy = new Dummy();
    assertEquals(3, dummy.oldCompareHand("A", "X"));
  }

  @Test
  public void calculateFightTest() {
    String fichtFile = "A Y\n"
            + "B X\n"
            + "C Z";
    Dummy dummy = new Dummy();
    assertEquals(15, dummy.calculateFight(fichtFile));
  }

  @Test
  public void calculatenewFightTest() {
    String fichtFile = "A Y\n"
            + "B X\n"
            + "C Z";
    Dummy dummy = new Dummy();
    assertEquals(12, dummy.calculatenewFight(fichtFile));
  }


}
