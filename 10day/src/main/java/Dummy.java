import java.util.Arrays;
import java.util.List;

public class Dummy {

    private int init = 1;
    private int countCycle = 0;
    private int count = 0;

    public int add(int x) {
        init += x;
        return init;
    }

    public int incrementCycle() {
        this.countCycle++;
        return this.countCycle;
    }

    private boolean checkCycle() {
        if (countCycle == 20) {
            return true;
        } else if ((countCycle - 20) % 40 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void incrementAndVerifySignalStenght() {
        incrementCycle();
        if (checkCycle()) {
            System.out.println(countCycle + "th cycle. Sum = " + init * countCycle);
            count = count + init * countCycle;
        }
    }

    public int compute(String entrance) {
        List<String> docs = Arrays.asList(entrance.split("\n"));
        for (String doc : docs) {
            List<String> lines = Arrays.asList(doc.split(" "));
            if (lines.get(0).equals("addx")) {
                incrementAndVerifySignalStenght();
                incrementAndVerifySignalStenght();
                add(Integer.parseInt(lines.get(1)));
            } else {
                incrementAndVerifySignalStenght();
            }
        }
        System.out.println(count);
        return count;
    }
}
