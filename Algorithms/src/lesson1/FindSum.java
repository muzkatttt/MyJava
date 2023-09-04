package lesson1;

public class FindSum {
    // поиск шанса выпадения определенной суммы на игралных костях (3 кубика)
    // количество вложенных циклов будет равно количеству кубиков
    public static double findSum(int sum){
        int count = 0;
        int successResult = 0;
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 6; j++){
                for (int k = 1; k <=6; k++){
                    if (i + j + k == sum){
                        successResult++;
                    }
                    count++;
                }
            }
        }
        return ((double) successResult) / ((double) count);
    }
}
