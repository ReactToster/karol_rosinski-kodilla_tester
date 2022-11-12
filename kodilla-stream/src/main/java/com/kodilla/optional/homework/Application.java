package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam Karuzela", new Teacher("Tomasz Kierownik")));
        students.add(new Student("Karol Racuchowski", null));
        students.add(new Student("Marta Zadaniowa", new Teacher("Zbigniew Ryciński")));
        students.add(new Student("Dominika Walecka", null));

        for (Student student :
                students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            System.out.println(
                    "uczeń: " + student.getName() +
                    " nauczyciel: " + optionalTeacher.orElse(new Teacher("<undefined>")).getName()
            );
        }
    }

    public String getStudentsTeacher(Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        return optionalTeacher.orElse(new Teacher("<undefined>")).getName();
    }
}
