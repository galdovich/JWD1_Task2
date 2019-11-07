package PVP.Homework_5.task4;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String firstName;
    String surname;

    public Student() {
    }

    public Student(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    //overiding equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName);
    }

    //overiding hashCode
    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }

    //overiding toString
    @Override
    public String toString() {
        return "Имя: " + firstName + " | Фамилия: " + surname;
    }

    //overiding compareTo
    public int compareTo(Student o) {

        return this.surname.compareTo(o.surname);
    }
}

