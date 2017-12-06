package primitiv;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
     System.out.print("Введите год: ");
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
        sc.close();
        if(y%4==0 && y%100!=0 || y%400==0){
            System.out.println("Это високосный год");
        }else{
            System.out.println("Это не високосный год");
        }
    }
}
