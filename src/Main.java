
import school.Clazz;
import school.Student;
import school.Subject;
import school.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacherMartin = new Teacher("Martin");
        Teacher teacherPetr = new Teacher("Peter");

        Subject math = new Subject("Mathemathics", teacherMartin);
        Subject programming = new Subject("Programming" , teacherMartin);
        Subject history = new Subject("History", teacherPetr);
        Subject english = new Subject("English", teacherPetr);

        teacherMartin.addSubject(math);
        teacherMartin.addSubject(programming);
        teacherPetr.addSubject(history);
        teacherPetr.addSubject(english);

        Clazz clazzA = new Clazz("9.A", teacherMartin);
        Clazz clazzB = new Clazz("9.B", teacherPetr);

        Student student1 = new Student("George");
        Student student2 = new Student("Johnny");
        Student student3 = new Student("Mark");

        Student student4 = new Student("Mike");
        Student student5 = new Student("Anne");
        Student student6 = new Student("Mia");

        clazzA.addStudent(student1);
        clazzA.addStudent(student2);
        clazzA.addStudent(student3);

        clazzB.addStudent(student4);
        clazzB.addStudent(student5);
        clazzB.addStudent(student6);

        student1.addGrade(math, 3);
        student1.addGrade(history, 2);
        student1.addGrade(programming, 1);
        student1.addGrade(english, 1);

        student2.addGrade(math, 3);
        student2.addGrade(history, 1);
        student2.addGrade(programming, 4);
        student2.addGrade(english, 2);

        student3.addGrade(math, 3);
        student3.addGrade(history, 1);
        student3.addGrade(programming, 4);
        student3.addGrade(english, 2);


        List<Student> allStudents = new ArrayList<>(clazzA.getStudents());
        allStudents.addAll(clazzA.getStudents());

        allStudents.sort(Comparator.comparingDouble(Student::getAverageGrade));
        System.out.println("Students by average grades:");
        allStudents.forEach(s -> System.out.println(s.getName() + ": " + s.getAverageGrade()));






    }
}