import View.MenuStudent;
import valiDateStudent.readAndWriteFile;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MenuStudent menu = new MenuStudent();
         menu.showMainMenu();
         readAndWriteFile readAndWriteFile = new readAndWriteFile();
         readAndWriteFile.readFile();
    }
}