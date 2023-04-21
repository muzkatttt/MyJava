
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hw_dop {
    public static void main(String[] str) {
        readFile();
    }

    static void readFile(){
        File file = new File("src/fileString.json");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String res = "";
            while (scanner.hasNext()){
                res += scanner.nextLine() + "\n";
            }
            System.out.println(res);
        }
}
