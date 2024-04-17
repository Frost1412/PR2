package PR2.tut8.course;

import java.util.Comparator;

public class Coursenamesosanh implements Comparator<Course> {
    public int compare(Course c1, Course c2) {
        return c1.name.compareTo(c2.name);
    }

}
