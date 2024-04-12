package books;

public class TestBook {
    public static void main(String[] args) {
        Book.Author author = new Book.Author("JRR", "Tolkien");
        Book book1 = new Book("Lord of the Rings", 600, author);

        System.out.println(book1);
    }
}
