package books;

public class Book {

    //outter class
    private String title;
    private int pages;
    private Author author;

    public Book(String title, int pages, Author author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    @Override
    public String toString() {
        return "books.Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }

    //inner class
    public static class Author{
        private String fName;
        private String lName;

        public Author(String fName, String lName) {
            this.fName = fName;
            this.lName = lName;
        }
    }
}
