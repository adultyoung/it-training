package innerClasses;

import java.util.Scanner;

class Setnumb extends Hierarchy  {
    Setnumb () {}
    public void addA () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение первой грани: ");
        a = sc.nextInt();
    }
    void addB () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение второй грани: ");
        b = sc.nextInt();
    }
    void addAngle () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение угла между гранями: ");
        angle = sc.nextInt();
        c = (int)Math.sqrt(a*a + b*b - 2*Math.acos((double)angle));
    }
    void addR () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение радиуса: ");
        r = sc.nextInt();
    }
}
