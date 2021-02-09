public class Swan {
    /*Создать класс лебедь - Swan.
    И несколько его экземпляров.
    Чем различаются ваши лебеди?
    Какие у них атрибуты?
    Какие методы?*/
    String breed;
    double sizeOfWings;
    double weight;
    String color;
    int lifeTime;

    public void descriptionOfBreeds() {
        System.out.println("Breed: " + breed);
        System.out.println("Size of wings: " + sizeOfWings);
        System.out.println("Weight of swan: " + weight);
        System.out.println("Color of swan: " + color);
        System.out.println("The period of life: " + lifeTime);
    }

}

class TestSwans {
    public static void main(String[] args) {
        Swan cygnusColumbianus = new Swan();
        Swan cygnusCygnus = new Swan();
        Swan cygnusOlor = new Swan();

        cygnusColumbianus.breed = "Cygnus columbianus";
        cygnusColumbianus.color = "White";
        cygnusColumbianus.sizeOfWings = 1.35;
        cygnusColumbianus.weight = 15.00;
        cygnusColumbianus.lifeTime = 20;
        cygnusColumbianus.descriptionOfBreeds();
        System.out.println("--------------------------");

        cygnusCygnus.breed = "Cygnus cygnus";
        cygnusCygnus.color = "Black";
        cygnusCygnus.sizeOfWings = 2.0;
        cygnusCygnus.weight = 17.00;
        cygnusCygnus.lifeTime = 12;
        cygnusCygnus.descriptionOfBreeds();
        System.out.println("--------------------------");

        cygnusOlor.breed = "Cygnus olor";
        cygnusOlor.color = "Brown";
        cygnusOlor.sizeOfWings = 1.20;
        cygnusOlor.weight = 18.5;
        cygnusOlor.lifeTime = 28;
        cygnusOlor.descriptionOfBreeds();


    }


}
