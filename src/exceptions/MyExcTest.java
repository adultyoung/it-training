package exceptions;

import java.util.Arrays;
import java.util.Random;

public class MyExcTest {
    static Random rand = new Random();

    public static void main(String[] args) throws MyException {
        try {
//            sss();
//            RandomException();
            FiftyFiftyExc();
        } catch (RuntimeException es) {
            System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
//            throw new MyException();
            System.exit(0);
        } finally {
            System.out.println("No exception");
        }
    }

    static void sss() throws MyException {
        throw new MyException("New exception");
    }

    static void RandomException() {
        switch (rand.nextInt(3)) {
            case 0:
                throw new ArithmeticException();
            case 1:
                throw new ArrayIndexOutOfBoundsException();
            case 2:
                throw new NullPointerException();
        }
    }

    static void FiftyFiftyExc() throws MyException {
        if (rand.nextInt(2) == 0) {
            throw new MyException("50% of random");
        }
    }
}
