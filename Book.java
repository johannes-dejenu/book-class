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
    public void displayInfo(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("I want you to be happy")
            .setAuthor("Jem Calder")
            .setPrice(26);
        book.displayInfo();
    }

}
