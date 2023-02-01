import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {
    @Test
    public void getPrioritizeTest() {
        Dummy dummy = new Dummy();
        assertEquals(1, dummy.getPrioritize("a"));
        assertEquals(16, dummy.getPrioritize("p"));
        assertEquals(38, dummy.getPrioritize("L"));
    }

    @Test
    public void getUniqueLetterTest() {
      Dummy dummy = new Dummy();
      assertEquals("p",dummy.getUniqueLetter("vJrwpWtwJgWrhcsFMMfFFhFp"));
      assertEquals("L",dummy.getUniqueLetter("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"));
    }

    @Test
    public void getUniqueLetter2Test() {
        Dummy dummy = new Dummy();
        String sentence1 = "vJrwpWtwJgWrhcsFMMfFFhFp";
        String sentence2 = "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL";
        String sentence3 = "PmmdzqPrVvPwwTWBwg";

        String result = dummy.getUniqueLetter2(sentence1,sentence2,sentence3);

        assertEquals("r",result);

    }
    @Test
    public void browseTheContentTest(){
        Dummy dummy = new Dummy();

        String news = "vJrwpWtwJgWrhcsFMMfFFhFp\n"
                + "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL\n"
                + "PmmdzqPrVvPwwTWBwg\n"
                + "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn\n"
                + "ttgJtRGJQctTZtZT\n"
                + "CrZsJsPPZsGzwwsLwLmpwMDw";
        int val = dummy.browseTheContent(news);
        assertEquals(157,val);
    }

    @Test
    public void browseTheContent2Test(){
        Dummy dummy = new Dummy();

        String news = "vJrwpWtwJgWrhcsFMMfFFhFp\n"
                + "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL\n"
                + "PmmdzqPrVvPwwTWBwg\n"
                + "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn\n"
                + "ttgJtRGJQctTZtZT\n"
                + "CrZsJsPPZsGzwwsLwLmpwMDw";
        int val = dummy.browseTheContent2(news);
        assertEquals(70,val);
    }


}
