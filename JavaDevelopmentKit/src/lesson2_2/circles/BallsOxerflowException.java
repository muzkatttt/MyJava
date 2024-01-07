package lesson2_2.circles;

public class BallsOxerflowException extends RuntimeException{
    public BallsOxerflowException(){
        super("Невозможно создать более 15 шаров");
    }
}
