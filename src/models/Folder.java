package models;

import java.util.ArrayList;

public class Folder extends FileSystemElement {
    private ArrayList<FileSystemElement> elements = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Folder createSubFolder(String name) {
        Folder newFolder = new Folder(name);
        elements.add(newFolder);
        return newFolder;
    }

    public void addFile(File file) {
        elements.add(file);
    }
}
