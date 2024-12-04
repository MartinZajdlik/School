package school;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Subject> subjects;

    public Teacher(String name) {
        this.name = name;
        this.subjects = new ArrayList<school.Subject>();
    }

    public void addSubject(school.Subject subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
        }
    }

    public String getName(){
        return name;
    }

    public List<school.Subject> getSubjects(){
        return subjects;
    }

}
