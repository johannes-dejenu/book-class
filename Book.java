public record Book(String title, String author, int price) {

    public Book{
        if (price < 0){
            throw new IllegalArgumentException("Price can't be negative.");
        }
        if (title.equals("")){
            throw new IllegalArgumentException("Title can't be blank.");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("I want you to be happy", "Jem Calder", 26);
        System.out.println(book.title());
        System.out.println(book.author());
        System.out.println(book.price());
    }
}
