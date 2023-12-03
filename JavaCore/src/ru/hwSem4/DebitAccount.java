package ru.hwSem4;

public class DebitAccount extends Account{

    // region Конструкторы
    public DebitAccount(String accountHolder, double initialAccountBalance) {
        super(accountHolder, initialAccountBalance);
    }

    public DebitAccount(String accountHolder, double initialAccountBalance, double depositAmount) {
        super(accountHolder, initialAccountBalance, depositAmount);
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
