package lesson3;

import java.io.*;

public class Exception3 {
    public static void main(String args[]) {

    /* пример из презентации
        FileReader reader = null;
        try {
            reader = new FileReader(new
                    File("file.txt"));
// Полезная работа, связанная с чтением файла..
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
     */
//     если переписать код с помощью try-with-resources - в круглых скобках после блока try указыается
//     создаваемый ресурс, который будет закрыт при выходе из блока try, b код будет компактнее:
        try (FileReader test = new FileReader("file.txt")) {
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }

//    если требуется создать два объекта в блоке try, то они перечисляются через ;
        try (FileReader reader = new FileReader("names.txt");
             FileWriter writer = new FileWriter("names2.txt")) {
            // копируем данные из одного файла в другой
            while( reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("copy successfully");

//    блок try можно оформлять и таким образом:
        try {
            System.out.println("test operation");
        } finally {
            System.out.println("finally operation");
        }
//    пример ниже вызовет ошибку
//    try (Box box = new Box()) {
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    перепишем код и добавим класс Box
//    public static void main(String[] args) {
//        try (Box box = new Box()) {
//        } catch (Exception e) {
//            e.printStackTrace();
//        } }
//}
//    public class Box implements AutoCloseable {
//        @Override
//        public void close() throws Exception { // Закрываем коробку
//        } }

//    public class ReportExporter {
//        public void saveReportToFile(String path, String
//                data) {
//            String modifiedOutputData = data; // Представим,
//            что здесь форматируются входные данные
//            {
//                try (PrintWriter writer = new PrintWriter(path))
//                writer.println(modifiedOutputData);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//    public void onSaveReportButtonClick() {
//        String path = generateOutputReportPath();
//        String outputData = "Очень важные данные для
//        отчета";
//        ReportExporter reportExporter = new
//                ReportExporter();
//        try {
//            reportExporter.saveReportToFile(path,
//                    outputData);
//        } catch (IOException e) { JOptionPane.showMessageDialog(null, "Ошибка!
//                Невозможно сохранить отчет", "Ошибка!", JOptionPane.ERROR_MESSAGE);
//        } }
//// ...
//}
        //JOptionPane.showMessageDialog() показывает окно с сообщением об ошибке.

//    public void saveReportToFile(String path, String data)
//            throws IOException {
//        String modifiedOutputData = data; // Представим, что здесь форматируются входные данные
//        try (PrintWriter writer = new PrintWriter(path)) {
//            writer.println(modifiedOutputData);
//        }
//    } }

        // пример с импортом файлов
// ...
//        try {
//            CvImage img =
//                    cvLib.loadImage("C:/image.png");
//            cvLib.filters().blur(img, 2);
//        } catch (IllegalImageFormatException e) {
//            System.out.println("Выбрано изображение с неподдерживаемым форматом, выберите другой файл");
//        } catch (IllegalFilterParametersException e) {
//            System.out.println("Выбраны некорректные параметры фильтра");
//        } catch (JavaCVException e) {
//            System.out.println("Ой");
//        }
//    }
    }
}