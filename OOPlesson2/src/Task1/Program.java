package Task1;

public class Program {

//    void A(){ // вызвать метод A() в main только с помощью создания класса Program
//        System.out.println("A()");
//    }
    public static void main(String[] args) {
        // A();// если вызов будет через статистический метод, то норм

        // Чтобы досучаться до метода A(); необходимо создать класс Program и на нем вызывать метод A()
        // Program program = new Program();
        // program.A();

        Foo f1 = new Foo();
        f1.value = 123;
        System.out.println(f1.value);
        f1.printCount();
        Foo.count = 555;

        Foo f2 = new Foo();
        f2.value = 222;
        System.out.println(f2.value);
        f2.printCount(); // экземплярный метод

        Foo f3 = new Foo();
        f3.value = 333;
        System.out.println(f3.value);
        f3.printCount();

    }

}
