package car;

public class Car implements Comparable<Car> {
    private int year;
    private String model;
    private String colour;
    private double engine;
    private double price;

    public Car(int year, String model, String colour, double engine, double price) {
        setYear(year);

        if (model != null && !model.trim().isEmpty())
            this.model = model;
        else
            this.model = "Wrong name";

        setColour(colour);

        if (engine > 0 && engine < 400)
            this.engine = engine;
        if (price > 0)
            this.price = price;
        else
            this.price = 0.0;

        setPrice(price);
    }

    public Car() {
        model = "No model";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1991)
            this.year = year;
        else
            this.year = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.trim().isEmpty())
            this.model = model;
        else
            this.model = "Please write correct name of model";
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour != null && !colour.trim().isEmpty())
            this.colour = colour;
        else
            this.colour = "Wrong color";
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        if (engine > 0 && engine < 400)
            this.engine = engine;
        else
            this.engine = 0.0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            this.price = 0.0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return model.compareToIgnoreCase(o.model);
    }
}
