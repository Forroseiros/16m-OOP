public class MyTest {
    public static void main(String[] args) {
        Article art1 = new Article("Cities","Views");
        Article art2 = new Article("Best food","Cooking");
        System.out.println(art1.title);
        System.out.println(art2.announce);
        //Создали конструктор с параметрами

        Article art3 = new Article(13, "The best food","How to cook the best food");
        System.out.println(art3.title);
    }



}
