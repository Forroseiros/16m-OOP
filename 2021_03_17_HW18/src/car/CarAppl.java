package car;

import comparators.*;

import java.util.Arrays;

public class CarAppl {
    public static void main(String[] args) {
        Car[] cars = {new Car(2001, "Lada", "White", 250, 3000),
                new Car(2010, "Volvo", "Black", 180, 5000),
                new Car(2015, "Ford", "White", 150, 2000),
                new Car(2020, "Toyota", "Yellow", 300, 8000),
                new Car(2000, "Volvo", "Grey", 280, 8000),
                new Car(2009, "Nissan", "Brown", 190, 6000),
                new Car(2009, "Opel", "Green", 200, 5000),
                new Car(2010, "Fiat", "Grey", 380, 4500),
                new Car(2011, "Subaru", "Red", 190, 4550),
                new Car(2010, "Audi", "Red", 280, 10000),
                new Car(2020, "Ford", "Pink", 150, 2000),

        };
        displayCars(cars);
        Arrays.sort(cars);
        System.out.println("_______________Compare by Model___________________");
        Arrays.sort(cars, new ComparatorByModel());
        displayCars(cars);
        System.out.println("___________Compare by Color________________");
        Arrays.sort(cars, new ComparatorByColor());
        displayCars(cars);
        System.out.println("______________Compare by Engine____________________");
        Arrays.sort(cars, new ComparatorByEngine());
        displayCars(cars);
        System.out.println("________________Compare by Price__________________");
        Arrays.sort(cars, new ComparatorByPrice());
        displayCars(cars);
        System.out.println("_______________Compare by Year___________________");
        Arrays.sort(cars, new ComparatorByYear());
        displayCars(cars);
        System.out.println("______________Compare by Year and Price____________________");
        Arrays.sort(cars, new ComparatorByYearAndPrice());
        displayCars(cars);

    }

    private static void displayCars(Car[] input) {
        for (Car car : input
        ) {
            System.out.println(car);

        }
    }
}
