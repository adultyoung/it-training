package innerClasses;

import java.util.Scanner;

public class Hierarchy {
     static int figure;
    static boolean i =false;
    public static int a;
    static int b;
    static int angle;
    static int c;
    static double plane = 2500;
    int r;

    public static void main(String[] args) {
        System.out.println("Выберите геометрическую фигуру: 1 - квадрат; 2 - прямоугольник; 3 - треугольник; 4 - окружность");
        Scanner sc = new Scanner(System.in);
        while (i == sc.hasNextInt()) {
            System.out.println("");
        }
        figure = sc.nextInt();
        switch (figure) {
            case 1:
                Tetragon square = new Tetragon();
                if (square.isFit()) {
                    Tetragon.Square.Fit();
                    Tetragon.Square.square();
                    Tetragon.Square.circleIn();
                    Tetragon.Square.circleOut();

            } else {
                    Tetragon.Square.Fit();
                }
        }

        }
}
