package string;

public class StringAddition {
    static String str = "I learn Java.";
    static int i = 0;
    static long start, finish, timeConsumeMillis;

    public static void main(String[] args) {
        simpleAdd();
        builderAdd();
    }

    static void simpleAdd () {
        start = System.nanoTime();
        for (; i < 10; i++) {
            str += " " + str;
        }
        finish = System.nanoTime();
        timeConsumeMillis = finish - start;
        System.out.println("Simple addition in nanosec: " + timeConsumeMillis);
    }
    static void builderAdd () {
        start = System.nanoTime();
        StringBuilder strBuilder = new StringBuilder(str);
        for (; i < 10; i++) {
            strBuilder.append(" " + str);
        }
        finish = System.nanoTime();
        timeConsumeMillis = finish - start;
        System.out.println("StringBuilder in nanosec: " + timeConsumeMillis);
    }
}
