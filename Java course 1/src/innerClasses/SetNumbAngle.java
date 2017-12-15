package innerClasses;

import java.util.Scanner;

public class SetNumbAngle extends Hierarchy {
    static void addAngle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение угла между a и b: ");
        angle = sc.nextInt();
        c = Math.sqrt(((a * a) + (b * b)) - (2 * Math.acos(angle)));
    }
}
