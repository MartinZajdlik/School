package school;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Clazz clazz;
    private Map<Subject, Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new HashMap<>();
    }

    public void setClazz(Clazz clazz) {
        if (this.clazz != null) {
            throw new RuntimeException("Student už má přiřazenou třídu.");
        }
        this.clazz = clazz;
    }

    public void addGrade(Subject subject, int grade) {
        if (grade < 1 || grade > 5) {
            throw new RuntimeException("Známka musí být mezi 1 a 5.");
        }
        grades.put(subject, grade);
    }

    public double getAverageGrade() {
        return grades.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public Map<Subject, Integer> getGrades() {
        return grades;
    }
}

