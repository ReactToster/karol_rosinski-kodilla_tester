package com.kodilla.optional.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {
    private List<Student> students;
    private Application application;
    @BeforeEach
    public void setUp() {
        application = new Application();
        students = new ArrayList<>();
        students.add(new Student("Adam Karuzela", new Teacher("Tomasz Kierownik")));
        students.add(new Student("Karol Racuchowski", null));
        students.add(new Student("Marta Zadaniowa", new Teacher("Zbigniew Ryciński")));
        students.add(new Student("Dominika Walecka", null));
    }

    @Test
    public void testIfGetStudentsTeacherReturnsCorrectValue() {
        // given
        String teacherName;
        // when
        teacherName = application.getStudentsTeacher(students.get(0));
        // then
        assertEquals("Tomasz Kierownik", teacherName);
    }

    @Test
    public void testIfGetStudentsTeacherReturnsUndefined() {
        // given
        String teacherName;
        // when
        teacherName = application.getStudentsTeacher(students.get(1));
        // then
        assertEquals("<undefined>", teacherName);
    }
}
