import java.util.Arrays;
import java.util.List;

public class Dummy {
    public String hello() {
        return "Hello World!";
    }

    public String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
    public String alphabetMaj = alphabet.toUpperCase();

    public String alphabetConcat = alphabet + " " + alphabetMaj;

    public List<String> alphabetList = Arrays.asList(alphabetConcat.split(" "));

    public int getPrioritize(String l) {
        for (String s : alphabetList) {
            if (s.equals(l)) {
                return alphabetList.indexOf(s) + 1;
            }
        }
        return 0;
    }

    public String getUniqueLetter(String sentence) {
        String part1 = sentence.substring(0, sentence.length() / 2);
        List<String> part1List = Arrays.asList(part1.split(""));
        String part2 = sentence.substring(sentence.length() / 2, sentence.length());
        List<String> part2List = Arrays.asList(part2.split(""));

        for (String singleLetter1 : part1List) {
            for (String singleLetter2 : part2List) {
                if (singleLetter1.equals(singleLetter2)) {
                    return singleLetter1;
                }
            }
        }
        return part1;
    }

    public String getUniqueLetter2(String sentence1, String sentence2, String sentence3) {
        List<String> part1List = Arrays.asList(sentence1.split(""));
        List<String> part2List = Arrays.asList(sentence2.split(""));
        List<String> part3List = Arrays.asList(sentence3.split(""));

        for (String singleLetter1 : part1List) {
            for (String singleLetter2 : part2List) {
                for (String singleLetter3 : part3List) {
                    if (singleLetter1.equals(singleLetter2) & singleLetter1.equals(singleLetter3)) {
                        return singleLetter1;
                    }
                }
            }
        }
        return "";
    }

    public int browseTheContent(String content) {
        List<String> contentList = Arrays.asList(content.split("\n"));
        int total = 0;
        for (String sentence : contentList) {
            String uniqueLetter = getUniqueLetter(sentence);
            total = total + getPrioritize(uniqueLetter);
        }
        return total;
    }

    public int browseTheContent2(String content) {
        List<String> contentList = Arrays.asList(content.split("\n"));
        int total = 0;
        int boucle = 1;
        String sentence1 = "";
        String sentence2 = "";

        int count = 0;
        for (String sentence : contentList) {
//            System.out.println(sentence);
            if (boucle == 1){
                sentence1 = sentence;
            }
            if (boucle == 2){
                System.out.println(sentence);
                sentence2 = sentence;
            }
            if (boucle == 3){
                String uniqueLetter = getUniqueLetter2(sentence1,sentence2,sentence);
                int prioritze = getPrioritize(uniqueLetter);
                count = count + prioritze;
                sentence1 = "";
                sentence2 = "";

                boucle = 0;
            }
            boucle = boucle + 1;
        }
        return count;
    }

}
