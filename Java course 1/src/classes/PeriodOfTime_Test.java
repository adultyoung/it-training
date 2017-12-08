package classes;

import java.util.Scanner;

/**
 * Класс тестирует возможности класса PeriodOfTime
 *
 *  @version 1.0 04 Dec 2017
 *  @author Vlad Marchenko
 */

public class PeriodOfTime_Test {
    public static void main(String[] args) {
        int sec = 0;
        int min = 0;
        int hour = 0;
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
        PeriodOfTime sep = new PeriodOfTime(sec, min, hour);
        sep.print();
        sep.allSec(sec,min,hour);
        PeriodOfTime all = new PeriodOfTime(PeriodOfTime.allSec);
        all.print();
    }
}
