import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static java.lang.String.valueOf;

public class Dummy {
    public String hello() {
        return "Hello World!";

    }

    public MultipleStack next(MultipleStack multipleStack, int move, int from, int to) {
        for (int i = 1; i <= move; i++) {
            String oldStackString = "stack_" + valueOf(from);
            Stack<String> oldStack = multipleStack.getStack(oldStackString);
            String newStackString = "stack_" + valueOf(to);
            Stack<String> newStack = multipleStack.getStack(newStackString);
            String newString = oldStack.pop();
            newStack.push(newString);
        }
        return multipleStack;
    }

    public MultipleStack next2(MultipleStack multipleStack, int move, int from, int to) {

        String oldStackString = "stack_" + valueOf(from);
        Stack<String> oldStack = multipleStack.getStack(oldStackString);
        String newStackString = "stack_" + valueOf(to);
        Stack<String> newStack = multipleStack.getStack(newStackString);

//        if (oldStack.size() == move) {
//            Stack<String> temp = new Stack<>();
//            while (!oldStack.isEmpty()) {
//                String newString = oldStack.pop();
//                temp.push(newString);
//            }
//            while (!temp.isEmpty()) {
//                String newString = temp.pop();
//                newStack.push(newString);
//            }
//        } else {
//            for (int i = 1; i <= move; i++) {
//                String newString = oldStack.pop();
//                newStack.push(newString);
//            }
//        }
        Stack<String> temp = new Stack<>();
        for (int i = 1; i<=move; i++){
            String newString = oldStack.pop();
            temp.push(newString);
        }
        for (int i = 1; i<=move; i++){
            String newString = temp.pop();
            newStack.push(newString);
        }

        return multipleStack;
    }

    public MultipleStack browseContent(MultipleStack multipleStack, String content) {
        List<String> contentList = Arrays.asList(content.split("\n"));
        for (String sentence : contentList) {
            List<String> sentenceList = Arrays.asList(sentence.split(" "));
            int move = Integer.parseInt(sentenceList.get(1));
            int from = Integer.parseInt(sentenceList.get(3));
            int to = Integer.parseInt(sentenceList.get(5));

            multipleStack = next(multipleStack, move, from, to);
        }
        System.out.println(multipleStack.stack_1.peek());
        System.out.println(multipleStack.stack_2.peek());
        System.out.println(multipleStack.stack_3.peek());
        System.out.println(multipleStack.stack_4.peek());
        System.out.println(multipleStack.stack_5.peek());
        System.out.println(multipleStack.stack_6.peek());
        System.out.println(multipleStack.stack_7.peek());
        System.out.println(multipleStack.stack_8.peek());
        System.out.println(multipleStack.stack_9.peek());
        return multipleStack;

    }

    public MultipleStack browseContent2(MultipleStack multipleStack, String content) {
        List<String> contentList = Arrays.asList(content.split("\n"));
        for (String sentence : contentList) {
            List<String> sentenceList = Arrays.asList(sentence.split(" "));
            int move = Integer.parseInt(sentenceList.get(1));
            int from = Integer.parseInt(sentenceList.get(3));
            int to = Integer.parseInt(sentenceList.get(5));

            multipleStack = next2(multipleStack, move, from, to);
        }
        System.out.println(multipleStack.stack_1.peek());
        System.out.println(multipleStack.stack_2.peek());
        System.out.println(multipleStack.stack_3.peek());
        System.out.println(multipleStack.stack_4.peek());
        System.out.println(multipleStack.stack_5.peek());
        System.out.println(multipleStack.stack_6.peek());
        System.out.println(multipleStack.stack_7.peek());
        System.out.println(multipleStack.stack_8.peek());
        System.out.println(multipleStack.stack_9.peek());
        return multipleStack;

    }


    public static class MultipleStack {
        Stack<String> stack_1;
        Stack<String> stack_2;
        Stack<String> stack_3;
        Stack<String> stack_4;
        Stack<String> stack_5;
        Stack<String> stack_6;
        Stack<String> stack_7;
        Stack<String> stack_8;
        Stack<String> stack_9;

        public Stack<String> getStack(String s) {
            if (s.equals("stack_1")) {
                return this.stack_1;
            }
            if (s.equals("stack_2")) {
                return this.stack_2;
            }
            if (s.equals("stack_3")) {
                return this.stack_3;
            }
            if (s.equals("stack_4")) {
                return this.stack_4;
            }
            if (s.equals("stack_5")) {
                return this.stack_5;
            }
            if (s.equals("stack_6")) {
                return this.stack_6;
            }
            if (s.equals("stack_7")) {
                return this.stack_7;
            }
            if (s.equals("stack_8")) {
                return this.stack_8;
            } else {
                return this.stack_9;
            }
        }

        public MultipleStack(Stack<String> stack_1,
                             Stack<String> stack_2,
                             Stack<String> stack_3,
                             Stack<String> stack_4,
                             Stack<String> stack_5,
                             Stack<String> stack_6,
                             Stack<String> stack_7,
                             Stack<String> stack_8,
                             Stack<String> stack_9) {
            this.stack_1 = stack_1;
            this.stack_2 = stack_2;
            this.stack_3 = stack_3;
            this.stack_4 = stack_4;
            this.stack_5 = stack_5;
            this.stack_6 = stack_6;
            this.stack_7 = stack_7;
            this.stack_8 = stack_8;
            this.stack_9 = stack_9;
        }

    }
}
