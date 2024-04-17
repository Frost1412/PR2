package PR2.tut8.course;
import java.util.Comparator;
public class Coursecreditsosanh implements Comparator<Course> {
    public int compare(Course c1, Course c2) {
        return Integer.compare(c1.credits, c2.credits);
    }

}
