package PR2.tut8.course;
import java.util.Comparator;
public class Coursedepartmentsosanh implements Comparator<Course> {
    public int compare(Course c1, Course c2) {
        return c1.department.compareTo(c2.department);
    }
}
