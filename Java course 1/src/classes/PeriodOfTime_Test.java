package classes;

import java.util.Scanner;

public class PeriodOfTime_Test {
    public static void main(String[] args) {
        int sec = 0;
        int min = 0;
        int hour = 0;
        int allSec = 0;
        System.out.print("sec: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            sec = sc.nextInt();
        }
        System.out.print("min: ");
        if (sc.hasNextInt()) {
            min = sc.nextInt();
        }
        System.out.print("hour: ");
        if (sc.hasNextInt()) {
            hour = sc.nextInt();
        }
        PeriodOfTime one = new PeriodOfTime(sec, min, hour);
        one.print();
        one.allSec(sec,min,hour);
        PeriodOfTime two = new PeriodOfTime(allSec);
        two.print();
    }
}
