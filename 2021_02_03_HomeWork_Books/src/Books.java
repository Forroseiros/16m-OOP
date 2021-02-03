public class Books {
   /* Создать класс книги: название,
    isbn, автор, год издания, количество страниц,
    переплёт, жанр, рейтинг, цена(, возможно параметры, которые придумаете сами).
    Создать 5 экземпляров этого класса:
    азбука, война и мир, книга о вкусной и полезной пище, и два своих примера.
    Использовать в названиях переменных осмысленный английский язык.*/

    String name;
    String isbn;
    String author;
    int yearOfPublishing;
    int pages;
    String cover;
    String genre;
    double rating;
    double price;

    public void bookInfo() {
        System.out.println("Name: " + name);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Year of Publishing: " + yearOfPublishing);
        System.out.println("Pages: " + pages);
        System.out.println("Cover: " + cover);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + price + " Rub");
    }
}

class TestOfBooks {
    public static void main(String[] args) {
        Books alphabet = new Books();
        Books warAndPeace = new Books();
        Books healthyFood = new Books();
        Books masterAndMargarita = new Books();
        Books dictionary = new Books();

        alphabet.name = "Alphabet";
        alphabet.isbn = "978-5-367-65724-3";
        alphabet.author = "Ivanov S.E.";
        alphabet.yearOfPublishing = 2003;
        alphabet.pages = 185;
        alphabet.cover = "hard";
        alphabet.genre = "education";
        alphabet.rating = 4.6;
        alphabet.price = 185.90;
        alphabet.bookInfo();
        System.out.println("__________________________");

        warAndPeace.name = "War and Peace";
        warAndPeace.isbn = "983-5-367-68125-4";
        warAndPeace.author = "Tolstoy L.N.";
        warAndPeace.yearOfPublishing = 1991;
        warAndPeace.pages = 1300;
        warAndPeace.cover = "hard";
        warAndPeace.cover = "novel";
        warAndPeace.rating = 4.9;
        warAndPeace.price = 999.99;
        warAndPeace.bookInfo();
        System.out.println("__________________________");

        healthyFood.name = "Healthy food";
        healthyFood.isbn = "983-5-367-68125-4";
        healthyFood.author = "Sharapova G.V.";
        healthyFood.yearOfPublishing = 2017;
        healthyFood.pages = 128;
        healthyFood.cover = "soft";
        healthyFood.cover = "education";
        healthyFood.rating = 3.5;
        healthyFood.price = 228.00;
        healthyFood.bookInfo();
        System.out.println("__________________________");

        masterAndMargarita.name = "Master and Margarita";
        masterAndMargarita.isbn = "983-5-367-68125-4";
        masterAndMargarita.author = "Bulgakov M.A.";
        masterAndMargarita.yearOfPublishing = 1996;
        masterAndMargarita.pages = 480;
        masterAndMargarita.cover = "hard";
        masterAndMargarita.cover = "novel";
        masterAndMargarita.rating = 5.0;
        masterAndMargarita.price = 569.00;
        masterAndMargarita.bookInfo();
        System.out.println("__________________________");

        dictionary.name = "Dictionary of English";
        dictionary.isbn = "983-5-367-71243-8";
        dictionary.author = "Stupin D.D.";
        dictionary.yearOfPublishing = 2020;
        dictionary.pages = 583;
        dictionary.cover = "hard";
        dictionary.cover = "education";
        dictionary.rating = 3.9;
        dictionary.price = 685.70;
        dictionary.bookInfo();
    }

}


