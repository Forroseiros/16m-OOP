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
    void setName(String name){
        this.name = name;
    }
    void setIsbn(String isbn){
        this.isbn = isbn;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setYearOfPublishing(int yearOfPublishing){
        this.yearOfPublishing = yearOfPublishing;
    }
    void setPages (int pages){
        this.pages = pages;
    }
    void setCover (String cover){
        this.cover = cover;
    }
    void setGenre(String genre){
        this.genre = genre;
    }
    void setRating (double rating){
        this.rating = rating;
    }
    void setPrice(double price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getAuthor(){
        return author;
    }
    public String getCover(){
        return cover;
    }
    public String getGenre(){
        return genre;
    }
    public int getYearOfPublishing(){
        return yearOfPublishing;
    }
    public int getPages(){
        return pages;
    }
    public double getRating(){
        return rating;
    }
    public double getPrice(){
        return price;
    }

    public Book() {
        bookNumber = count;
        count++;

    }
}

class TestBook{
    public static void main(String[] args) {
       Book book1 = new Book("Война и Мир", "125-89-154-89", "Толстой", 1999, 1534,"твердый","Роман", 4.9, 999);
       Book book2 = new Book("Колобок", "125-89-154-59", "Ушинский", 2005, 100,"мягкий","сказка", 4.2, 250);
       Book book3 = new Book("Унесенные ветром", "145-90-154-89", "Иванов", 2015, 1300,"твердый","Пища", 4.0, 385);
       Book book4 = new Book("Триумфальная арка", "125-89-869-89", "Эрих Мария Ремарк", 1856, 1000,"твердый","Роман", 4.9, 837);
       Book book5 = new Book("Мастер и Маргарита", "113-89-154-96", "Булгаков", 1913, 820,"твердый","Роман", 5.0, 841);

        System.out.println(book1.getName());
        System.out.println(book2.getName());
        System.out.println(book3.getAuthor());


    }
}
