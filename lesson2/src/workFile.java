
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class workFile {
    {
        public static void main (String[]args){
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
        // /Users/sk/vscode/java_projects/file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
    }
        // обработка ошибок с помощью блока try - catch - finally
        public static void tryErr (String[]args){
        try {
            // в блоке try указываем потенциальную ошибку
            String pathProject = System.getProperty("user.dir");  // прописываем путь к текущей папке с проектом
            String pathFile = pathProject.concat("/file.txt"); // указываем конкретный файл
            //связываем переменную f3 с папкой по текущему пути
            File f3 = new File(pathFile);
            System.out.println("try");
            // в блоке catch указываем, как реагировать на исключение
        } catch (Exception e) {
            System.out.println("catch");
        }
        // в блоке finally - будет выполнен в любом случае
        finally {
            System.out.println("finally");
        }
    }
        // создание файла
        // импортируем import java.io.FileReader; и import java.io.BufferedReader;
        String line = "empty";
        try {
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                BufferedReader bufReader =
                        new BufferedReader(new FileReader(file));
                System.out.println("file.existed");
                line = bufReader.readLine();
                bufReader.close();
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
        } finally {
        System.out.println(line);
    }

    /*
    // методы работы с файлами
    isHidden(): возвращает истину, если каталог или файл является скрытым
    length(): возвращает размер файла в байтах
    lastModified(): возвращает время последнего изменения файла или каталога
    list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
    listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
    mkdir(): создает новый каталог
    renameTo(File dest): переименовывает файл или каталог

     */
}