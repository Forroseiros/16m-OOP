package inheritance;

public class Worker extends Person {
    private boolean profsouz;

    public Worker(String firstName, String secondName, String uniID, int age, boolean marriageStatus) {
        super(firstName, secondName, uniID, age, marriageStatus);
        setProfsouz(true);
    }

    public void setProfsouz(boolean profsouz) {
        this.profsouz = profsouz;
    }

    @Override
    void eats() {
        System.out.println("Еду надо ещё заслужить!");
    }

    void works() {
        System.out.println("Отсюда и до зари!");
    }

    @Override
    void walks() {
        super.walks();
    }

    void dances() {
        System.out.println("Танцуют после тяжелой рабочей недели");
    }

    @Override
    public String toString() {
        return "Рабочий" + super.toString() + "\n" +
                "Профсоюз " + profsouz;
    }
}
