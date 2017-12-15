package primitiv;

import java.util.Scanner;

public class task_2b {
    public static void main(String[] args) {
        System.out.print("Введите сумму денег: ");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        sc.close();
        int preLastDigit = sum % 100 / 10;
        if (preLastDigit == 1){
            System.out.print(sum+ " рублей");
        }else {
            switch (sum % 10) {
                case 1:
                    System.out.println(sum + " рубль");
                case 2:
                case 3:
                case 4:
                    System.out.println(sum + " рубля");
                default:
                    System.out.println(sum + " рублей");
            }
        }
    }
    }
