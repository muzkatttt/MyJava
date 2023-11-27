package ru.lesson3;

public class Main {
    enum Color {

        // Объекты перечисления - это статические объекты
        // Перечисление это класс
        // Каждый объект в перечислении - статический
        RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
        private String code;
        Color(String code){
            this.code = code;
        }

        public String getCode() {
             return code;
        }
    }

    /**
     * Вложенные классы
     * Nested Classes:
     * 1) Inner Class
     * 2)
     *
     */
    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.printf("%s($s) ", c, c.getCode());


            Orange orange = new Orange();
            orange.squeezeJuice();


            Cat.Voice voice = new Cat.Voice(100);
            voice.sayMur();
        }
    }
}
