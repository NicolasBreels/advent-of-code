import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Dummy {
    public String hello() {
        return "Hello World!";
    }

    public void adding_content(String content, Directory currentDir) {
        List<String> sentence = Arrays.asList(content.split(" "));
        if (sentence.get(0).equals("dir")) {
            currentDir.add(sentence.get(1), currentDir);
        } else {
            currentDir.add(sentence.get(1), Integer.parseInt(sentence.get(0)));
        }
    }


    public void browseContent(String content, Directory currentDir) {
        List<String> contentList = Arrays.asList(content.split("\n"));
        for (String sentence : contentList) {
            if (sentence.contains("$ cd") & !sentence.contains("..")) {
                List<String> newsentence = Arrays.asList(sentence.split(" "));
                currentDir = currentDir.getDir(newsentence.get(2));
            } else if (sentence.contains("$ cd") & sentence.contains("..")) {
                currentDir = currentDir.parent;
            } else {
                if (sentence.contains("$ ls")) {
                    continue;
                } else {
                    adding_content(sentence, currentDir);
                }
            }
        }
    }

    public long display_dir(Directory currentDir) {
        long count = 0;
        for(Directory childDir : currentDir.directories){
            if(childDir.getSize() <= 100000l){
                count = count + childDir.getSize();
            }
            else {
                count = count + display_dir(childDir);
            }
        }
        System.out.println(currentDir.name + count);

        return count;
    }


}
