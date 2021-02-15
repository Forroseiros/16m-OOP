public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Собачье сердце", "123-84-762-03", "Булгаков",
                1985, 356, "твердый", "повесть", 4.5, 856);
        //  book1.toDisplay();
        System.out.println("_____________________________");

        Book book2 = new Book("125-8597-5478", "Толстой", 1881, 1450);
        //   book2.toDisplay();
        System.out.println("_____________________________");

        Book book3 = new Book("Вишневый сад", "Чехов", 245);
        //  book3.toDisplay();
        System.out.println("_____________________________");

        Book book4 = new Book("Унесенные ветром", "Маргарет Митчел", "твердый", 4.3);
        //   book4.toDisplay();
        System.out.println("_____________________________");

        Book book5 = new Book("Мертвые души", "Гоголь", 4.6, 355);
        //   book5.toDisplay();

        Book[] array = new Book[]{book1, book2, book3, book4, book5};
        booksArrayPrint(array);
        booksSorting(array);
        booksArrayPrint(array);


    }

    private static void booksArrayPrint(Book[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i].name + " " + input[i].rating + " - ");

        }
        System.out.println();
    }

    private static void booksSorting(Book[] input) {
        boolean unsorted = false;
        for (int i = 0; i < input.length - 1; i++) {
            unsorted = false;
            if (input[i].rating > input[i + 1].rating) {
                //swap -
                Book temp = input[i];
                input[i] = input[i + 1];
                input[i + 1] = temp;
                unsorted = true;
            }

        }
        if (unsorted) {
            booksSorting(input);
        }
    }
}





