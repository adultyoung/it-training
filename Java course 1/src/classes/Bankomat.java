package classes;

import java.util.Scanner;

public class Bankomat {
    public static int summ20 = 0;
    public static int summ50 = 0;
    public static int summ100 = 0;

    void add20 () {
        System.out.println("summ20: ");
        Scanner sc = new Scanner(System.in);
            summ20 = sc.nextInt();
    }

    void add50 () {
        System.out.println("summ50: ");
        Scanner sc = new Scanner(System.in);
        summ50 = sc.nextInt();
    }

    void add100() {
        System.out.println("sum100: ");
        Scanner sc = new Scanner(System.in);
        summ100 = sc.nextInt();
    }

    public boolean Cash (int summ20, int summ50, int summ100) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cash: ");
        int cash = sc.nextInt();
        int i;
        for (i = 0; i < summ100; i++) {
            cash = cash - 100;
            if (cash < 0) {
                cash += 100;
                break;
            }else if (cash ==0) {
                System.out.println(i + 1 + " - 100");
                return true;
            }
        }
            System.out.println(i + " - 100");
        for (i = 0; i < summ50; i++) {
            cash = cash - 50;
            if (cash < 0) {
                cash += 50;
                break;
            }else if (cash ==0) {
                System.out.println(i + 1 + " - 50");
                return true;
            }
        }
            System.out.println(i + " - 50");
        for (i = 0; i < summ20; i++) {
            cash = cash - 20;
            if (cash < 0) {
                return false;
            } else if (cash ==0) {
                System.out.println(i+1 + " - 20");
                return true;
            } else if (cash > 0) {
                return false;
            }
        }
        return true;
    }

    public Bankomat (int summ20, int summ50, int summ100){}
}
