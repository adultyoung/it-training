package innerClasses;

public class Square extends Hierarchy implements Circles, Common, FitIt {
    @Override
    public boolean isFit() {
        if (a <= Math.sqrt(super.plane)) {
            return true;
        }
        return false;
    }

    public double squareOf() {
        return a * a;
    }

    public boolean circleInFigure() {
        System.out.println("Радиус вписанной окружности равен: " + a / 2);
        return true;
    }

    public boolean circleOutFigure() {
        System.out.println("Радиус описанной окружности равен: " + a / Math.sqrt(2));
        return true;
    }

    void AddNumbs() {
        SetNumbA.addA();
    }

    void Fit() {
        if (isFit()) {
            System.out.println("Квадрат вписывается в плоскость");
        } else {
            System.out.println("Квадрат не висывается в плоскость");
        }
    }

    void square() {
        System.out.println("Площадь квадрата: " + squareOf());
    }

    void circleIn() {
        circleInFigure();
    }

    void circleOut() {
        circleOutFigure();
    }
}