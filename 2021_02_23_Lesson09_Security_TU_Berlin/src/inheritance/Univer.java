package inheritance;

public class Univer {
    public Person[] persons;
    public int size;

    public Univer(int capacity) {
        persons = new Person[capacity];
        size = 0;
    }

    public boolean addPerson(Person person) {
        if (size < persons.length) {
            persons[size] = person;
            size++;
            return true;
        }
        return false;
    }

    public boolean deletePerson(Person person) {
        for (int i = 0; i < size; i++) {
            if (persons[i].equals(person)) {
                persons[i] = persons[size - 1];
                size--;
                return true;
            }

        }
        return false;
    }
}
