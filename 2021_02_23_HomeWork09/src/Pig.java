public class Pig extends Animal {
    public Pig(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed) {
        super(nameOfPet, yearsOfLife, quantityOfLegs, quantityOfEyes, breed);
    }

    @Override
    public String toString() {
        return "Свинья " + super.toString();

    }

    @Override
    void eats() {
        super.eats();
        System.out.println("Отходы");
    }

    @Override
    void drinks() {
        super.drinks();
        System.out.println("из лужи");
    }

    @Override
    void makesSound() {
        super.makesSound();
        System.out.println("Уиии Уииии");
    }

    void jumps() {
        System.out.println("Я люблю прыгать через забор");
    }
}
