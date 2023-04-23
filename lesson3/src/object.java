public class object {
//    public static void main(String[] args) {
//
//        Object o = 1;
//        GetType(o);    // java.lang.Integer
//        o = 1.2;
//        GetType(o);         // java.lang.Double
//
//    }
//
//    static void GetType(Object obj) {
//        System.out.println(obj.getClass().getName());
//    }

    public static void main(String[] args) {
        // будет работать только если задать типы данных отдельным методом
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            // instanceof проверяет, является ли объект подтипом данного типа
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else return 0;
    }
}


