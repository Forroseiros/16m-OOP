package inheritance;

public class Student extends Person {
    private double rating;
    private boolean priceForEducation;


    public Student(String firstName, String secondName, String uniID, int age, boolean marriageStatus) {
        super(firstName, secondName, uniID, age, marriageStatus);
        setPriceForEducation(true);
        setRating(10);
    }


    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setPriceForEducation(boolean priceForEducation) {
        this.priceForEducation = priceForEducation;
    }

    void paysForEducation() {
        System.out.println("Платить за учебу каждый семестр");
    }

    void study() {
        //бизнес логика
        System.out.println("А че я же учу");
    }

    @Override
    public String toString() {
        return "Студент " + super.toString() + "\n" +
                "rating: " + rating + "\n" +
                "price For Education: " + priceForEducation;
    }
}
