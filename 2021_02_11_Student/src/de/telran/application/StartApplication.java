package de.telran.application;

import de.telran.data.Student;

public class StartApplication {
    public static void main(String[] args) {
        Student vasya = new Student("Василий","Петров",23);
        Student sergei = new Student("Сергей", "Чумаков", 25);
        Student varvara = new Student("Варвара", "Калушкина", 21);
        Student katya = new Student("Екатерина", "Тимонина",32);
        /*System.out.println(katya.toDisplay());
        System.out.println(vasya.toDisplay());
        System.out.println(varvara.toDisplay());
        System.out.println(sergei.toDisplay());
        System.out.println(sergei.age);*/

        Student[] groupTUBerlin = new Student[]{varvara,vasya,katya,sergei};

        studentsPrint(groupTUBerlin);

    }
    public static void studentsPrint(Student[] group){

        for (int i = 0; i < group.length ; i++) {
            System.out.println(group[i]);
        }

    }

}
