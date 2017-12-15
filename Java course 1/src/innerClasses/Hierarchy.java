package innerClasses;

import java.util.Scanner;

public class Hierarchy {
    static private int figure;
    static private boolean i = false;
    static int a;
    static int b;
    static int angle;
    static double c;
    double plane = 2500;
    static int r;

    public static void main(String[] args) {
        System.out.println("Выберите геометрическую фигуру: 1 - квадрат; 2 - прямоугольник; 3 - треугольник; 4 - окружность");
        Scanner sc = new Scanner(System.in);
        while (i == sc.hasNextInt()) {
            System.out.println("");
        }
        figure = sc.nextInt();
        switch (figure) {
            case 1:
                Square square = new Square();
                square.AddNumbs();
                if (square.isFit()) {
                    square.Fit();
                    square.square();
                    square.circleIn();
                    square.circleOut();
                    break;
                } else {
                    square.Fit();
                    break;
                }
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.AddNumbs();
                if (rectangle.isFit()) {
                    rectangle.Fit();
                    rectangle.square();
                    rectangle.circleIn();
                    rectangle.circleOut();
                    break;
                } else {
                    rectangle.Fit();
                    break;
                }
            case 3:
                Triangle triangle = new Triangle();
                triangle.AddNumbs();
                if (triangle.isFit()) {
                    triangle.Fit();
                    triangle.square();
                    triangle.circleIn();
                    triangle.circleOut();
                    System.out.println("Высота треугольника равна: " + triangle.height());
                    break;
                } else {
                    triangle.Fit();
                    break;
                }
            case 4:
                Circle circle = new Circle();
                circle.AddNumbs();
                if (circle.isFit()) {
                    circle.Fit();
                    circle.square();
                    circle.tetragonsIn();
                    circle.tetragonsOut();
                    break;
                } else {
                    circle.Fit();
                    break;
                }

        }
    }
}
