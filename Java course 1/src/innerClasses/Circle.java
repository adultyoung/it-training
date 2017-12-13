package innerClasses;

public class Circle extends Hierarchy implements Common, FitIt, Tetragons {
    double pi = 3.14;
    @Override
    public boolean isFit () {
        if (squareOf() <= plane) {
            return true;
        }
        return false;
    }
    public double squareOf () {
        return 2*pi*r*r;
    }
    public boolean tetragonIn () {
        System.out.println("Стороная вписанного квадрата равна: " + r*2/Math.sqrt(2));
        System.out.println("Площадь вписанного квадрата равна: " + r*r*2);
        return true;
    }
    public boolean tetragonOut () {
        System.out.println("Стороная описанного квадрата равна: " + r*2);
        System.out.println("Площадь описанного квадрата равна: " + r*r*4);
        return true;
    }
    void Fit () {
        if (isFit()) {
            System.out.println("Окружность вписывается в плоскость");
        } else {
            System.out.println("Окружность не висывается в плоскость");
        }
    }
    void square () {
        System.out.println("Площадь окружности: " + squareOf());
    }
    void tetragonsIn () {
        tetragonIn();
    }
    void tetragonsOut () {
        tetragonOut();
    }
}
