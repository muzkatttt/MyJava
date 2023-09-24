package sem2.task4;

import java.io.*;

public class Task4 {
    /* код с семинара
        public static void main(String[] args) {
            InputStream inputStream;
            try {
                String[] strings = {"asdf", "asdf"};
                String strings1 = strings[2];
                test();
                int a = 1 / 0;
                inputStream = new FileInputStream("sdafgdsaf");
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            } catch (StackOverflowError error) {
                System.out.println("asdfasdfdsa");
            } finally {
                System.out.println("Я все равно выполнился!");
            }
            System.out.println("Я жив!");
        }

        public static void test() throws IOException {
            File file = new File("1");
            file.createNewFile();
            FileReader reader = new FileReader(file);
            reader.read();
            test();
        }

     */

    /*
    File file = new File(filePath);

        if (file.exists()) {
            System.out.println("Файл существует.");
        } else {
            System.out.println("Файл не существует.");
        }
     */
        public static void main(String[] args) {
            InputStream inputStream;
            try {
                String[] strings = {"asdf", "asdf"};
                if (2 < strings.length) {
                    String strings1 = strings[2];
                }
                test();

                int badNumber = 0;

                if (badNumber != 0) {
                    int a = 1 / badNumber;
                }

                File file = new File("sdafgdsaf");
                if (file.exists()) {
                    inputStream = new FileInputStream("sdafgdsaf");
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Я все равно выполнился!");
            }
            System.out.println("Я жив!");
        }

        public static void test() throws IOException {
            File file = new File("1");
            file.createNewFile();
            FileReader reader = new FileReader(file);
            reader.read();
//        test();
        }
    }

