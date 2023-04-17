
// работа с файлами
// чтение из файла посимвольно
import java.io.*;
public class readFileSymbols {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }

    // чтение файла построчно
        // import java.io.*;
        // public class Program {
            //public static void main(String[] args) throws Exception {
                // BufferedReader br = new BufferedReader(new FileReader("file.txt"));
                // String str;
                // while ((str = br.readLine()) != null) {
                   // System.out.printf("== %s ==\n", str);
                // }
                // br.close();
            // }
        // }
    }
}