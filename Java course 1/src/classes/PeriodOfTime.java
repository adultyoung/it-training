package classes;

public class PeriodOfTime {
    private int sec = 0;
    private int min = 0;
    private int hour = 0;
    private int allSec = 0;

    void allSec (int sec1, int min1, int hour1) {
        sec = sec1;
        min = min1;
        hour = hour1;
        allSec = sec + min*60 + hour*3600;
    }

    public PeriodOfTime (int allSec1) {
        allSec = allSec1;
    }

    public PeriodOfTime (int sec1, int min1, int hour1) {
        sec = sec1;
        min = min1;
        hour = hour1;
    }

    void print () {
        if (allSec != 0) {
            System.out.println(allSec+" allSec");
        } if (sec !=0 && min !=0 && hour !=0) {
            System.out.println(sec+" sec "+min+" min "+hour+" hours");
        } else {
            System.out.println("smth dont work");
        }
    }
}
