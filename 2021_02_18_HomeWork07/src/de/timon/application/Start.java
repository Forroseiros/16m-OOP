package de.timon.application;

import de.timon.dao.Pack;
import de.timon.data.Book;

public class Start {
    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", "125-89-154-89", "Толстой", 1999, 1534, "твердый", "Роман", 4.9, 999);
        Book book2 = new Book("Колобок", "125-89-154-59", "Ушинский", 2005, 100, "мягкий", "сказка", 4.2, 250);
        Book book3 = new Book("Унесенные ветром", "145-90-154-89", "Иванов", 2015, 1300, "твердый", "Пища", 4.0, 385);
        Book book4 = new Book("Триумфальная арка", "125-89-869-89", "Эрих Мария Ремарк", 1856, 1000, "твердый", "Роман", 4.9, 837);
        Book book5 = new Book("Мастер и Маргарита", "113-89-154-96", "Булгаков", 1913, 820, "твердый", "Роман", 5.0, 841);

        Book[] array = new Book[]{book1, book2, book3, book4, book5};
        Pack shelf = new Pack(150);

        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);
        shelf.addBook(book4);
        shelf.addBook(book5);
        shelf.deleteBook(book5);

        printArray(array);
    }


    public static void coctailSort(Pack array) {
        int start = 0;
        int end = array.size - 1;

        while (start <= end) {
            boolean swap = false;

            for (int i = start; i < end; i++) {
                if (array.books[i].getRating() > array.books[i + 1].getRating()) {
                    Book temp = array.books[i];
                    array.books[i] = array.books[i + 1];
                    array.books[i + 1] = temp;
                    swap = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (array.books[i].getRating() < array.books[i - 1].getRating()) {
                    Book temp = array.books[i - 1];
                    array.books[i - 1] = array.books[i];
                    array.books[i] = temp;
                    swap = true;
                }
            }
            start++;
            if (!swap) {
                break;
            }
        }
    }

    public static void printArray(Book[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toDisplay());
        }
    }
}

class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", "125-89-154-89", "Толстой", 1999, 1534, "твердый", "Роман", 4.9, 999);
        Book book2 = new Book("Колобок", "125-89-154-59", "Ушинский", 2005, 100, "мягкий", "сказка", 4.2, 250);
        Book book3 = new Book("Унесенные ветром", "145-90-154-89", "Иванов", 2015, 1300, "твердый", "Пища", 4.0, 385);
        Book book4 = new Book("Триумфальная арка", "125-89-869-89", "Эрих Мария Ремарк", 1856, 1000, "твердый", "Роман", 4.9, 837);
        Book book5 = new Book("Мастер и Маргарита", "113-89-154-96", "Булгаков", 1913, 820, "твердый", "Роман", 5.0, 841);

        System.out.println(book1.toDisplay());


    }
}



