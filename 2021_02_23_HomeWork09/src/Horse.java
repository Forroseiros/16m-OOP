public class Horse extends Animal {
    public Horse(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed) {
        super(nameOfPet, yearsOfLife, quantityOfLegs, quantityOfEyes, breed);
    }

    @Override
    public String toString() {
        return "Лошадь " + super.toString();

    }

    @Override
    void eats() {
        super.eats();
        System.out.println("Сено");
    }

    @Override
    void drinks() {
        super.drinks();
    }

    @Override
    void makesSound() {
        super.makesSound();
        System.out.println("Игого");
    }

    void runs() {
        System.out.println("Я люблю много скакать");
    }
}
