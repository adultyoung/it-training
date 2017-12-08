package classes;

import java.util.Scanner;

/**
 * Класс получает значения количества имеющихся денежных купюр номиналом 20,50,100 и выводит, возможно ли вывести вводимую сумму средств данными номиналами
 *
 *  @version 1.0 04 Dec 2017
 *  @author Vlad Marchenko
 */

public class Bankomat {
    public static int summ20 = 0;
    public static int summ50 = 0;
    public static int summ100 = 0;

    void add20 () {
        System.out.print("Кол. 20: ");
        Scanner sc = new Scanner(System.in);
            summ20 = sc.nextInt();
    }

    void add50 () {
        System.out.print("Кол. 50: ");
        Scanner sc = new Scanner(System.in);
        summ50 = sc.nextInt();
    }

    void add100() {
        System.out.print("Кол. 100: ");
        Scanner sc = new Scanner(System.in);
        summ100 = sc.nextInt();
    }

    public boolean Cash (int summ20, int summ50, int summ100) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сумма на снятие: ");
        int cash = sc.nextInt();
        while (cash % 10 != 0) {
            System.out.println("Вы ввели сумму, не кратную 10");
            System.out.print("Сумма на снятие: ");
            cash = sc.nextInt();

        }
        //Обьявление купюр, входящих в сумму для снятия
        int numb20;
        int numb50 = 0;
        int numb100 = 0;
        numb20 = (cash/20);
        if((cash % 20) == 10) {
            numb50++;
            numb20 -= 2;
        }
        for (;numb20 > summ20; numb20 -= 5) {
            numb100++;
        }
        for(;numb100 > summ100; numb100--) {
            numb50 += 2;
        }
        if ((numb50 <= summ50) && (numb20<=summ20) && (numb50 <= summ50) && (numb100 <= summ100)) {
            System.out.println("20 - " + numb20 + "; 50 - " + numb50 + "; 100 - " + numb100 + ".");
            return true;
        } else
            System.out.println("Невозможно выдать такую сумму денег");
        return false;

    }

    public Bankomat (int summ20, int summ50, int summ100){}
}
