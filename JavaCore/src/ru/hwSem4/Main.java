package ru.hwSem4;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        /**
         *  Создать программу управления банковским счетом (Account).
         */

        // создание экземпляров класса Account
        Account account1 = Account.create("Крокодил Гена", 3000.00);
        Account account4 = Account.create(
                "Элли из Изумрудного города", 5000.00);
        Account account2 = Account.create(
                "Чебурашка", 6000.00, 100.00);
        Account account3 = Account.create(
                "Шапокляк", 1000.00, 100.00);
        System.out.println();

        LinkedList<Account> accountLinkedList = new LinkedList<>();
        accountLinkedList.add(0, account1);
        accountLinkedList.add(1, account2);
        accountLinkedList.add(2, account3);
        accountLinkedList.add(3, account4);

        Iterator<Account> accountIterator = accountLinkedList.iterator();
        while (accountIterator.hasNext()) {
            System.out.println(accountIterator.next().toString());
        }

        /*
        // попытка перевести средства, превышающие баланс владельца счета
        try {
            System.out.println(account1.debitFromAccount(5000.00));
        } catch (InsufficientFundsException e) {
            throw new RuntimeException(e);
        }
        */

        /**
         * Задача №2. Создать несколько типов счетов, унаследованных от Account (CreditAccount, DebitAccount).
         * Создать класс (Transaction), позволяющий проводить транзакции между счетами
         * (переводить сумму с одного счета на другой)
         */

        System.out.println("\n");
        Account account5 = Account.create(
                "Красная шапочка", -1.00, -1.00);
        Account account6 = Account.create(
                "Серый Волк", -1.00, -1.00);

        Account account7 = Account.create(
                "Розочка", 1000.00, 50.00);
        Account account8 = Account.create(
                "Цветан", 300.00, 15.00);

        /**
         * @Transaction класс, в котором реализована возможность перевода от одного владельца счета другому
         */

        Transaction transaction = new Transaction();
        transaction.addAccount(account5);
        transaction.addAccount(account6);

        transaction.transferMoney(account5, account6);
        transaction.transferMoney(account8, account7);

    }
}
