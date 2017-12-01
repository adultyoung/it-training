package Massive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {

    private static Random rand = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int b = rand.nextInt((3)) + 1;
            if (Arrays.asList(arr).contains(b)) {
                i--;
            } else {
                arr.add(b);
            }
        }
        System.out.println("Массив: " + arr);
    }
}
