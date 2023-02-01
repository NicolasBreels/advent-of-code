import java.util.HashSet;
import java.util.Set;


public class Directory {
    String name;
    Set<Directory> directories;
    Set<File> files;
    long size;
    Directory parent;
    long totalSize10;

    public Directory(String name) {
        this.name = name;
        this.directories = new HashSet<>();
        this.files = new HashSet<>();
        this.size = 0;
        this.parent = null;
    }
    public Directory(String name, Directory parent) {
        this.name = name;
        this.directories = new HashSet<>();
        this.files = new HashSet<>();
        this.size = 0;
        this.parent = parent;
    }

    public Directory getDir(String dirName) {
        for (Directory dir : directories) {
            if (dir.name.equals(dirName)) {
                return dir;
            }
        }
        return null;
    }

    public void add(String dirName, Directory parent) {
        this.directories.add(new Directory(dirName, parent));
    }

    public void add(String fileName, int size) {
        this.files.add(new File(fileName, size));
    }

    public long getSize() {
        long subDirSize = 0;
        for (Directory childDirectory : this.directories){
            subDirSize = subDirSize + childDirectory.getSize();
        }
        long currentDirSize = 0;
        for (File currentDirFile : this.files){
            currentDirSize = currentDirSize + currentDirFile.getSize();
        }
        long result = subDirSize + currentDirSize;
        return result;
    }

    public long getTotalSize() {
        long subDirSize = 0;
        for (Directory childDirectory : this.directories){
            subDirSize = subDirSize + childDirectory.getTotalSize();
        }
        long currentDirSize = 0;
        for (File currentDirFile : this.files){
            currentDirSize = currentDirSize + currentDirFile.getSize();
        }
        long result = 2* subDirSize + currentDirSize;
        return result;
    }


}