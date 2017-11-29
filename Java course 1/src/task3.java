import java.util.Scanner;

import static java.lang.Math.*;

public class task3 {
    public static void main(String[] args) {
        double d=discriminant();
        System.out.print("Введите параметр а: ");
        double a=getA();
        System.out.print("Введите параметр b:");
        double b=getB();
        System.out.print("Введите параметр с:");
        double c=getC();
        double x, x1, x2;
        if(isPossitive()){
            x1=(-b-sqrt(d))/(2*a);
            x2=(-b+sqrt(d))/(2*a);
            System.out.println("Корни уравнения: х1 = "+x1+" x2 = "+x2);
        }else{
            if(isZero()){
                x=-b/(2*a);
                System.out.println("Корень уравнения: х = "+x);
            }else{
                System.out.println("Уравнение не имеет корней");
            }
        }

    }
    private static double getA(){
        double a=0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        return a;
    }
    private static double getB(){
        double b=0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        return b;
    }
    private static double getC(){
        double c=0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()) {
            c = sc.nextDouble();
        }sc.close();
        return c;
    }
    private static double discriminant(){
        double a=getA();
        double b=getB();
        double c=getC();
        return b*b-4*a*c;
    }
    private static boolean isPossitive(){
        double d=discriminant();
        return d >= 0;
    }
    private static boolean isZero(){
        double d=discriminant();
        return d==0;
    }

}
