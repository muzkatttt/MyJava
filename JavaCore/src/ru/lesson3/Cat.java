package ru.lesson3;

public class Cat {
    /**
     * Статический класс на примере класса Cat
     * вложенный класс реализует композицию
     * статический вложенный класс облаает теми же свойствами, что и внутренний класс
     */


    private String name, color;
    private int age;

    public Cat() {
    }


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    static class Voice {
        private final int volume;

        public Voice(int volume) {
            this.volume = volume;
        }

        public void sayMur() {
            System.out.printf(
                    "A cat purrs with volume $d\n", volume);
        }

        // static доступ к статическим методам и статическим переменным
        // с помощью цикла for можно создать несколько объектов
        // статическая переменная класса создается в единственном экземпляре
        public void sayMur100() {
            for (int i = 0; i < 4; i++) {
                Cat.Voice voice = new Voice(100 + i);
                voice.sayMur();
            }

        }

    }


}
