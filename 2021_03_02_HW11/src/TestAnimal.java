public class TestAnimal {
    public static void main(String[] args) {
        Cat vasya = new Cat("Васька",12,4,2,"Дворовый");
        System.out.println(vasya);
        vasya.eats();
        vasya.makesSound();
        vasya.drinks();
        System.out.println("______________________");

        Dragon pepa = new Dragon("Пепа",158,8,6,"Красивый","Черный");
        System.out.println(pepa);
        pepa.eats();
        pepa.makesSound();
        pepa.drinks();

        System.out.println("______________________");
        Dog juja = new Dog("Жужа",8,4,2,"Овчарка");
        System.out.println(juja);
        juja.eats();
        juja.makesSound();
        juja.drinks();



    }



}
