package innerClasses;

import java.util.Scanner;

public class SetNumbA extends Hierarchy {
    static void addA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        a = sc.nextInt();
    }
}
