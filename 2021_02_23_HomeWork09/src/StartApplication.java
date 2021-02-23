public class StartApplication {
    public static void main(String[] args) {
        Cat vasilij = new Cat("Васька",12,4,2, "Дворовый");
        System.out.println(vasilij);
        vasilij.eats();
        vasilij.drinks();
        vasilij.makesSound();
        vasilij.catchMouse();
        System.out.println("-----------------------------------------");

        Dog garik = new Dog("Гарик",15,4,2,"Овчарка");
        System.out.println(garik);
        garik.eats();
        garik.drinks();
        garik.makesSound();
        garik.playsWithBall();
        System.out.println("-----------------------------------------");

        Parrot kesha = new Parrot("Кеша",6,2,2,"Волосатка");
        System.out.println(kesha);
        kesha.eats();
        kesha.drinks();
        kesha.makesSound();
        kesha.sings();
        System.out.println("-----------------------------------------");

        Fish nemo = new Fish("Нэмо",2,0,2,"Золотая");
        System.out.println(nemo);
        nemo.eats();
        nemo.drinks();
        nemo.makesSound();
        nemo.swims();
        System.out.println("-----------------------------------------");

        Horse radjik = new Horse("Раджик",10,4,2,"Бегун");
        System.out.println(radjik);
        radjik.eats();
        radjik.drinks();
        radjik.makesSound();
        radjik.runs();
        System.out.println("-----------------------------------------");

        Pig babe = new Pig("Бэйб",8,4,2,"Умная");
        System.out.println(babe);
        babe.eats();
        babe.drinks();
        babe.makesSound();
        babe.jumps();
    }
}
