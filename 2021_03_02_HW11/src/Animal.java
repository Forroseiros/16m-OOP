abstract class Animal {
    private String nameOfPet;
    private int yearsOfLife;
    private int quantityOfLegs;
    private int QuantityOfEyes;
    private String breed;

    public Animal(String nameOfPet, int yearsOfLife, int quantityOfLegs, int quantityOfEyes, String breed) {
        this.nameOfPet = nameOfPet;
        this.yearsOfLife = yearsOfLife;
        this.quantityOfLegs = quantityOfLegs;
        QuantityOfEyes = quantityOfEyes;
        this.breed = breed;
    }
    abstract void eats();

    abstract void drinks();

    abstract void makesSound();

    @Override
    public String toString() {
        return "Animal" +
                "nameOfPet= " + nameOfPet +
                ", yearsOfLife= " + yearsOfLife +
                ", quantityOfLegs= " + quantityOfLegs +
                ", QuantityOfEyes= " + QuantityOfEyes +
                ", breed= " + breed
                ;
    }
}
