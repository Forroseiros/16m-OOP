public class Dragon extends Animal {
    public Dragon(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed, String color) {
        super(nameOfPet, yearsOfLife, quantityOfLegs, quantityOfEyes, breed);

    }

    @Override
    void eats() {

        System.out.println("Я люблю есть людей");

    }

    @Override
    void drinks() {

        System.out.println("Я пью молоко");

    }

    @Override
    void makesSound() {

        System.out.println("Пшыыыыпшыыы");

    }

    @Override
    public String toString() {
        return "Dragon " + super.toString();
    }
}
