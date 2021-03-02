public class Cat extends Animal {
    public Cat(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed) {
        super(nameOfPet, yearsOfLife, quantityOfLegs, quantityOfEyes, breed);
    }

    @Override
    void eats() {

        System.out.println("Я люблю есть рыбу");

    }

    @Override
    void drinks() {

    }

    @Override
    void makesSound() {

        System.out.println("Мяу");

    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
