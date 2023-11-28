package student;

import java.util.LinkedList;
import java.util.List;

public class HighestMarks {
    public static void main(String[] args) {
        Student s1 = new Student("A", 1, 100);

        List<Student> students = new LinkedList<>();
        students.add(s1);

        for (Student s:students){
            System.out.println(s);
        }
    }
}
