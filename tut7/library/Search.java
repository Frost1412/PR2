package PR2.tut7.library;


/*
 ___________________________________________
|                   Search                  |
 -------------------------------------------
| + searchByTitle(title: String):           |
|        List<BookItem>                     |
| + searchByAuthor(author: String):         |
|        List<BookItem>                     |
| + searchBySubject(subject: String):       |
|        List<BookItem>                     |
| + searchByFormat(format: Format):        |
|        List<BookItem>                     |
 -------------------------------------------

 */


import java.util.List;

public interface Search {
    List<BookItem> searchByTitle(String title);
    List<BookItem> searchByAuthor(Person author);

    List<BookItem> searchBySubject(String subject);
    List<BookItem> searchByFormat(Format format);
}
