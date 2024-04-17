package PR2.tut8.person;

import java.util.Arrays;
import java.util.List;

public class    testperson {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person(12, "John Doe", "01011990"),
                new Person(125, "Alice Smith", "02021985"),
                new Person(123, "Bob Johnson", "03031980")
        );

        persons.sort(new Person.SortByName());

        System.out.println("Sorted by age:");

        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getDateOfBirth());
        }
    }
}
    