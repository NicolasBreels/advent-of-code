import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DummyTest {
  @Test
  public void nextTest() {
    Dummy dummy = new Dummy();

    Stack<String> stack_1 = new Stack<>();
    stack_1.push("Z");
    stack_1.push("N");

    Stack<String> stack_2 = new Stack<>();
    stack_2.push("M");
    stack_2.push("C");
    stack_2.push("D");

    Stack<String> stack_3 = new Stack<>();
    stack_3.push("P");

    Stack<String> stack_4 = new Stack<>();
    Stack<String> stack_5 = new Stack<>();
    Stack<String> stack_6 = new Stack<>();
    Stack<String> stack_7 = new Stack<>();
    Stack<String> stack_8 = new Stack<>();
    Stack<String> stack_9 = new Stack<>();

    Dummy.MultipleStack multipleStack= new Dummy.MultipleStack(stack_1, stack_2, stack_3, stack_4, stack_5, stack_6, stack_7, stack_8, stack_9);
    System.out.println(multipleStack.stack_1);
    System.out.println(multipleStack.stack_2);
    System.out.println(multipleStack.stack_3);
    multipleStack = dummy.next(multipleStack,1,2,1);
    System.out.println(multipleStack.stack_1);
    System.out.println(multipleStack.stack_2);
    System.out.println(multipleStack.stack_3);
    multipleStack = dummy.next(multipleStack,3,1,3);
    System.out.println(multipleStack.stack_1);
    System.out.println(multipleStack.stack_2);
    System.out.println(multipleStack.stack_3);
    multipleStack = dummy.next(multipleStack,2,2,1);
    System.out.println(multipleStack.stack_1);
    System.out.println(multipleStack.stack_2);
    System.out.println(multipleStack.stack_3);
    multipleStack = dummy.next(multipleStack,1,1,2);
    System.out.println(multipleStack.stack_1);
    System.out.println(multipleStack.stack_2);
    System.out.println(multipleStack.stack_3);

  }
  @Test
  public void browseContentTest(){
    Dummy dummy = new Dummy();

    Stack<String> stack_1 = new Stack<>();
    stack_1.push("Z");
    stack_1.push("N");

    Stack<String> stack_2 = new Stack<>();
    stack_2.push("M");
    stack_2.push("C");
    stack_2.push("D");

    Stack<String> stack_3 = new Stack<>();
    stack_3.push("P");

    Stack<String> stack_4 = new Stack<>();
    Stack<String> stack_5 = new Stack<>();
    Stack<String> stack_6 = new Stack<>();
    Stack<String> stack_7 = new Stack<>();
    Stack<String> stack_8 = new Stack<>();
    Stack<String> stack_9 = new Stack<>();

    Dummy.MultipleStack multipleStack= new Dummy.MultipleStack(stack_1, stack_2, stack_3, stack_4, stack_5, stack_6, stack_7, stack_8, stack_9);

    String content = "move 1 from 2 to 1\n"
            + "move 3 from 1 to 3\n"
            + "move 2 from 2 to 1\n"
            + "move 1 from 1 to 2";
    multipleStack = dummy.browseContent2(multipleStack,content);

    assertTrue(true);

  }

  @Test
  public void browseContentNotTest(){
    Dummy dummy = new Dummy();

    Stack<String> stack_1 = new Stack<>();
    stack_1.push("D");
    stack_1.push("T");
    stack_1.push("R");
    stack_1.push("B");
    stack_1.push("J");
    stack_1.push("L");
    stack_1.push("W");
    stack_1.push("G");

    Stack<String> stack_2 = new Stack<>();
    stack_2.push("S");
    stack_2.push("W");
    stack_2.push("C");

    Stack<String> stack_3 = new Stack<>();
    stack_3.push("R");
    stack_3.push("Z");
    stack_3.push("T");
    stack_3.push("M");

    Stack<String> stack_4 = new Stack<>();
    stack_4.push("D");
    stack_4.push("T");
    stack_4.push("C");
    stack_4.push("H");
    stack_4.push("S");
    stack_4.push("P");
    stack_4.push("V");


    Stack<String> stack_5 = new Stack<>();
    stack_5.push("G");
    stack_5.push("P");
    stack_5.push("T");
    stack_5.push("L");
    stack_5.push("D");
    stack_5.push("Z");


    Stack<String> stack_6 = new Stack<>();
    stack_6.push("F");
    stack_6.push("B");
    stack_6.push("R");
    stack_6.push("Z");
    stack_6.push("J");
    stack_6.push("Q");
    stack_6.push("C");
    stack_6.push("D");

    Stack<String> stack_7 = new Stack<>();
    stack_7.push("S");
    stack_7.push("B");
    stack_7.push("D");
    stack_7.push("J");
    stack_7.push("M");
    stack_7.push("F");
    stack_7.push("T");
    stack_7.push("R");

    Stack<String> stack_8 = new Stack<>();
    stack_8.push("L");
    stack_8.push("H");
    stack_8.push("R");
    stack_8.push("B");
    stack_8.push("T");
    stack_8.push("V");
    stack_8.push("M");

    Stack<String> stack_9 = new Stack<>();
    stack_9.push("Q");
    stack_9.push("P");
    stack_9.push("D");
    stack_9.push("S");
    stack_9.push("V");


    Dummy.MultipleStack multipleStack= new Dummy.MultipleStack(stack_1, stack_2, stack_3, stack_4, stack_5, stack_6, stack_7, stack_8, stack_9);

    String content = "move 1 from 3 to 5\n"
            + "move 5 from 5 to 4\n"
            + "move 6 from 7 to 3\n"
            + "move 6 from 1 to 3\n"
            + "move 1 from 1 to 9\n"
            + "move 1 from 1 to 4\n"
            + "move 3 from 6 to 9\n"
            + "move 2 from 7 to 5\n"
            + "move 1 from 5 to 7\n"
            + "move 1 from 7 to 2\n"
            + "move 2 from 2 to 5\n"
            + "move 2 from 6 to 3\n"
            + "move 6 from 8 to 9\n"
            + "move 7 from 3 to 9\n"
            + "move 1 from 8 to 7\n"
            + "move 8 from 9 to 7\n"
            + "move 5 from 4 to 8\n"
            + "move 1 from 6 to 2\n"
            + "move 2 from 8 to 4\n"
            + "move 9 from 9 to 1\n"
            + "move 2 from 8 to 5\n"
            + "move 1 from 8 to 5\n"
            + "move 5 from 9 to 2\n"
            + "move 1 from 6 to 8\n"
            + "move 5 from 1 to 7\n"
            + "move 1 from 8 to 2\n"
            + "move 2 from 1 to 7\n"
            + "move 1 from 2 to 6\n"
            + "move 4 from 5 to 4\n"
            + "move 2 from 1 to 4\n"
            + "move 13 from 7 to 8\n"
            + "move 3 from 8 to 6\n"
            + "move 2 from 6 to 8\n"
            + "move 10 from 3 to 5\n"
            + "move 2 from 7 to 6\n"
            + "move 3 from 5 to 6\n"
            + "move 10 from 8 to 1\n"
            + "move 1 from 8 to 6\n"
            + "move 6 from 2 to 4\n"
            + "move 1 from 5 to 8\n"
            + "move 5 from 6 to 3\n"
            + "move 2 from 8 to 6\n"
            + "move 1 from 7 to 9\n"
            + "move 2 from 2 to 7\n"
            + "move 3 from 5 to 1\n"
            + "move 2 from 7 to 2\n"
            + "move 6 from 6 to 3\n"
            + "move 7 from 5 to 6\n"
            + "move 5 from 3 to 2\n"
            + "move 10 from 1 to 8\n"
            + "move 2 from 1 to 3\n"
            + "move 8 from 3 to 7\n"
            + "move 9 from 4 to 8\n"
            + "move 1 from 9 to 2\n"
            + "move 2 from 7 to 8\n"
            + "move 4 from 6 to 9\n"
            + "move 1 from 4 to 9\n"
            + "move 5 from 7 to 4\n"
            + "move 3 from 6 to 5\n"
            + "move 1 from 1 to 5\n"
            + "move 14 from 4 to 8\n"
            + "move 3 from 9 to 7\n"
            + "move 4 from 5 to 9\n"
            + "move 2 from 4 to 1\n"
            + "move 27 from 8 to 6\n"
            + "move 2 from 7 to 2\n"
            + "move 2 from 7 to 4\n"
            + "move 4 from 2 to 9\n"
            + "move 7 from 8 to 4\n"
            + "move 10 from 4 to 1\n"
            + "move 18 from 6 to 5\n"
            + "move 6 from 9 to 2\n"
            + "move 1 from 9 to 5\n"
            + "move 11 from 2 to 6\n"
            + "move 2 from 5 to 4\n"
            + "move 1 from 2 to 8\n"
            + "move 2 from 4 to 9\n"
            + "move 2 from 8 to 3\n"
            + "move 1 from 6 to 8\n"
            + "move 4 from 9 to 7\n"
            + "move 4 from 7 to 8\n"
            + "move 7 from 5 to 1\n"
            + "move 4 from 6 to 3\n"
            + "move 2 from 3 to 7\n"
            + "move 6 from 5 to 3\n"
            + "move 2 from 8 to 2\n"
            + "move 14 from 6 to 2\n"
            + "move 3 from 8 to 1\n"
            + "move 15 from 2 to 3\n"
            + "move 1 from 6 to 1\n"
            + "move 14 from 3 to 2\n"
            + "move 2 from 2 to 5\n"
            + "move 1 from 9 to 3\n"
            + "move 13 from 1 to 3\n"
            + "move 4 from 2 to 6\n"
            + "move 10 from 1 to 3\n"
            + "move 2 from 6 to 9\n"
            + "move 6 from 2 to 9\n"
            + "move 6 from 5 to 2\n"
            + "move 2 from 6 to 8\n"
            + "move 7 from 9 to 5\n"
            + "move 1 from 5 to 8\n"
            + "move 2 from 7 to 6\n"
            + "move 34 from 3 to 6\n"
            + "move 19 from 6 to 2\n"
            + "move 12 from 6 to 9\n"
            + "move 3 from 6 to 3\n"
            + "move 2 from 3 to 2\n"
            + "move 1 from 6 to 5\n"
            + "move 17 from 2 to 8\n"
            + "move 2 from 3 to 2\n"
            + "move 8 from 9 to 4\n"
            + "move 7 from 5 to 2\n"
            + "move 5 from 4 to 1\n"
            + "move 4 from 1 to 6\n"
            + "move 1 from 1 to 6\n"
            + "move 6 from 6 to 8\n"
            + "move 2 from 8 to 4\n"
            + "move 17 from 8 to 6\n"
            + "move 2 from 4 to 5\n"
            + "move 17 from 6 to 9\n"
            + "move 22 from 9 to 7\n"
            + "move 1 from 5 to 2\n"
            + "move 20 from 2 to 7\n"
            + "move 29 from 7 to 9\n"
            + "move 1 from 4 to 7\n"
            + "move 3 from 8 to 3\n"
            + "move 1 from 8 to 5\n"
            + "move 3 from 8 to 2\n"
            + "move 2 from 2 to 4\n"
            + "move 27 from 9 to 7\n"
            + "move 2 from 3 to 2\n"
            + "move 1 from 5 to 2\n"
            + "move 18 from 7 to 5\n"
            + "move 1 from 3 to 2\n"
            + "move 1 from 5 to 6\n"
            + "move 18 from 5 to 3\n"
            + "move 1 from 6 to 3\n"
            + "move 2 from 9 to 5\n"
            + "move 10 from 3 to 5\n"
            + "move 4 from 3 to 6\n"
            + "move 1 from 7 to 1\n"
            + "move 1 from 5 to 1\n"
            + "move 6 from 7 to 6\n"
            + "move 1 from 6 to 2\n"
            + "move 4 from 4 to 8\n"
            + "move 5 from 5 to 4\n"
            + "move 1 from 3 to 8\n"
            + "move 2 from 1 to 8\n"
            + "move 2 from 2 to 5\n"
            + "move 3 from 3 to 8\n"
            + "move 6 from 8 to 2\n"
            + "move 1 from 3 to 9\n"
            + "move 1 from 6 to 3\n"
            + "move 6 from 2 to 8\n"
            + "move 7 from 8 to 4\n"
            + "move 8 from 5 to 2\n"
            + "move 5 from 4 to 6\n"
            + "move 2 from 8 to 3\n"
            + "move 2 from 3 to 9\n"
            + "move 1 from 3 to 9\n"
            + "move 2 from 7 to 1\n"
            + "move 2 from 1 to 2\n"
            + "move 12 from 2 to 4\n"
            + "move 1 from 9 to 7\n"
            + "move 1 from 6 to 2\n"
            + "move 9 from 7 to 9\n"
            + "move 1 from 8 to 2\n"
            + "move 9 from 9 to 8\n"
            + "move 6 from 7 to 8\n"
            + "move 4 from 4 to 1\n"
            + "move 6 from 2 to 5\n"
            + "move 1 from 4 to 9\n"
            + "move 3 from 1 to 9\n"
            + "move 6 from 4 to 5\n"
            + "move 5 from 8 to 9\n"
            + "move 8 from 4 to 6\n"
            + "move 3 from 9 to 8\n"
            + "move 1 from 9 to 3\n"
            + "move 3 from 8 to 3\n"
            + "move 5 from 9 to 2\n"
            + "move 3 from 2 to 6\n"
            + "move 3 from 6 to 9\n"
            + "move 3 from 6 to 2\n"
            + "move 4 from 2 to 6\n"
            + "move 6 from 9 to 7\n"
            + "move 1 from 1 to 8\n"
            + "move 8 from 8 to 5\n"
            + "move 20 from 5 to 3\n"
            + "move 2 from 2 to 8\n"
            + "move 6 from 7 to 1\n"
            + "move 10 from 6 to 3\n"
            + "move 4 from 6 to 7\n"
            + "move 4 from 1 to 9\n"
            + "move 2 from 1 to 2\n"
            + "move 3 from 6 to 9\n"
            + "move 5 from 8 to 3\n"
            + "move 3 from 7 to 9\n"
            + "move 17 from 3 to 2\n"
            + "move 1 from 6 to 2\n"
            + "move 2 from 6 to 9\n"
            + "move 1 from 6 to 4\n"
            + "move 12 from 9 to 2\n"
            + "move 1 from 4 to 7\n"
            + "move 8 from 3 to 8\n"
            + "move 8 from 8 to 9\n"
            + "move 7 from 9 to 2\n"
            + "move 1 from 9 to 7\n"
            + "move 18 from 2 to 9\n"
            + "move 1 from 7 to 2\n"
            + "move 2 from 7 to 1\n"
            + "move 1 from 1 to 2\n"
            + "move 4 from 2 to 7\n"
            + "move 15 from 9 to 3\n"
            + "move 1 from 9 to 1\n"
            + "move 2 from 1 to 8\n"
            + "move 6 from 2 to 4\n"
            + "move 8 from 2 to 1\n"
            + "move 2 from 8 to 5\n"
            + "move 2 from 9 to 3\n"
            + "move 4 from 4 to 1\n"
            + "move 2 from 5 to 8\n"
            + "move 2 from 8 to 9\n"
            + "move 14 from 3 to 1\n"
            + "move 2 from 9 to 7\n"
            + "move 2 from 4 to 3\n"
            + "move 1 from 2 to 9\n"
            + "move 5 from 7 to 9\n"
            + "move 21 from 1 to 9\n"
            + "move 2 from 1 to 6\n"
            + "move 3 from 2 to 4\n"
            + "move 1 from 7 to 3\n"
            + "move 19 from 9 to 5\n"
            + "move 1 from 2 to 7\n"
            + "move 1 from 7 to 2\n"
            + "move 3 from 4 to 2\n"
            + "move 19 from 5 to 7\n"
            + "move 2 from 2 to 5\n"
            + "move 1 from 5 to 3\n"
            + "move 1 from 3 to 4\n"
            + "move 8 from 9 to 4\n"
            + "move 1 from 6 to 3\n"
            + "move 1 from 2 to 6\n"
            + "move 1 from 2 to 1\n"
            + "move 8 from 7 to 3\n"
            + "move 5 from 4 to 7\n"
            + "move 2 from 6 to 4\n"
            + "move 1 from 5 to 9\n"
            + "move 1 from 1 to 6\n"
            + "move 1 from 1 to 2\n"
            + "move 2 from 4 to 7\n"
            + "move 1 from 4 to 2\n"
            + "move 2 from 4 to 9\n"
            + "move 1 from 6 to 8\n"
            + "move 1 from 1 to 5\n"
            + "move 1 from 8 to 6\n"
            + "move 1 from 1 to 4\n"
            + "move 25 from 3 to 1\n"
            + "move 1 from 4 to 2\n"
            + "move 2 from 3 to 6\n"
            + "move 3 from 1 to 9\n"
            + "move 6 from 9 to 8\n"
            + "move 1 from 6 to 3\n"
            + "move 1 from 2 to 9\n"
            + "move 15 from 7 to 6\n"
            + "move 2 from 2 to 6\n"
            + "move 1 from 3 to 8\n"
            + "move 1 from 1 to 4\n"
            + "move 6 from 8 to 4\n"
            + "move 1 from 3 to 8\n"
            + "move 1 from 8 to 5\n"
            + "move 2 from 5 to 2\n"
            + "move 8 from 6 to 7\n"
            + "move 1 from 8 to 7\n"
            + "move 1 from 9 to 4\n"
            + "move 9 from 4 to 5\n"
            + "move 19 from 1 to 3\n"
            + "move 9 from 3 to 5\n"
            + "move 6 from 7 to 2\n"
            + "move 2 from 1 to 7\n"
            + "move 7 from 2 to 4\n"
            + "move 7 from 5 to 6\n"
            + "move 5 from 4 to 3\n"
            + "move 3 from 5 to 8\n"
            + "move 1 from 2 to 4\n"
            + "move 2 from 4 to 8\n"
            + "move 14 from 6 to 1\n"
            + "move 6 from 5 to 6\n"
            + "move 1 from 5 to 2\n"
            + "move 7 from 1 to 6\n"
            + "move 1 from 2 to 4\n"
            + "move 4 from 6 to 4\n"
            + "move 1 from 5 to 4\n"
            + "move 2 from 1 to 9\n"
            + "move 2 from 9 to 4\n"
            + "move 2 from 1 to 8\n"
            + "move 9 from 3 to 6\n"
            + "move 3 from 7 to 4\n"
            + "move 4 from 8 to 6\n"
            + "move 3 from 7 to 6\n"
            + "move 1 from 7 to 2\n"
            + "move 1 from 7 to 5\n"
            + "move 3 from 8 to 4\n"
            + "move 26 from 6 to 1\n"
            + "move 8 from 1 to 2\n"
            + "move 1 from 6 to 4\n"
            + "move 5 from 2 to 7\n"
            + "move 2 from 2 to 4\n"
            + "move 10 from 4 to 7\n"
            + "move 1 from 6 to 1\n"
            + "move 22 from 1 to 2\n"
            + "move 1 from 6 to 1\n"
            + "move 6 from 4 to 7\n"
            + "move 1 from 5 to 1\n"
            + "move 1 from 1 to 2\n"
            + "move 21 from 7 to 2\n"
            + "move 38 from 2 to 3\n"
            + "move 8 from 2 to 6\n"
            + "move 2 from 4 to 8\n"
            + "move 2 from 8 to 2\n"
            + "move 1 from 1 to 3\n"
            + "move 1 from 2 to 8\n"
            + "move 1 from 2 to 5\n"
            + "move 6 from 6 to 4\n"
            + "move 2 from 4 to 2\n"
            + "move 2 from 2 to 6\n"
            + "move 1 from 8 to 2\n"
            + "move 28 from 3 to 1\n"
            + "move 11 from 1 to 2\n"
            + "move 8 from 1 to 7\n"
            + "move 4 from 6 to 4\n"
            + "move 8 from 3 to 1\n"
            + "move 8 from 2 to 5\n"
            + "move 6 from 5 to 4\n"
            + "move 2 from 5 to 4\n"
            + "move 8 from 3 to 4\n"
            + "move 22 from 4 to 1\n"
            + "move 2 from 3 to 5\n"
            + "move 33 from 1 to 5\n"
            + "move 26 from 5 to 6\n"
            + "move 4 from 5 to 7\n"
            + "move 2 from 2 to 7\n"
            + "move 2 from 7 to 2\n"
            + "move 2 from 7 to 8\n"
            + "move 2 from 8 to 3\n"
            + "move 6 from 1 to 3\n"
            + "move 5 from 5 to 1\n"
            + "move 1 from 5 to 7\n"
            + "move 7 from 7 to 5\n"
            + "move 4 from 5 to 6\n"
            + "move 5 from 1 to 8\n"
            + "move 4 from 2 to 4\n"
            + "move 2 from 7 to 4\n"
            + "move 2 from 7 to 3\n"
            + "move 5 from 4 to 6\n"
            + "move 1 from 8 to 2\n"
            + "move 1 from 2 to 4\n"
            + "move 10 from 3 to 6\n"
            + "move 44 from 6 to 9\n"
            + "move 2 from 5 to 7\n"
            + "move 1 from 5 to 8\n"
            + "move 41 from 9 to 1\n"
            + "move 1 from 6 to 4\n"
            + "move 2 from 8 to 1\n"
            + "move 1 from 7 to 3\n"
            + "move 1 from 3 to 8\n"
            + "move 2 from 9 to 8\n"
            + "move 29 from 1 to 9\n"
            + "move 2 from 1 to 5\n"
            + "move 2 from 8 to 3\n"
            + "move 1 from 3 to 5\n"
            + "move 2 from 5 to 9\n"
            + "move 1 from 5 to 7\n"
            + "move 25 from 9 to 2\n"
            + "move 10 from 2 to 1\n"
            + "move 1 from 7 to 8\n"
            + "move 2 from 4 to 1\n"
            + "move 2 from 8 to 9\n"
            + "move 1 from 8 to 6\n"
            + "move 4 from 2 to 4\n"
            + "move 4 from 2 to 5\n"
            + "move 1 from 6 to 5\n"
            + "move 1 from 2 to 7\n"
            + "move 2 from 4 to 1\n"
            + "move 18 from 1 to 3\n"
            + "move 8 from 9 to 4\n"
            + "move 15 from 3 to 9\n"
            + "move 3 from 4 to 8\n"
            + "move 4 from 5 to 8\n"
            + "move 4 from 2 to 4\n"
            + "move 10 from 9 to 4\n"
            + "move 4 from 8 to 5\n"
            + "move 2 from 7 to 2\n"
            + "move 11 from 4 to 9\n"
            + "move 12 from 4 to 9\n"
            + "move 2 from 5 to 7\n"
            + "move 4 from 2 to 4\n"
            + "move 5 from 8 to 1\n"
            + "move 1 from 5 to 6\n"
            + "move 1 from 4 to 6\n"
            + "move 1 from 3 to 9\n"
            + "move 1 from 5 to 7\n"
            + "move 4 from 1 to 6\n"
            + "move 6 from 1 to 5\n"
            + "move 6 from 5 to 9\n"
            + "move 3 from 7 to 6\n"
            + "move 9 from 6 to 5\n"
            + "move 8 from 5 to 2\n"
            + "move 7 from 2 to 3\n"
            + "move 1 from 3 to 1\n"
            + "move 7 from 3 to 5\n"
            + "move 2 from 4 to 1\n"
            + "move 1 from 2 to 6\n"
            + "move 2 from 1 to 3\n"
            + "move 8 from 5 to 9\n"
            + "move 3 from 1 to 3\n"
            + "move 1 from 6 to 1\n"
            + "move 2 from 4 to 1\n"
            + "move 1 from 5 to 2\n"
            + "move 2 from 1 to 6\n"
            + "move 2 from 6 to 3\n"
            + "move 2 from 3 to 2\n"
            + "move 2 from 2 to 4\n"
            + "move 1 from 2 to 6\n"
            + "move 3 from 3 to 9\n"
            + "move 2 from 4 to 8\n"
            + "move 3 from 3 to 1\n"
            + "move 4 from 1 to 7\n"
            + "move 2 from 8 to 4\n"
            + "move 7 from 9 to 6\n"
            + "move 1 from 1 to 4\n"
            + "move 11 from 9 to 7\n"
            + "move 3 from 9 to 3\n"
            + "move 14 from 9 to 5\n"
            + "move 6 from 6 to 5\n"
            + "move 4 from 5 to 9\n"
            + "move 10 from 7 to 6\n"
            + "move 1 from 3 to 7\n"
            + "move 2 from 4 to 1\n"
            + "move 4 from 7 to 9\n"
            + "move 9 from 6 to 1\n"
            + "move 3 from 6 to 5\n"
            + "move 15 from 9 to 1\n"
            + "move 1 from 4 to 7\n"
            + "move 4 from 9 to 7\n"
            + "move 12 from 5 to 1\n"
            + "move 3 from 7 to 3\n"
            + "move 4 from 7 to 2\n"
            + "move 1 from 9 to 3\n"
            + "move 22 from 1 to 2\n"
            + "move 21 from 2 to 6\n"
            + "move 3 from 1 to 9\n"
            + "move 1 from 3 to 7\n"
            + "move 1 from 7 to 3\n"
            + "move 1 from 3 to 2\n"
            + "move 8 from 1 to 4\n"
            + "move 1 from 9 to 2\n"
            + "move 7 from 4 to 8\n"
            + "move 3 from 3 to 9\n"
            + "move 3 from 3 to 5\n"
            + "move 4 from 2 to 3\n"
            + "move 1 from 1 to 3\n"
            + "move 4 from 8 to 5\n"
            + "move 2 from 8 to 3\n"
            + "move 5 from 3 to 2\n"
            + "move 6 from 5 to 3\n"
            + "move 2 from 5 to 8\n"
            + "move 2 from 1 to 7\n"
            + "move 2 from 7 to 4\n"
            + "move 15 from 6 to 9\n"
            + "move 8 from 3 to 1\n"
            + "move 3 from 5 to 9\n"
            + "move 2 from 4 to 9\n"
            + "move 8 from 1 to 3\n"
            + "move 8 from 9 to 8\n"
            + "move 1 from 1 to 4\n"
            + "move 3 from 5 to 9\n"
            + "move 4 from 8 to 1\n"
            + "move 1 from 3 to 9\n"
            + "move 2 from 4 to 3\n"
            + "move 2 from 8 to 6\n"
            + "move 3 from 8 to 7\n"
            + "move 8 from 2 to 5\n"
            + "move 3 from 5 to 2\n"
            + "move 4 from 3 to 4\n"
            + "move 3 from 6 to 1\n"
            + "move 2 from 5 to 9\n"
            + "move 4 from 4 to 1\n"
            + "move 2 from 5 to 6\n"
            + "move 1 from 5 to 4\n"
            + "move 2 from 2 to 1\n"
            + "move 4 from 3 to 9\n"
            + "move 1 from 7 to 3\n"
            + "move 2 from 7 to 4\n"
            + "move 2 from 4 to 7\n"
            + "move 1 from 6 to 7\n"
            + "move 1 from 2 to 8\n"
            + "move 2 from 3 to 9\n"
            + "move 14 from 1 to 8\n"
            + "move 1 from 6 to 2\n"
            + "move 2 from 7 to 1\n"
            + "move 3 from 8 to 3\n"
            + "move 6 from 8 to 5";
    multipleStack = dummy.browseContent2(multipleStack,content);
    assertTrue(true);

  }
}
