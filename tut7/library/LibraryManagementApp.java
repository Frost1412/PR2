package PR2.tut7.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementApp {
    public static void main(String[] args) {
        Person p1 = new Person("duong","duong@gmail.com");
        Person p2 = new Person("tuan","tuan@gmail.com");
        Person p3 = new Person("dinh","dinh@gmail.com");
        Person p4 = new Person("hieu","hieu@gmail.com");


        Account a1 = new Account("12","123",AccountStatus.ACTIVE,p1,AccountType.GENERAL_MEMBER);

        //Print account 1
        System.out.println("Information of account 1: " + a1);

        //Make a list of authors for book 1
        List<Person> authors = new ArrayList<>();
        authors.add(p1);
        authors.add(p2);

        //Make a list of publishers for book 1
        List<Person> publishers = new ArrayList<>();
        publishers.add(p3);
        publishers.add(p4);
        //Initialize books
        Book b1 = new Book("12351","toan","it",authors,publishers,Language.VIETNAMESE,300);
        //Print Book 1
        System.out.println("Information of book 1: " + b1);

        //Initialize a book item of book 1
        BookItem bi1 = new BookItem(b1,"123798715",100,Format.MAGAZINE,BookItemStatus.AVAILABLE,new Date("31/13/2024"),new Date("10/01/2010"));
        System.out.println("Information of book item of book 1: "+bi1);

        //Initialize a catalog
//        Catalog c1 = new Catalog("10/12/2024");
//        c1.addBook(bi1);

        //Print catalog
//        System.out.println("Information of catalog: " + c1);
//
//        //Print books in catalog 1 that have author "duong"
//        System.out.println(c1.searchByAuthor(p1));

    }
}
