
abstract class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    abstract void moves();

    public void eats() {
        System.out.println("Трёхразовое питание");
    }

    abstract void sleeps();

}
