package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskRepositoryTest {
    @Autowired
    private TaskRepository taskRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testTaskRepositoryFindByDuration() {
        //GIVEN
        Task task = new Task(DESCRIPTION, 7);
        taskRepository.save(task);
        int duration = task.getDuration();

        //WHEN
        List<Task> readTasks = taskRepository.findByDuration(duration);

        //THEN
        Assertions.assertEquals(1, readTasks.size());

        //CLEAN UP
        int id = readTasks.get(0).getId();
        taskRepository.deleteById(id);
    }
}