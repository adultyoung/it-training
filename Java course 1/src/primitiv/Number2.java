package primitiv;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        int e = 30;
        int f = 35;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        System.out.print("Введите параметр а для первого дома: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            a = sc.nextInt();
        }
        System.out.print("Введите параметр b для первого дома: ");
        if(sc.hasNextInt()) {
            b = sc.nextInt();
        }
        System.out.print("Введите параметр c для второго дома: ");
        if(sc.hasNextInt()) {
            c = sc.nextInt();
        }
        System.out.print("Введите параметр d второго дома: ");
        if(sc.hasNextInt()) {
            d = sc.nextInt();
        }
        if ((e >= (a + c)) && (f >=b  && f >= d)) {
            System.out.println(getIn());
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println(getIn());
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println(getIn());
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println(getIn());
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println(getIn());
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println(getIn());
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println(getIn());
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println(getIn());
        }
        else
            System.out.println(getOut());
    }

    private static String getIn(){
        return "Два дома помещаются в данную участок";
    }
    private static String getOut(){
        return "Данные два дома не помещаются на участок";
    }

}

