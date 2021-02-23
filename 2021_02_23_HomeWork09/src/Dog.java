public class Dog extends Animal {
    private boolean mustache;

    public Dog(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed) {
        super(nameOfPet, yearsOfLife, quantityOfLegs, quantityOfEyes, breed);
        setMustache(true);
    }

    public void setMustache(boolean mustache) {
        this.mustache = mustache;
    }

    @Override
    public String toString() {
        return "Собака " + super.toString() + "\n" +
                "Наличие усов: " + mustache;
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("Мясо");
    }

    @Override
    void drinks() {
        super.drinks();
    }

    @Override
    void makesSound() {
        super.makesSound();
        System.out.println("Гав");
    }

    void playsWithBall() {
        System.out.println("Я люблю играть с мячом");
    }
}
