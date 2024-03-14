import models.*;

public class Main {
    public static void main(String[] args) {
        Folder home = new Folder("home");
        Folder users = home.createSubFolder("Users");
        Folder work = home.createSubFolder("Work");
        Folder word = work.createSubFolder("Word");
        File homework = new File("Homework", "docx", 400);
        word.addFile(homework);
    }
}
