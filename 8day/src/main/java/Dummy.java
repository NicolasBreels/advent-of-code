import java.util.Arrays;
import java.util.List;

public class Dummy {
    public int[][] parseContent(String content) {
        List<String> contentList = Arrays.asList(content.split("\n"));
        List<String> firstLine = Arrays.asList(contentList.get(0).split(""));
        int row = contentList.size();
        int column = firstLine.size();
        int[][] tab = new int[row][column];
        int i = 0;
        for (String row_loop : contentList) {
            int j = 0;
            List<String> elem = Arrays.asList(row_loop.split(""));
            for (String column_loop : elem) {
                tab[i][j] = Integer.parseInt(column_loop);
                j++;
            }
            i++;
        }
        return tab;
    }

    public int apply_rule(int[][] tab) {
        int count = (tab[0].length + tab.length) * 2 - 4;
        for (int i = 1; i < tab.length - 1; i++) {
            for (int j = 1; j < tab[0].length - 1; j++) {
                if (isVisible(tab, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isVisible(int[][] tab, int i, int j) {
        return (isVisible(tab, i, j, tab[i][j], "North") | isVisible(tab, i, j, tab[i][j], "South") | isVisible(
                tab, i, j, tab[i][j], "East") | isVisible(tab, i, j, tab[i][j], "West"));
    }

    public boolean isVisible(int[][] tab, int i, int j, int first, String dir) {
        int next_i = i;
        int next_j = j;
        if(dir.equals("North")){
            next_i = i - 1;
        }
        else if(dir.equals("South")){
            next_i = i + 1;
        }
        else if(dir.equals("West")){
            next_j = j - 1;
        }
        else{
            next_j = j + 1;
        }
//        int actual = tab[i][j];
        int previous = tab[next_i][next_j];
        if (previous >= first) {
            return false;
        } else {
            if (next_i == 0 | next_j == 0 | next_i == tab.length - 1 | next_j == tab[0].length - 1 ) {
                return true;
            } else {
                return isVisible(tab, next_i, next_j, first, dir);
            }
        }
    }
}
