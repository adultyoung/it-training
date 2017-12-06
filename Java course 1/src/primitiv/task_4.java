package primitiv;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        System.out.println(getData());
    }

    private static int getDay() {
        int day = 26;
        System.out.print("Введите день: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            day = sc.nextInt();
        }
        return day;
    }

    private static int getMonth() {
        int month = 11;
        System.out.print("Введите месяц: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            month = sc.nextInt();
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
        if(day>=1&&day<=31&&month>=1&&month<=12&&year>=1){
            switch(day){
                case 29:
                    if(month==2&&!leap) {
                        return "Это не реальная дата";
                    }else{
                        return "Это реальная дата";
                    }
                case 30:
                    if(month==2) {
                        return "Это не реальная дата";
                    }else{
                        return "Это реальная дата";
                    }
                case 31:
                    if(month==4||month==6||month==9||month==11||month==2){
                        return "Это не реальная дата";
                    }
                default:
                    return "Это реальная дата";
            }
        }else {
            return "Это не реальная дата";
        }
    }
}