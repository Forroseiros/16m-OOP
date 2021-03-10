package data;

public class Book {
    private String name;
    private long isbn;
    private String author;
    private int countPages;
    private double pricePerPage;

    public Book(String name, long isbn, String author, int countPages, double pricePerPage) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "No name";
        } else {
            this.name = name;
        }

        setIsbn(isbn);

        this.author = author;

        if (countPages > 1 && countPages < 10000)
            this.countPages = countPages;


        setPricePerPage(pricePerPage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        if (isbn > 999999 && isbn < 9999999)
            this.isbn = isbn;
        else
            System.out.println("Wrong ISBN");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    public void setPricePerPage(double pricePerPage) {
        if (pricePerPage > 0 && pricePerPage < 10)
            this.pricePerPage = pricePerPage;
        else System.out.println("Wrong price");

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", isbn=" + isbn +
                ", author='" + author + '\'' +
                ", countPages=" + countPages +
                ", pricePerPage=" + pricePerPage +
                '}';
    }
}
