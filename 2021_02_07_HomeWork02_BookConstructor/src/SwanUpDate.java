public class SwanUpDate {
    String breed;
    String gender;
    double sizeOfWings;
    double weight;
    String color;
    int lifeTime;
    int speed;

    public SwanUpDate(String breed, String gender, String color) {
        this.breed = breed;
        this.gender = gender;
        this.color = color;
    }

    public SwanUpDate(String breed, String gender, int speed, double weight) {
        this.breed = breed;
        this.gender = gender;
        this.speed = speed;
    }

    public SwanUpDate(String breed, String gender, int speed) {
        this.breed = breed;
        this.gender = gender;
        this.speed = speed;
    }

    public SwanUpDate(String breed, double sizeOfWings, double weight, int speed) {
        this.breed = breed;
        this.sizeOfWings = sizeOfWings;
        this.weight = weight;
        this.speed = speed;
    }

    public SwanUpDate(String breed, String gender, int lifeTime, String color, double weight) {
        this.breed = breed;
        this.gender = gender;
        this.lifeTime = lifeTime;
        this.color = color;
        this.weight = weight;
    }
}

class SwanUpDateTest {
    public static void main(String[] args) {
        SwanUpDate number1 = new SwanUpDate("Sygnus Columbianus", "male", "white");
        {
            System.out.println("Breed: " + number1.breed);
            System.out.println("Gender: " + number1.gender);
            System.out.println("Color: " + number1.color);
            System.out.println("____________________________");

            SwanUpDate number2 = new SwanUpDate("Cygnus cygnus", "female", 25, 13);
            System.out.println("Breed: " + number2.breed);
            System.out.println("Gender: " + number2.gender);
            System.out.println("Speed: " + number2.speed + "km/h");
            System.out.println("Weight: " + number2.weight + "kg");
            System.out.println("____________________________");

            SwanUpDate number3 = new SwanUpDate("Cygnus olor", "male", 45);
            System.out.println("Breed: " + number3.breed);
            System.out.println("Gender: " + number3.gender);
            System.out.println("Speed: " + number3.speed + "km/h");
            System.out.println("__hhhbhibiiibi__________________________");

            SwanUpDate number4 = new SwanUpDate("Cygnus buccinator", 3.5, 4, 12);
            System.out.println("Breed: " + number4.breed);
            System.out.println("Size of wings: " + number4.sizeOfWings);
            System.out.println("Weight: " + number4.weight + "kg");
            System.out.println("Speed: " + number4.speed + "km/h");
            System.out.println("____________________________________");

            SwanUpDate number5 = new SwanUpDate("Cygnus equitum", "female", 15, "brown", 15);
            System.out.println("Breed: " + number5.breed);
            System.out.println("Gender: " + number5.gender);
            System.out.println("Time of life: " + number5.lifeTime);
            System.out.println("Color: " + number5.color);
            System.out.println("Weight: " + number5.weight);

        }
    }
}


