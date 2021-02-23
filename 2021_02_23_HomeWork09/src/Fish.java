public class Fish extends Animal {
    public Fish(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed) {
        super(nameOfPet, yearsOfLife, quantityOfLegs, quantityOfEyes, breed);
    }


    @Override
    void eats() {
        super.eats();
        System.out.println("Корм для рыб");
    }

    @Override
    void drinks() {
        super.drinks();
    }

    @Override
    void makesSound() {
        super.makesSound();
        System.out.println("но никто меня не слышит");
    }

    void swims() {
        System.out.println("Я люблю плавать");
    }

    @Override
    public String toString() {
        return
                "Рыбка " + super.toString();
    }
}
