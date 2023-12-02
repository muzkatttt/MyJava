package ru.hwSem4;

public class Account {
    /*
Программа должна позволять пользователю вводить начальный баланс счета,
сумму депозита и сумму снятия средств.
При этом она должна обрабатывать следующие исключительные ситуации:
Попытка создать счет с отрицательным начальным балансом должна вызывать
исключение IllegalArgumentException с соответствующим сообщением.
Попытка внести депозит с отрицательной суммой должна вызывать исключение
IllegalArgumentException с соответствующим сообщением.
Попытка снять средства, сумма которых превышает текущий баланс, должна
вызывать исключение InsufficientFundsException с сообщением о недостаточных
средствах и текущим балансом. Продемонстрируйте работу вашего приложения:
Программа должна обрабатывать все исключения с помощью конструкции try-catch,
выводя соответствующие сообщения об ошибках.
     */

    private String accountHolder; // держатель счета
    public double initialAccountBalance; // начальный баланс счета
    public double finalAccountBalance; // баланс счета после снятия денежных средств
    public double depositAmount; // сумма депозита

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getInitialAccountBalance() {
        return initialAccountBalance;
    }

    public void setInitialAccountBalance(double initialAccountBalance) {
        this.initialAccountBalance = initialAccountBalance;
    }

    public double getFinalAccountBalance() {
        return finalAccountBalance;
    }

    public void setFinalAccountBalance(double finalAccountBalance) {
        this.finalAccountBalance = finalAccountBalance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Account(String accountHolder, double initialAccountBalance) {
        this.accountHolder = accountHolder;
        this.initialAccountBalance = initialAccountBalance;
    }

    public Account(String accountHolder, double initialAccountBalance, double depositAmount) {
        this.accountHolder = accountHolder;
        this.initialAccountBalance = initialAccountBalance;
        this.depositAmount = depositAmount;
    }

    //Попытка внести депозит с отрицательной суммой должна вызывать исключение
    //IllegalArgumentException с соответствующим сообщением.

    /**
     * @param depositAmount депозит
     * @return finalAccountBalance
     * @throws IllegalArgumentException Отрицательное значение депозита
     */
    public double creditToAccount(double depositAmount) {
        try{
            if (depositAmount > 0)
                return finalAccountBalance = initialAccountBalance + depositAmount;
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Нельзя внести депозит с отрицательным значением! Введенный депозит равен " + depositAmount);
        }
        return finalAccountBalance;
    }

    /**
     *
     * @param depositAmount сумма депозита
     * @return finalAccountBalance окончательный баланс счета
     * @throws InsufficientFundsException Текущий баланс меньше суммы перевода
     */
    public double debitFromAccount(double depositAmount) throws InsufficientFundsException{
        try {
            if (depositAmount < finalAccountBalance)
                return finalAccountBalance = finalAccountBalance - depositAmount;
        }
        catch (IllegalArgumentException e){
            throw  new InsufficientFundsException(
                    "Недостаточно средств " + getFinalAccountBalance()
                            + " для перевода! Текущий баланс меньше суммы перевода!" + getDepositAmount());

        }
        return finalAccountBalance;
    }


    /**
     *
     * @param accountHolder владелец счета
     * @param initialAccountBalance начальный баланс счета
     * @param depositAmount сумма депозита
     * @return Account
     * @throws NegativeAccountBalance Отрицательный баланс счета
     */
    public static Account create(String accountHolder, double initialAccountBalance, double depositAmount) {
        try {
            if (depositAmount >= 0)
                return new Account(accountHolder, initialAccountBalance, depositAmount);
        } catch (IllegalArgumentException e) {
            throw new NegativeAccountBalance("Нельзя создать счет с отрицательным балансом!" + e);
        }
        return new Account(accountHolder, initialAccountBalance, depositAmount);
    }

    public static Account create(String accountHolder, double initialAccountBalance) {
        try {
            if (initialAccountBalance >= 0)
                return new Account(accountHolder, initialAccountBalance);
        } catch (IllegalArgumentException e) {
            throw new NegativeAccountBalance("Нельзя создать счет с отрицательным балансом!" + e);
        }
        return new Account(" ", 0.00, 0.00);
    }

    public void showAccount(Account account){
        System.out.println(account);
    }
    @Override
    public String toString() {
        return "Параметры счета: " +
                "Владелец счета: " + getAccountHolder() +
                ", начальный баланс счета: " + getInitialAccountBalance() +
                ", окончательный баланс счета: " + getFinalAccountBalance() +
                ", сумма вклада: " + getDepositAmount() +
                ".";
    }
}
