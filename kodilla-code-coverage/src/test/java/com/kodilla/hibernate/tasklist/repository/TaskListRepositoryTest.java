package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListRepositoryTest {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "TODO";
    private static final String DESCRIPTION = "Test: Test findByListName()";

    @Test
    void findByListName() {
        //GIVEN
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //WHEN
        List<TaskList> readTaskList = taskListRepository.findByListName(listName);

        //THEN
        Assertions.assertEquals(1, readTaskList.size());

        //CLEAN UP
        taskListRepository.deleteById(readTaskList.get(0).getId());
    }
}