public class Parrot extends Animal {
    private boolean wings;

    public Parrot(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed) {
        super(nameOfPet, yearsOfLife, quantityOfLegs, quantityOfEyes, breed);
        setWings(true);
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }

    @Override
    public String toString() {
        return "Попугай " + super.toString() + "\n" +
                "Наличие крыльев: " + wings;
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("Семена");
    }

    @Override
    void drinks() {
        super.drinks();
    }

    @Override
    void makesSound() {
        super.makesSound();
        System.out.println("Чик чирик");
    }

    void sings() {
        System.out.println("Я люблю петь");
    }
}
