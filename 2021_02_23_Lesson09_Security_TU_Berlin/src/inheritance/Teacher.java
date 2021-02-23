package inheritance;

public class Teacher extends Person {
    private double salary; // в долларах


    public Teacher(String firstName, String secondName, String uniID, int age, boolean marriageStatus) {
        super(firstName, secondName, uniID, age, marriageStatus);
        setSalary(45000);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void eats() {
        super.eats();
    }

    void teach() {
        System.out.println("Если выучил, то можете выучить и вы!");
    }

    @Override
    void walks() {
        super.walks();
    }

    void treats() {
        System.out.println("Лечиться в санатории после тяжелой работы с учениками");
    }

    @Override
    public String toString() {
        return "Учитель " + super.toString() + "\n" +
                "salary: " + salary;

    }

}