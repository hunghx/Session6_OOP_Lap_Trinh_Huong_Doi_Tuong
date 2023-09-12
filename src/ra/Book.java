package ra;

public class Book {
    static int year = 2023;
   private String id;
   private String name;
   private int countPage;
   private  double price;
   private  String author;

    public Book() {
    }

    public Book(String id, String name, int countPage, double price, String author) {
        this.id = id;
        this.name = name;
        this.countPage = countPage;
        this.price = price;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString(){
        return "Tên sách : "+ this.name + " Tác giả : "+this.author  ;
    }

}
