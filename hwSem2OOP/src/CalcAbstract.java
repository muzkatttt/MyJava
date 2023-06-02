public abstract class CalcAbstract {
    protected Double result;

    protected Double a;
    protected Double b;

    protected Double addition(Double a, Double b) {
        return result;
    }
    protected Double subtraction(Double a, Double b) {
        return result;
    }
    protected Double multiplication(Double a, Double b) {
        return result;
    }
    protected Double division(Double a, Double b) {
        return result;
    }

    public CalcAbstract(Double result, Double a, Double b) {
        this.result = result;
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "CalcAbstract {" +
                "result = " + result +
                ", a = " + a +
                ", b = " + b +
                '}';
    }
}
