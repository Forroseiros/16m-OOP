public class Circle extends Figure {
    double length;
    double radius;
    double square;


    public Circle(double radius, double kooficient) {
        super(kooficient);
        this.radius = radius;
    }

    @Override
    void findPeriMeter() {
        this.length = 2 * Math.PI * radius;
    }


    @Override
    void findSquare() {
        this.square = Math.PI * radius * radius;
    }
}