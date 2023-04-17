public class example {
    public static void main(String[] args) {
        int result = funcMethods.factor(3);
        System.out.println(result);
        String something = inputFromTerminal.dataFromUser("Введите что-нибудь: >>> \n");
        System.out.println(something);
        funcMethods.sayHi();
        int sumNumbers = funcMethods.sum(2, 2);
        System.out.println(sumNumbers);
        String a = inputFromTerminal.dataFromUser("Введите число: \n");
        String b = inputFromTerminal.dataFromUser("Введите число: \n");
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int e = c + d;
        System.out.println(e);

    }
}
