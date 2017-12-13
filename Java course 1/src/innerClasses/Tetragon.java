package innerClasses;

class Tetragon extends Hierarchy implements FitIt, Common, Circles {
    int c =0;
    @Override
    public boolean isFit () {
        if ((a <=Math.sqrt(plane)) && (b<= Math.sqrt(plane))) {
            return true;
        }
        return false;
    }
    public double squareOf () {
        return a*b;
    }
    public boolean circleInFigure () {
        if (a <= b) {
            System.out.println("Радиус вписанной окружности равен: " + a/2);
        } else {
            System.out.println("Радиус вписанной окружности равен: " + b/2);
        }
        return true;
    }
    public boolean circleOutFigure () {
        if (a >= b) {
            System.out.println("Радиус описанной окружности равен: " + a/2);
        } else {
            System.out.println("Радиус описанной окружности равен: " + b/2);
        }
        return true;
    }


     class Square  {
        int b = a;
        void Fit () {
            if (isFit()) {
                System.out.println("Квадрат вписывается в плоскость");
            } else {
                System.out.println("Квадрат не висывается в плоскость");
            }
        }
        void square () {
            System.out.println("Площадь квадрата: " + squareOf());
        }
        void circleIn () {
            circleInFigure();
        }
        void circleOut () {
            circleInFigure();
        }
    }

    class Rectangle  {
        void Fit () {
            if (isFit()) {
                System.out.println("Прямоугольник вписывается в плоскость");
            } else {
                System.out.println("Прямоугольник не висывается в плоскость");
            }
        }
        void square () {
            System.out.println("Площадь прямоугольника: " + squareOf());
        }
        void circleIn () {
            circleInFigure();
        }
        void circleOut () {
            circleInFigure();
        }
    }
}