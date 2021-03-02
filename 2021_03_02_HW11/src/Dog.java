public class Dog extends Animal {
    public Dog(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed) {
        super(nameOfPet, yearsOfLife, quantityOfLegs, quantityOfEyes, breed);
    }



    @Override
    void eats() {

        System.out.println("Я люблю мясо");

    }

    @Override
    void drinks() {


    }

    @Override
    void makesSound() {

        System.out.println("Гав гав");

    }

    @Override
    public String toString() {
        return "Dog "+super.toString();
    }
}
