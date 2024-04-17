package PR2.tut7.library;

import java.util.List;
/*
        ____________________________________________________
        |                        Book                       |
        ----------------------------------------------------
        | - ISBN: String                                    |
        | - title: String                                   |
        | - subject: String                                 |
        | - authors: List<Person>                           |
        | - publishers: List<Person>                        |
        | - language: Language                              |
        | - numberOfPages: int                              |
         ---------------------------------------------------
        | + Book(ISBN: String, title: String,               |
        |        subject: String, authors:                  |
        |        List<Person>, publishers:                  |
        |        List<Person>, language: Language,          |
        |        numberOfPages: int)                        |
        | + getISBN(): String                               |
        | + getTitle(): String                              |
        | + getSubject(): String                            |
        | + getAuthors(): List<Person>                      |
        | + getPublishers(): List<Person>                   |
        | + getLanguage(): Language                         |
        | + getNumberOfPages(): int                         |
        | + setISBN(ISBN: String): void                     |
        | + setTitle(title: String): void                   |
        | + setAuthors(authors: List<Person>): void         |
        | + setPublishers(publishers: List<Person>): void   |
        | + setLanguage(language: Language): void           |
        | + setNumberOfPages(numberOfPages: int): void      |
        | + toString(): String                              |
         ---------------------------------------------------
*/



public class Book {
    private String ISBN;
    private String title;
    private String subject;
    private List<Person> authors;
    private List<Person> publishers;
    private Language language;
    private int numberOfPages;

    public Book(String ISBN, String title, String subject, List<Person> authors, List<Person> publishers, Language language, int numberOfPages) {
        this.ISBN = ISBN;
        this.title = title;
        this.subject = subject;
        this.authors = authors;
        this.publishers = publishers;
        this.language = language;
        this.numberOfPages = numberOfPages;
    }

    
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public List<Person> getAuthors() {
        return authors;
    }

    public List<Person> getPublishers() {
        return publishers;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Language getLanguage() {
        return language;
    }

    public void setISBN(String ISBN) {
        if (ISBN != null && !ISBN.isEmpty()) {
            this.ISBN = ISBN;
        } else {
            throw new IllegalArgumentException("ISBN cannot be null or empty.");
        }
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
    }

    public void setAuthors(List<Person> authors) {
        if (authors != null && !authors.isEmpty()) {
            this.authors = authors;
        } else {
            throw new IllegalArgumentException("Authors list cannot be null or empty.");
        }
    }

    public void setPublishers(List<Person> publishers) {
        this.publishers = publishers;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                ", publishers=" + publishers +
                ", language='" + language + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
