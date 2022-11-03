package com.kodilla.collections.adv.maps.homework;

import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> numberOfStudentsForEachClass;

    public School(String schoolName, List<Integer> numberOfStudentsForEachClass) {
        this.schoolName = schoolName;
        this.numberOfStudentsForEachClass = numberOfStudentsForEachClass;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + schoolName + '\'' +
                ", numberOfStudentsForEachClass=" + numberOfStudentsForEachClass +
                '}';
    }
}
