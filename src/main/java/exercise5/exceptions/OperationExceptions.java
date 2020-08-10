package exercise5.exceptions;

public class OperationExceptions extends Exception {

    private String message;

    public OperationExceptions(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
