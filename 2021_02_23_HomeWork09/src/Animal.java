public class Animal {
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

    @Override
    public String toString() {
        return "имя: " + nameOfPet + "\n" +
                "Количество лет: " + yearsOfLife + "\n" +
                "Количество лап(копыт): " + quantityOfLegs + "\n" +
                "Количество глаз: " + QuantityOfEyes + "\n" +
                "Порода " + breed;
    }

    public String getNameOfPet() {
        return nameOfPet;
    }

    public void setNameOfPet(String nameOfPet) {
        this.nameOfPet = nameOfPet;
    }

    public int getYearsOfLife() {
        return yearsOfLife;
    }

    public void setYearsOfLife(int yearsOfLife) {
        this.yearsOfLife = yearsOfLife;
    }

    public int getQuantityOfLegs() {
        return quantityOfLegs;
    }

    public void setQuantityOfLegs(int quantityOfLegs) {
        this.quantityOfLegs = quantityOfLegs;
    }

    public int getQuantityOfEyes() {
        return QuantityOfEyes;
    }

    public void setQuantityOfEyes(int quantityOfEyes) {
        QuantityOfEyes = quantityOfEyes;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    void eats() {
        System.out.println("Моя любимая еда: ");
    }

    void drinks() {
        System.out.println("Я пью воду");
    }

    void makesSound() {
        System.out.println("Я издаю звук:");
    }


}
