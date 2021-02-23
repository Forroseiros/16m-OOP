package inheritance;

public class Person {
    private String firstName;
    private String secondName;
    private String uniID;
    private int age;
    private boolean marriageStatus;

    public Person(String firstName, String secondName, String uniID, int age, boolean marriageStatus) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.age = age;
        this.marriageStatus = marriageStatus;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public boolean isMarriageStatus() {
        return marriageStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUniID() {
        return uniID;
    }

    void eats() {
        System.out.println("Обед в 13:00");
    }

    void walks() {
        System.out.println("Гулять каждый вечер");
    }

    @Override
    public String toString() {
        return "\n" +
                "first name: " + firstName + "\n" +
                "second name: " + secondName + "\n" +
                "uniID: " + uniID + "\n" + "age: " + age + "\n" + "marriage status: " + marriageStatus;
    }
}
