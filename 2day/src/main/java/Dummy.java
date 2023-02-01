import java.util.Arrays;
import java.util.List;

public class Dummy {
    private final String rock = "A";
    private final String paper = "B";
    private final String scisor = "C";

    public String hello() {
        return "Hello World!";
    }

    public int oldCompareHand(String adverser, String me) {
        if (adverser.equals(rock) & me.equals("X")) {
            return 3;
        } else if (adverser.equals(paper) & me.equals("Y")) {
            return 3;
        } else if (adverser.equals(scisor) & me.equals("Z")) {
            return 3;
        } else if (adverser.equals(rock) & me.equals("Y")) {
            return 6;
        } else if (adverser.equals(paper) & me.equals("Z")) {
            return 6;
        } else if (adverser.equals(scisor) & me.equals("X")) {
            return 6;
        } else {
            return 0;
        }
    }

    public int newCompareHand(String adverser, String me) {
        if (adverser.equals(rock) & me.equals(rock)) {
            return 3;
        } else if (adverser.equals(paper) & me.equals(paper)) {
            return 3;
        } else if (adverser.equals(scisor) & me.equals(scisor)) {
            return 3;
        } else if (adverser.equals(rock) & me.equals(paper)) {
            return 6;
        } else if (adverser.equals(paper) & me.equals(scisor)) {
            return 6;
        } else if (adverser.equals(scisor) & me.equals(rock)) {
            return 6;
        } else {
            return 0;
        }
    }


    public int calculateFight(String fightFile) {
        List<String> fightList = Arrays.asList(fightFile.split("\n"));
        int count = 0;
        for (String fight : fightList) {
            List<String> divise = Arrays.asList(fight.split(" "));
            String adverser = divise.get(0);
            String me = divise.get(1);
            int handPoint = 0;
            if (me.equals("X")) {
                handPoint = 1;
            }
            if (me.equals("Y")) {
                handPoint = 2;
            }
            if (me.equals("Z")) {
                handPoint = 3;
            }
            count = count + handPoint + oldCompareHand(adverser, me);
        }
        return count;
    }

    public int calculatenewFight(String fightFile) {
        List<String> fightList = Arrays.asList(fightFile.split("\n"));
        int count = 0;
        for (String fight : fightList) {
            List<String> divise = Arrays.asList(fight.split(" "));
            String adverser = divise.get(0);
            String me = divise.get(1);
            int handPoint = 0;
            if (me.equals("X") & adverser.equals("A")) {
                me = scisor;
            }
            if (me.equals("X") & adverser.equals("B")) {
                me = rock;
            }
            if (me.equals("X") & adverser.equals("C")) {
                me = paper;
            }

            if (me.equals("Y")) {
                me = adverser;
            }

            if (me.equals("Z") & adverser.equals("A"))
                me = paper;
            if (me.equals("Z") & adverser.equals("B"))
                me = scisor;
            if (me.equals("Z") & adverser.equals("C"))
                me = rock;

            if (me.equals(rock)) {
                handPoint = 1;
            }
            if (me.equals(paper)) {
                handPoint = 2;
            }
            if (me.equals(scisor)) {
                handPoint = 3;
            }
            count = count + handPoint + newCompareHand(adverser, me);
        }
        return count;
    }
}
