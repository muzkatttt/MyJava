import java.util.ArrayList;
import java.util.List;

public class Cat {
    /*
    1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записать в текстовом виде, не обязательно реализовывать в java.
    */
    /*
    1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
    Создайте несколько экземпляров этого класса, выведите их в консоль.
    2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет
    и возраст (или другие параметры на ваше усмотрение).
     */
    /*
    1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
    Поместите в него некоторое количество объектов.
    2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
    Убедитесь, что все они сохранились во множество.
    3. Создайте метод public boolean equals(Object o)
    Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
    То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
    4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились
    */
    private String name;
    private String poroda;
    private int age;
    private String owner;
    private List<String> healthHistory;

    public Cat(String name, String poroda, int age, String owner) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
        this.owner = owner;
        healthHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addInHistory(String message) {
        healthHistory.add(message);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name: " + name + ", poroda: " + poroda + ", age: " + age + ", owner: " + owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && poroda.equals(cat.poroda) && age == cat.age && owner.equals(cat.owner);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7 * age + 11 * poroda.hashCode() + 17 * owner.hashCode();
    }
}


