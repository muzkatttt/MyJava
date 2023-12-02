package ru.hwSem4;

import java.util.LinkedList;

public class CreditAccount extends Account{
    public CreditAccount(String accountHolder, double initialAccountBalance) {
        super(accountHolder, initialAccountBalance);
    }

    public CreditAccount(String accountHolder, double initialAccountBalance, double depositAmount) {
        super(accountHolder, initialAccountBalance, depositAmount);
    }

    @Override
    public double creditToAccount(double depositAmount) {
        return super.creditToAccount(depositAmount);
    }

    @Override
    public double debitFromAccount(double depositAmount) throws InsufficientFundsException {
        return super.debitFromAccount(depositAmount);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    LinkedList<Account> creditAccounts;

    public void transferMoney(Account account1, Account account2){
        if(account1.finalAccountBalance > 0) {
            account2.finalAccountBalance = account1.finalAccountBalance - account1.depositAmount;
        }
    }

    public void addAccount(Account account){
        LinkedList<Account> listAccounts = new LinkedList<>();
        listAccounts.add(account);
    }

}
