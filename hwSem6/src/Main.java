import java.util.HashSet;
import java.util.Set;

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

        NoteBook notebook0 = new NoteBook("Lenovo", "N34", 8, 256,
                "Linux", "Black");
        NoteBook notebook1 = new NoteBook("Lenovo", "M32", 8, 256,
                "Windows", "Dark Grey");
        NoteBook notebook2 = new NoteBook("Lenovo", "P98", 16, 512,
                "Linux", "Blue");
        NoteBook notebook3 = new NoteBook("HP", "TR8234", 16, 512,
                "Windows", "BlackBerry");
        NoteBook notebook4 = new NoteBook("MacBook", "T34", 8, 512,
                "MacOs", "Grey");

        Set<NoteBook> notebooks = new HashSet<>();
        notebooks.add(notebook0);
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        System.out.println(notebooks);
    }
}