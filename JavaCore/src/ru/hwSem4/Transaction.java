package ru.hwSem4;

public class Transaction {
    Account account1;
    Account account2;
    public void transferMoney(Account account1, Account account2){
        if(account1.finalAccountBalance > 0) {
            account2.finalAccountBalance = account1.finalAccountBalance - account1.depositAmount;
        } else {
            throw new RuntimeException("Баланс счета " + account1.getAccountHolder()
                    + " меньше сумы перевода");
        }
    }

}
