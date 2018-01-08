package exceptions;

public class MyException extends RuntimeException {
    public MyException() {
    }

    public MyException(String er) {
        super(er);
    }

}
