import java.util.Arrays;
import java.util.List;

public class Dummy {
    public String hello() {
        return "Hello World!";
    }

    public boolean verifyCaracter(String A, String B, String C, String D) {
        if (!A.equals(B) & !A.equals(C) & !A.equals(D) & !B.equals(C) & !B.equals(D) & !C.equals(D)) {
            return true;
        } else {
            return false;
        }
    }

    public int browseContent(String content) {
        List<String> contentList = Arrays.asList(content.split(""));
        int i = 0;
        for (String sentence : contentList) {
            if (verifyCaracter(sentence, contentList.get(i + 1), contentList.get(i + 2), contentList.get(i + 3))) {
                return i + 4;
            }
            i++;
        }
        return 0;
    }

    public int browseContent2(String content, int nbr) {
        List<String> contentList = Arrays.asList(content.split(""));
        for (int i =0 ; i < contentList.size(); i++) {
            if (verifyCaracter2(contentList, i, nbr)) {
                return i + nbr ;
            }
        }
        return 0;
    }

    public boolean verifyCaracter2(List<String> contentList, int index, int nbr) {
        for (int j = index; j <= index + nbr; j++) {
            int k = j;
            while (k < index + nbr) {
                if (contentList.get(k).equals(contentList.get(j)) & k != j) {
                    return false;
                }
                k = k + 1;
            }
        }
        return true;
    }
}



