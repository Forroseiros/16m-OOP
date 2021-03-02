
public class Duck extends Pet {
    public Duck(String name) {
        super(name);
    }
    // implemented - abstract methods
    // override - super.methods
    // abstract void sleeps();


    void moves() {
        this.swims();
    }

    void swims(){
        System.out.println("Плыви уточка");
    }
    @Override
    public String toString() {
        return "Duck{}";
    }

    @Override
    public void eats() {
        super.eats();
        System.out.println("Двухразовое питание");
    }

    @Override
    void sleeps() {

    }
}