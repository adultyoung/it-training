package primitiv;

import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        String data = getData();
        System.out.println("Следующий день - " + data);
    }

    private static int getDay() {
        int day = 26;
        System.out.print("Введите день: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            day = sc.nextInt();
            if (day > 31) {
                System.out.println("Вы ввели некорректное значение дня");
                getDay();
                if (sc.hasNextInt()) {
                    day = sc.nextInt();
                }
            }
        }
        return day;
    }

    private static int getMonth() {
        int month = 11;
        System.out.print("Введите месяц: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            month = sc.nextInt();
            if (month > 13) {
                System.out.println("Вы ввели некоректное значение месяца");
                getMonth();
                if (sc.hasNextInt()) {
                    month = sc.nextInt();
                }

            }
        }
        return month;
    }
    private static int getYear() {
        int year = 2017;
        System.out.print("Введите год: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            year = sc.nextInt();
        }
        sc.close();
        return year;
    }
    private static String getData() {
        int day = getDay();
        int month = getMonth();
        int year = getYear();
        boolean leap = year%4==0 && year%100!=0 || year%400==0;
        switch(day){
            case 28:
                if(month==2 && leap) {
                    day = 1;
                    month++;
                    if (month == 13) {
                        month = 1;
                        year++;
                    }

                }else{
                    day++;
                } break;
            case 29:
                if(month==2) {
                        day = 1;
                        month++;
                        if (month == 13) {
                            month = 1;
                            year++;
                            break;
                        }
                }
            case 30:
                if(month==4||month==6||month==9||month==11){
                    day=1;
                    month++;
                }
                if(month==13){
                    month=1;
                    year++;
                }
                break;
            case 31:
                day=1;
                month++;
                if(month==13){
                    month=1;
                    year++;
                }
                break;
            default:
                day++;
                break;
        }
        return day+"."+month+"."+year;
    }
}
