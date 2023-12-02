package ru.hwSem4;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InsufficientFundsException {
        Account account1 = Account.create("Крокодил Гена", 3000.00);
        Account account4 = Account.create(
                "Элли из Изумрудного города", 5000.00);
        Account account2 = Account.create(
                "Чебурашка", -1000.00, 100.00);
        Account account3 = Account.create(
                "Шапокляк", 1000.00, -100.00);

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

        System.out.println(account1.debitFromAccount(5000.00));
    }
}
