package exception;

//My class should be extended from Exception
public class MyCustomException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Division by zero";
    }
}