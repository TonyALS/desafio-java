package exercise4.exerciseone.exception;

public class ArithmeticOperationException extends Exception {

    public static String divisionByZeroException() {
        return "Divisão por zero não permitida";
    }
}
