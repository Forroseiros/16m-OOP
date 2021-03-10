package appl;

import data.Book;

public class BooksAppl {
    public static void main(String[] args) {
        Book book1 = new Book("Собачье сердце", 1238476, "Булгаков", 356, 2);
        Book book2 = new Book("Война и мир", 5187962, "Толстой", 1856, 3);
        Book book3 = new Book("Вишневый сад", 1238472, "Чехов", 415, 1);
        Book book4 = new Book("Унесенные ветром", 1569476, "Маргарет Митчел", 613, 2);
        Book book5 = new Book("Мертвые души", 1263476, "Гоголь", 318, 1);
        Book book6 = new Book("Мастер и Маргарита", 1263471, "Булгаков", 518, 3);
        System.out.println(book6);

        Book[] shelf = new Book[]{book1, book2, book3, book4, book5, book6};
//712 5568 415 1226 318 1554 total price
        printBooks(shelf);
        totalPrice(shelf);

    }

    private static void printBooks(Book[] shelf) {
        for (int i = 0; i < shelf.length - 1; i++) {
            System.out.println(shelf[i]);

        }

    }

    public static void totalPrice(Book[] shelf) {
        double sumPrice = 0;
        for (int i = 0; i < shelf.length; i++) {

            sumPrice += shelf[i].getCountPages() * shelf[i].getPricePerPage();
        }

        System.out.println("total price = " + sumPrice);
    }
}

