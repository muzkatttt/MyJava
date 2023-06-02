public class Operations extends CalcAbstract {

    @Override
    public Double getResult(Double a, Double b, char ch) {
        super.a = a != null ? a : 0;
        super.b = b != null ? b : 0;
        super.ch = ((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/')) ? ch : ' ';
        // добавить switch case
        return switch (ch) {
            case '+' -> addition(a, b);
            case '-' -> subtraction(a, b);
            case '*' -> multiplication(a, b);
            case '/' -> division(a, b);
            default -> null;
        };
    }

    @Override
    public Double addition(Double a, Double b) {
        super.result = a + b;
        return super.result;
    }

    @Override
    public Double subtraction(Double a, Double b) {
        super.result = a - b;
        return super.result;
    }

    @Override
    public Double multiplication(Double a, Double b) {
        super.result = a * b;
        return super.result;
    }

    @Override
    public Double division(Double a, Double b) {
        super.result = a / b;
        return super.result;
    }
}
