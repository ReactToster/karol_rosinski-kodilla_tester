package com.kodilla.optional.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {
    private List<Student> students;
    private List<String> teacherNames;
    @BeforeEach
    public void setUp() {
        teacherNames = new ArrayList<>();
        students = new ArrayList<>();
        students.add(new Student("Adam Karuzela", new Teacher("Tomasz Kierownik")));
        students.add(new Student("Karol Racuchowski", null));
        students.add(new Student("Marta Zadaniowa", new Teacher("Zbigniew Ryciński")));
        students.add(new Student("Dominika Walecka", null));

        for (Student student :
                students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            if (optionalTeacher.isEmpty())
                teacherNames.add(optionalTeacher.orElse(new Teacher("<undefined>")).getName());
        }
    }

    @Test
    public void testIfTeachersNameIsSetCorrectlyToUndefinedWhenTeachersObjectIsNull() {
        assertEquals("<undefined>", teacherNames.get(0));
        assertEquals("<undefined>", teacherNames.get(1));
    }
}
