package PR2.tut7.library;


/* _____________________________________________________
|                      Catalog                          |
 -------------------------------------------------------
| - creationDate: String                                |
| - totalNumberOfBooks: int                             |
| - books: List<BookItem>                               |
 -------------------------------------------------------
| + Catalog(creationDate: String)                       |
| + addBook(book: BookItem): void                       |
| + getCreationDate(): String                           |
| + getTotalNumberOfBooks(): int                        |
| + getBooks(): List<BookItem>                          |
| + searchByTitle(title: String): List<BookItem>        |
| + searchByAuthor(author: String): List<BookItem>      |
| + searchBySubject(subject: String): List<BookItem>    |
| + searchByFormat(format: Format): List<BookItem>      |
| + toString(): String                                  |
 -------------------------------------------------------
*/




import java.util.ArrayList;
import java.util.List;

public abstract class Catalog implements Search {
    private final String creationDate;
    private int totalNumberOfBooks;
    private List<BookItem> books;

    public Catalog(String creationDate) {
        this.creationDate = creationDate;
        this.books = new ArrayList<>();
    }

    // Add a book to the catalog
    public void addBook(BookItem book) {
        books.add(book);
        totalNumberOfBooks++;
    }

    // Getters
    public String getCreationDate() {
        return creationDate;
    }

    public int getTotalNumberOfBooks() {
        return totalNumberOfBooks;
    }

    public List<BookItem> getBooks() {
        return books;
    }

    // Methods to override from Search interface
    @Override
    public List<BookItem> searchByTitle(String title) {
        List<BookItem> result = new ArrayList<>();
        for (BookItem book : books) {
            if (book.getBook().getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<BookItem> searchByAuthor(PR2.tut7.library.Person author) {
        List<BookItem> result = new ArrayList<>();
        for (BookItem book : books) {
            if (book.getBook().getAuthors().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }




    @Override
    public List<BookItem> searchBySubject(String subject) {
        List<BookItem> result = new ArrayList<>();
        for (BookItem book : books) {
            if (book.getBook().getSubject().equalsIgnoreCase(subject)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<BookItem> searchByFormat(Format format) {
        List<BookItem> result = new ArrayList<>();
        for (BookItem book : books) {
            if (book.getFormat() == format) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "creationDate='" + creationDate + '\'' +
                ", totalNumberOfBooks=" + totalNumberOfBooks +
                ", books=" + books + '}';
    }
}
