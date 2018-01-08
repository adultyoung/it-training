package exceptions;

public class ArrayIndexOfBounds {
    static int[] exception = new int[1];

    public static void main(String[] args) {
        try {
            int a = exception[10];
        } catch (ArrayIndexOutOfBoundsException es) {
            System.out.println(es + " спойман");
        }
    }
}
