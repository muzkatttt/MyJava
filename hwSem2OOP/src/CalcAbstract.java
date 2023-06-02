public abstract class CalcAbstract implements MathOperations {
    protected Double result;
    protected Double a;
    protected Double b;
    protected char ch;

    public CalcAbstract() {
        this.a = 0.0;
        this.b = 0.0;
    }

    public abstract Double getResult(Double a, Double b, char ch);

    @Override
    public String toString() {
        return "a = " + a +
                ", b = " + b + ", Результат = " + String.format("%.00f", result) +
                '.';
    }
}
