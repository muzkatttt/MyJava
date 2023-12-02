package ru.hwSem4;

public class Main {
    public static void main(String[] args) {
        Account account1 = Account.create("Крокодил Гена", 3000.00);
        account1.showAccount(account1);
        System.out.println(account1.creditToAccount(1000.00));

        Account account2 = Account.create(
                "Чебурашка", -1000.00, 100.00);
        account2.showAccount(account2);
        Account account3 = Account.create(
                "Шапокляк", 1000.00, -100.00);
        account3.showAccount(account3);
    }
}
