package school;

import java.util.ArrayList;
import java.util.List;

public class Clazz {
    private String name;
    private Teacher primaryTeacher;
    private List<Student> students;

    public Clazz(String name, Teacher primaryTeacher) {
        this.name = name;
        this.primaryTeacher = primaryTeacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.contains(student)){
            throw new RuntimeException("Student is in clazz!!");
        }
        students.add(student);
        student.setClazz(this);
    }
    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getPrimaryTeacher() {
        return primaryTeacher;
    }


}
