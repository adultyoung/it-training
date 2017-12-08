package classes;

/**
 * Класс создает конструкторы для вводимых значений секунд, часов, и дней и создает методы для подсчета общего количества секунд и вывода данных в консоль
 *
 *  @version 1.0 04 Dec 2017
 *  @author Vlad Marchenko
 */

public class PeriodOfTime {
    private int sec;
    private int min;
    private int hour;
    public static int allSec;

    void allSec (int sec, int min, int hour) {
        allSec = sec + min*60 + hour*3600;
    }

    public PeriodOfTime (int allSec) {
        this.allSec = allSec;
    }

    public PeriodOfTime (int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    void print () {
        if (allSec != 0) {
            System.out.println(allSec+" allSec");
        }
        if (sec !=0 && min !=0 && hour !=0) {
            System.out.println(sec+" sec "+min+" min "+hour+" hours");
        }
    }
}
