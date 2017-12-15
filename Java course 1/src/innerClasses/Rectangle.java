package innerClasses;

public class Rectangle extends Hierarchy implements Common, Circles, FitIt {
    @Override
    public boolean isFit() {
        if ((a <= Math.sqrt(super.plane)) && (b <= Math.sqrt(super.plane))) {
            return true;
        }
        return false;
    }

    public double squareOf() {
        return a * b;
    }

    public boolean circleInFigure() {
        if (a <= b) {
            System.out.println("Радиус вписанной окружности равен: " + a / 2);
        } else {
            System.out.println("Радиус вписанной окружности равен: " + b / 2);
        }
        return true;
    }

    public boolean circleOutFigure() {
        System.out.println("Радиус описанной окружности равен: " + Math.sqrt(a * a + b * b) / 2);
        return true;
    }

    void AddNumbs() {
        SetNumbA.addA();
        SetNumbB.addB();
    }

    void Fit() {
        if (isFit()) {
            System.out.println("Прямоугольник вписывается в плоскость");
        } else {
            System.out.println("Прямоугольник не висывается в плоскость");
        }
    }

    void square() {
        System.out.println("Площадь прямоугольника: " + squareOf());
    }

    void circleIn() {
        circleInFigure();
    }

    void circleOut() {
        circleInFigure();
    }
}
