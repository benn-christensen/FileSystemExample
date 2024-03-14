package models;

public class File extends FileSystemElement{
    private String extension;
    private int size;
    public File(String name, String extension, int size) {
        super(name);
        this.extension = extension;
        this.size = size;
    }
}
