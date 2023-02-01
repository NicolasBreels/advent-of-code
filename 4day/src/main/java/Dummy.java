import java.util.Arrays;
import java.util.List;

public class Dummy {
    public String hello() {
        return "Hello World!";
    }

    public boolean isFullyContain(int pair1Init, int pair1End, int pair2Init, int pair2End) {
        if ((pair1Init <= pair2Init & pair1End >= pair2End) | (pair1Init >= pair2Init & pair1End <= pair2End)) {
            return true;
        } else {
            return false;
        }
    }

    public int browseContent(String content) {
        List<String> contentList = Arrays.asList(content.split("\n"));
        int count = 0;
        for (String sentence : contentList) {
            List<String> sentenceList = Arrays.asList(sentence.split(","));
            String part1 = sentenceList.get(0);
            List<String> part1List = Arrays.asList(part1.split("-"));
            String part2 = sentenceList.get(1);
            List<String> part2List = Arrays.asList(part2.split("-"));

            int pair1Init = Integer.parseInt(part1List.get(0));
            int pair1End = Integer.parseInt(part1List.get(1));
            int pair2Init = Integer.parseInt(part2List.get(0));
            int pair2End = Integer.parseInt(part2List.get(1));
            if (isFullyContain(pair1Init, pair1End, pair2Init, pair2End)) {
                count = count + 1;
            }
        }
        return count;
    }

    public int browseContent2(String content) {
        List<String> contentList = Arrays.asList(content.split("\n"));
        int count = 0;
        for (String sentence : contentList) {
            List<String> sentenceList = Arrays.asList(sentence.split(","));
            String part1 = sentenceList.get(0);
            List<String> part1List = Arrays.asList(part1.split("-"));
            String part2 = sentenceList.get(1);
            List<String> part2List = Arrays.asList(part2.split("-"));

            int pair1Init = Integer.parseInt(part1List.get(0));
            int pair1End = Integer.parseInt(part1List.get(1));
            int pair2Init = Integer.parseInt(part2List.get(0));
            int pair2End = Integer.parseInt(part2List.get(1));
            if (isOverLap(pair1Init, pair1End, pair2Init, pair2End)) {
                count = count + 1;
            }
        }
        return count;
    }

    public boolean isOverLap(int pair1Init, int pair1End, int pair2Init, int pair2End) {
        if ((pair1Init >= pair2Init & pair1Init <= pair2End) | (pair1End >= pair2Init & pair1End <= pair2End) | (pair2Init >= pair1Init & pair2Init <= pair1End) | (pair2End >= pair1Init & pair2End <= pair1End)) {
            return true;
        } else {
            return false;
        }
    }
}
