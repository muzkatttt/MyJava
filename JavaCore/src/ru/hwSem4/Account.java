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

    // region Поля

    private String accountHolder; // держатель счета
    public double initialAccountBalance; // начальный баланс счета
    public double finalAccountBalance; // баланс счета после снятия денежных средств
    public double depositAmount; // сумма депозита

    public String getAccountHolder() {
        return accountHolder;
    }


    public double getInitialAccountBalance() {
        return initialAccountBalance;
    }

    public double getFinalAccountBalance() {
        return finalAccountBalance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    // endregion

    // region Конструкторы
    public Account(String accountHolder, double initialAccountBalance) {
        try{
            if(initialAccountBalance < 0){
                throw new IllegalArgumentException("Ошибка");
            }
        } catch (IllegalArgumentException e){
            System.out.println("Нельзя внести депозит с отрицательным значением! Введенный депозит равен " + depositAmount);
        }
        this.accountHolder = accountHolder;
        this.initialAccountBalance = initialAccountBalance;
    }

    public Account(String accountHolder, double initialAccountBalance, double depositAmount) {
        try{
            if(initialAccountBalance < 0 || depositAmount <= 0){
                throw new IllegalArgumentException("Ошибка");
            }
        } catch (IllegalArgumentException e){
            System.out.println("Проверьте баланс счета " + accountHolder + " " + initialAccountBalance + ". Баланс не может быть отрицательным!");
            System.out.println("Проверьте введенное значение депозита: " + depositAmount + ". Депозит не может быть отрицательным!");
            System.out.println();
        }
        this.accountHolder = accountHolder;
        this.initialAccountBalance = initialAccountBalance;
        this.depositAmount = depositAmount;
    }


    // endregion

    // region Методы
    /**
     * @param depositAmount депозит
     * @return finalAccountBalance
     */
    public double creditToAccount(double depositAmount) {
           return finalAccountBalance = initialAccountBalance + depositAmount;
    }

    /**
     * @param depositAmount сумма депозита
     * @return finalAccountBalance окончательный баланс счета
     */
    public double debitFromAccount(double depositAmount) throws InsufficientFundsException{
        try {
            if (depositAmount < initialAccountBalance)
               return finalAccountBalance = initialAccountBalance - depositAmount;
        }
        catch (IllegalArgumentException e) {
            throw new InsufficientFundsException(
                    "Недостаточно средств " + initialAccountBalance
                            + " для перевода! Текущий баланс меньше суммы перевода!" + depositAmount);
        }
        return initialAccountBalance;
    }

    /**
     *
     * @param accountHolder владелец счета
     * @param initialAccountBalance начальный баланс счета
     * @param depositAmount сумма депозита
     * @return Account
     */
    public static Account create(String accountHolder, double initialAccountBalance, double depositAmount) {
        return new Account(accountHolder, initialAccountBalance, depositAmount);
    }

    public static Account create(String accountHolder, double initialAccountBalance) {
        return new Account(accountHolder, initialAccountBalance);
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
    //endregion
}
