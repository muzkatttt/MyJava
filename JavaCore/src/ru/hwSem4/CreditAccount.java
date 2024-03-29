package ru.hwSem4;

public class CreditAccount extends Account {

    // region Конструкторы
    public CreditAccount(String accountHolder, double initialAccountBalance) {
        super(accountHolder, initialAccountBalance);
    }

    public CreditAccount(String accountHolder, double initialAccountBalance, double depositAmount) {
        super(accountHolder, initialAccountBalance, depositAmount);
    }

    public double transactionFromAccount1ToAccount2 (Account account1, Account account2){
        return account1.getInitialAccountBalance() - account2.getDepositAmount();
    }

    // endregion

    // region Методы
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

    // endregion
}
