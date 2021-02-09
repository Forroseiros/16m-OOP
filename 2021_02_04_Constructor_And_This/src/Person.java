public class Person {
    String surname;
    String name;
    int passportID;
    String date;
    boolean marriageStatus;
    int children;
    String gender;
    //enum; (нумерирование)

    public Person(int personID,
                  String personFN,
                  String personLN,
                  String personGender,
                  boolean personMstatus,
                  int personChildren){

        surname = personFN;
        name = personLN;
        passportID = personID;
        marriageStatus = personMstatus;
        children = personChildren;
        gender = personGender;

    }

    public Person(String personFN, int personID){
        surname = personFN;
        passportID = personID;
    }

    public Person(String personFN, int personID,String personGender, boolean marriageS){
        surname = personFN;
        passportID = personID;
        gender = personGender;
        marriageStatus = marriageS;
    }
    public void toDisplay(){
        System.out.println(marriageStatus ?"Женат" : "неЖенат");
        System.out.println("Имя пользователя: " + surname);
        System.out.println("Пол пользователя: " + gender);

    }
}

class PersonTest{
    public static void main(String[] args) {
        Person javaCoder = new Person("Ilon",100,"m", true);
        javaCoder.toDisplay();

    }

    public static void telRan(){
        Person student1 = new Person("Ganna", 1);
        Person student2 = new Person("Tanya", 2);
        Person student3 = new Person("Olya", 3);
        Person student4 = new Person("Masha", 4);
        System.out.println(student1.surname);
        System.out.println(student2.surname);
        System.out.println(student3.surname);
        System.out.println(student4.surname);

        Person[] group = new Person[]{student1,student2,student3,student4};
        System.out.println(group[2].surname);
    }
}
