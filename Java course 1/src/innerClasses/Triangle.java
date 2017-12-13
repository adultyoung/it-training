package innerClasses;

class Triangle extends Hierarchy implements Common, FitIt, Circles {
    double p = 0.5 * (a + b + c);
    double h = height();
    @Override
    public boolean isFit () {
        if ((h <=Math.sqrt(plane)) && (a<= Math.sqrt(plane))) {
            return true;
        }
        return false;
    }
    public double squareOf () {
        return 0.5*h*a;
    }
    public boolean circleInFigure () {
        double r = (Math.sqrt((p-a)*(p-b)*(p-c)))/p;
        System.out.println("Радиус вписанной окружности равен: " + r);
        return true;
    }
    public boolean circleOutFigure () {
        double r = a*b*c/4*Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Радиус описанной окружности равен: " + r);
        return true;
    }
    private double height () {
        return ((2*Math.sqrt(p*(p-a)*(p-b)*(p-c)))/a);
    }
    void Fit () {
        if (isFit()) {
            System.out.println("Треугольник вписывается в плоскость");
        } else {
            System.out.println("Треугольник не висывается в плоскость");
        }
    }
    void square () {
        System.out.println("Площадь треугольника: " + squareOf());
    }
    void circleIn () {
        circleInFigure();
    }
    void circleOut () {
        circleOutFigure();
    }
}
