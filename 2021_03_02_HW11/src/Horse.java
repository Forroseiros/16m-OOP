public class Horse extends Animal{
    public Horse(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed) {
        super(nameOfPet, yearsOfLife, quantityOfLegs, quantityOfEyes, breed);
    }

    @Override
    void eats() {

        System.out.println("Я люблю сено");

    }

    @Override
    void drinks() {

    }

    @Override
    void makesSound() {

        System.out.println("ИГОГО");

    }

    @Override
    public String toString() {
        return "Horse" + super.toString();
    }
}
