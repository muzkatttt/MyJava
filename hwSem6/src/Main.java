import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
        Реализовать в java.
        Создать множество ноутбуков.
        Написать метод, который будет запрашивать у пользователя критерий (или критерии)
        фильтрации и выведет ноутбуки, отвечающие фильтру.
        Критерии фильтрации можно хранить в Map.
        Например: “Введите цифру, соответствующую необходимому критерию:
        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет …
        Далее нужно запросить минимальные значения для указанных критериев - сохранить
        параметры фильтрации можно также в Map.
        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
        Работу сдать как обычно ссылкой на гит репозиторий
         */

        ListNotebooks listNotebooks = new ListNotebooks();
        ShowNotebooks(listNotebooks.getNotebookList());

        Map<String, String> filters = new HashMap<>();
        //ShowMenu(); // если вызывать без цикла, то меню выводится один раз на консоль

        boolean goOn = true;
        Scanner scanner = new Scanner(System.in);
        while (goOn) {
            ShowMenu();
            System.out.printf("-->");
            int filterNumber = scanner.nextInt();
            String filterKey = "";
            switch (filterNumber) {
                case 1 -> {
                    filterKey = "brand";
                    System.out.println("Введите брэнд >>>\n");
                    String brand = scanner.next();
                    filters.put(filterKey, brand);
                }
                case 2 -> {
                    filterKey = "model";
                    System.out.println("Введите модель ноутбука >>>\n");
                    String model = scanner.next();
                    filters.put(filterKey, model);
                }
                case 3 -> {
                    filterKey = "ram";
                    System.out.println("Введите объем оперативной памяти >>>\n");
                    String ram = scanner.next();
                    filters.put(filterKey, ram);
                }
                case 4 -> {
                    filterKey = "hardDiskDrive";
                    System.out.println("Введите объем жесткого диска >>>\n");
                    String hardDiskDrive = scanner.next();
                    filters.put(filterKey, hardDiskDrive);
                }
                case 5 -> {
                    filterKey = "operatingSystem";
                    System.out.println("Введите операционную систему >>>\n");
                    String operatingSystem = scanner.next();
                    filters.put(filterKey, operatingSystem);
                }
                case 6 -> {
                    filterKey = "color";
                    System.out.println("Введите цвет ноутбука >>>\n");
                    String color = scanner.next();
                    filters.put(filterKey, color);
                }
                default -> {
                    goOn = false;
                }
            }
        }

        List<Notebook> allNote = listNotebooks.getFilteredList(filters);
        ShowNotebooks(allNote);
    }

    public static void ShowNotebooks(List<Notebook> notebooks) {
        for (Notebook notebook : notebooks){
            System.out.println(notebook);
        }
    }

    public static void ShowMenu(){
        System.out.println("Выберите критерии для фильтра: \n");
        System.out.println("1 --> Брэнд");
        System.out.println("2 --> Модель");
        System.out.println("3 --> Оперативная память");
        System.out.println("4 --> Объем жесткого диска");
        System.out.println("5 --> Операционная система");
        System.out.println("6 --> Цвет");
        System.out.println("Введите 0 для выхода из меню");
    }
}

