public class Book {
    private String title;
    private String author;
    private int price;


    public Book setTitle(String title){
        this.title = title;
        return this;
    }

    public Book setAuthor(String author){
        this.author = author;
        return this;
    }

    public Book setPrice(int price){
        this.price = price;
        return this;
    }
    
}
