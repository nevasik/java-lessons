package FunctionalProgrammingHomework;

import java.util.List;

public class Student {
    private String name;
    private String surname;
    private int numberOfCourse;
    private List<Integer> evaluations;

    public Student(String name, String surname, int numberOfCourse, List<Integer> evaluations) {
        this.name = name;
        this.surname = surname;
        this.numberOfCourse = numberOfCourse;
        this.evaluations = evaluations;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public List<Integer> getEvaluations() {
        return evaluations;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
