package de.timon.data;

public class Book {
    private String name;
    private String isbn;
    private String author;
    private int yearOfPublishing;
    private int pages;
    private String cover;
    private String genre;
    private double rating;
    private double price;
    static int count = 1;
    int bookNumber;

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
        bookNumber = count;
        count++;

    }

    void setName(String name) {
        this.name = name;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    void setPages(int pages) {
        this.pages = pages;
    }

    void setCover(String cover) {
        this.cover = cover;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    void setRating(double rating) {
        this.rating = rating;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getCover() {
        return cover;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getPages() {
        return pages;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public Book() {
        bookNumber = count;
        count++;

    }

    public String toDisplay() {
        return "Название книги: " + name + "\n" +
                "ISBN: " + isbn + "\n" + "Автор: " + author + "\n" +
                "Дата публикации: " + yearOfPublishing + "\n" +
                "Количество страниц: " + pages + "\n" +
                "Переплет: " + cover + "\n" +
                "Жанр: " + genre + "\n" + "Рейтинг: " + rating + "\n" +
                "Прайс: " + price + " руб" + "\n";
    }
}
