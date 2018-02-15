package com.flowyzer.activiti.service;


import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskItemService {

    @Autowired
    private TaskService taskService;

    public List<Task> taskList() {
        //Login olan kullanıcıyı ile getirilecek
        return taskService.createTaskQuery().taskAssignee("1").active().list();
    }

    public Task addTaskComment(String id, String message) {
        Task task = taskService.createTaskQuery().taskId(id).singleResult();
        taskService.addComment(task.getId(), task.getProcessInstanceId(), message);
        return task;
    }
}
