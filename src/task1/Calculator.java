package task1;

public class Calculator {
    public static <T extends Number> double sum(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number> double multiply(T x, T y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number> double divide(T x, T y) {
        if (y.doubleValue() == 0) {
            throw new ArithmeticException("Ошибка!!! деление на ноль не допускается");
        }
        return x.doubleValue() / y.doubleValue();
    }

    public static <T extends Number> double subtract(T x, T y) {
        return x.doubleValue() - y.doubleValue();
    }
}

