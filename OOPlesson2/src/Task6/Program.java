package Task6;

import Task6.Applications.Notepad;
import Task6.Format.*;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("привет");
        notes.currentDocument().addAllText("здравствуйте");
        notes.currentDocument().addAllText("какой-то текст еще");
        notes.SaveAs("file10", new Txt());
        notes.SaveAs("file11", new Md());
        notes.SaveAs("file12", new Doc());
        System.out.println(notes.toString());



    }
}
