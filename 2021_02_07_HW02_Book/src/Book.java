public class Book {
    String name;
    String isbn;
    String author;
    int yearOfPublishing;
    int pages;
    String cover;
    String genre;
    double rating;
    double price;

    public Book(String name, String isbn, String author, int yearOfPublishing,
                int pages, String cover, String genre, double rating, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.pages = pages;
        this.cover = cover;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
    }

    public Book(String isbn, String author, int yearOfPublishing, int pages) {
        this.isbn = isbn;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.pages = pages;
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, String author, String cover, double rating) {
        this.name = name;
        this.author = author;
        this.cover = cover;
        this.rating = rating;
    }

    public Book(String name, String author, double rating, double price) {
        this.name = name;
        this.author = author;
        this.rating = rating;
        this.price = price;
    }

    public void toDisplay() {
        System.out.println("Название книги: " + name);
        System.out.println("ISBN: " + isbn);
        System.out.println("Автор: " + author);
        System.out.println("Дата публикации: " + yearOfPublishing);
        System.out.println("Количество страниц: " + pages);
        System.out.println("Переплет: " + cover);
        System.out.println("Жанр: " + genre);
        System.out.println("Рейтинг: " + rating);
        System.out.println("Прайс: " + price + " руб");
    }
}

