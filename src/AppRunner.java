import exception.MyCustomException;

public class AppRunner {
    public static void main(String[] args) {
        try {
            int number = 1 / 0;
        }catch (Exception e){
        throw new MyCustomException();
        }
    }
}
