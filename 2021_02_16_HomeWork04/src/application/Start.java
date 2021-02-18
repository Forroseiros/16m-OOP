package application;


import dao.Shelf;
import data.Book;

public class Start {
    public static void main(String[] args) {
        Book book1 = new Book("Собачье сердце", "123-84-762-03",
                "Булгаков", 1985, 356, "твердый", "повесть", 4.5, 856);
        Book book2 = new Book("Война и мир", "125-8597-5478",
                "Толстой", 1881, 1450, "твердый", "роман", 4.9, 1500);
        Book book3 = new Book("Вишневый сад", "125-8597-5489",
                "Чехов", 1995, 245, "мягкий", "роман", 4.2, 311);
        Book book4 = new Book("Унесенные ветром", "125-8597-5459",
                "Маргарет Митчел", 1999, 856, "твердый", "роман", 4.3, 995);
        Book book5 = new Book("Мертвые души", "125-8597-5879",
                "Гоголь", 2002, 368, "мягкий", "мистика", 4.6, 355);

        Book[] array = new Book[]{book1, book2, book3, book4, book5};

        Shelf shelfClassic = new Shelf(10);

        shelfClassic.addBook(book1);
        System.out.println(shelfClassic.size);
        shelfClassic.addBook(book2);
        shelfClassic.addBook(book3);
        System.out.println(shelfClassic.size);
        shelfClassic.addBook(book4);
        shelfClassic.addBook(book5);
        shelfClassic.deleteBook(book1);
        System.out.println(shelfClassic.size);

        // bookPrint(array);
    }

    public static void bookPrint(Book[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i].toDisplay());

        }
    }
}
