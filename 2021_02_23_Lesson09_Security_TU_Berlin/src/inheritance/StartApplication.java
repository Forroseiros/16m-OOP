package inheritance;

public class StartApplication {
    public static void main(String[] args) {
     /*   lessonStart();
        Student pasha = new Student("Паша", "Алексеев", "43534", 25, false);
        Person dasha = new Student("Даша", "Семёнофф", "5345243", 23, true);
        Object rita = new Student("Рита", "Иванова", "3564356345", 22, false);
        Person andrew = new Teacher("Андрей", "Потапов", "125-896", 38, true);
        String hausmaster = "Василий";
        Student[] informatik = new Student[]{pasha, (Student) dasha, (Student) rita};
        Person[] newPersons = new Person[]{dasha, null, pasha, (Student) rita, andrew};
        Object[] myArr = new Object[]{dasha, pasha, rita, andrew, hausmaster};*/

        Student glasha = new Student("Глаша", "Васечкина", "2021_021", 25, true);
        System.out.println(glasha);
        glasha.eats();
        glasha.walks();
        glasha.setRating(15);
        glasha.paysForEducation();
        glasha.study();
        glasha.setPriceForEducation(true);
        System.out.println("------------------");
        Student tamara = new Student("Тамара", "Попова", "2045_021", 19, false);
        System.out.println(tamara);
        tamara.eats();
        tamara.setRating(20);
        tamara.paysForEducation();
        tamara.study();
        tamara.walks();
        tamara.setPriceForEducation(false);
        System.out.println("-------------------");
        Teacher marija = new Teacher("Мария", "Иванова", "125-125", 56, false);
        System.out.println(marija.toString());
        marija.eats();
        marija.walks();
        marija.teach();
        marija.treats();
        marija.setSalary(25000.00);
        System.out.println("-------------------");
        Teacher boris = new Teacher("Борис", "Добронравов", "124-874", 45, false);
        System.out.println(boris);
        boris.eats();
        boris.walks();
        boris.teach();
        boris.treats();
        System.out.println("-------------------");
        Worker vova = new Worker("Владимир", "Иванов", "124-900", 42, false);
        System.out.println(vova);
        System.out.println("-------------------");
        Worker olya = new Worker("Ольга", "Владимирова", "124-800", 38, true);
        System.out.println(olya);
        Univer mgu = new Univer(500);

        mgu.addPerson(glasha);
        mgu.addPerson(tamara);
        mgu.addPerson(marija);
        mgu.addPerson(boris);
        mgu.addPerson(vova);
        mgu.addPerson(olya);
        mgu.deletePerson(vova);

    }
}


