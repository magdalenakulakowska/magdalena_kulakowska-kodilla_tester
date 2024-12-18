package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskListRepositoryTestSuite {
    @Autowired
    TaskListRepository taskListRepository;

    private static final String TITLE = "Test list";
    private static final String DESCRIPTION = "Test list: Learn Hibernate";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(TITLE, DESCRIPTION);
        taskListRepository.save(taskList);
        String title = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(title);

        //Then
        assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.getFirst().getId();
        taskListRepository.deleteById(id);
    }
}