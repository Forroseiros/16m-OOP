package comparators;

import car.Car;

import java.util.Comparator;

public class ComparatorByModel implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareToIgnoreCase(o2.getModel());
    }
}
