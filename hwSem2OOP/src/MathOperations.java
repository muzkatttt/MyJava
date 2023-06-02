public interface MathOperations{

    default Double addition(Double a, Double b) {
        return addition(a, b);
    }

    default Double subtraction(Double a, Double b) {
        return subtraction(a, b);
    }

    default Double multiplication(Double a, Double b) {
        return multiplication(a, b);
    }

    default Double division(Double a, Double b) {
        return division(a, b);
    }

}
