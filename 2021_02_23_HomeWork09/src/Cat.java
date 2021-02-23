public class Cat extends Animal {
    private boolean mustache;

    public Cat(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed) {
        super(nameOfPet, yearsOfLife, quantityOfLegs, quantityOfEyes, breed);
        setMustache(true);
    }

    public void setMustache(boolean mustache) {
        this.mustache = mustache;
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("Рыба");
    }

    @Override
    void drinks() {
        super.drinks();
        System.out.println("и Молоко");
    }

    @Override
    void makesSound() {
        super.makesSound();
        System.out.println("Мяу");
    }

    void catchMouse() {
        System.out.println("Я люблю ловить мышей");
    }

    @Override
    public String toString() {
        return "Кот " + super.toString() + "\n" +
                "Наличие усов: " + mustache;
    }
}
