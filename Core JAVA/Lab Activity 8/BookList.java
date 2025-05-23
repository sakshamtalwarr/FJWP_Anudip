import java.util.ArrayList;

class Book {
    int bookId;
    String bookName;
    String authorName;

    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
}

public class BookList {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1, "The Alchemist", "Paulo Coelho"));
        books.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(3, "1984", "George Orwell"));

        for (Book b : books) {
            System.out.println("Book ID: " + b.bookId);
            System.out.println("Book Name: " + b.bookName);
            System.out.println("Author Name: " + b.authorName);
            System.out.println();
        }
    }
}
