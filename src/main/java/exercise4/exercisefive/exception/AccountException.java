package exercise4.exercisefive.exception;

public class AccountException extends Exception {
    private String message;

    public AccountException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
