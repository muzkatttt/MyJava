package ru.hwSem4;

import java.util.LinkedList;

public class Transaction {

    // region Поля

    LinkedList<Account> listAccounts;

    // endregion

    // region Методы
    public void transferMoney(Account account1, Account account2) {
        try {
            if (account1.initialAccountBalance > 0 && account1.depositAmount > 0) {
                account1.initialAccountBalance = account1.initialAccountBalance - account1.depositAmount;
                account2.initialAccountBalance = account2.initialAccountBalance + account1.depositAmount;
                System.out.println(
                        "Баланс на счете " + account1.getAccountHolder() + " равен "
                                + account1.initialAccountBalance + ". Перевод успешно проведен.\n");
                System.out.println("Баланс на счете " + account2.getAccountHolder() + " успешно пополнен на сумму " +
                        account1.depositAmount + " со счета " + account1.getAccountHolder() + ". На счете доступно " +
                        account2.initialAccountBalance + ".");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Сумма перевода больше суммы баланса!");
        }
    }

    public void addAccount(Account account){
        LinkedList<Account> listAccounts = new LinkedList<>();
        listAccounts.add(account);
        System.out.println(listAccounts);
    }

    // endregion
}
