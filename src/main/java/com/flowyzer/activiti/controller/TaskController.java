package com.flowyzer.activiti.controller;


import com.flowyzer.activiti.domain.TaskCommentRequestModel;
import com.flowyzer.activiti.service.TaskItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/task")
public class TaskController {

    @Autowired
    private TaskItemService taskItemService;

    @RequestMapping("/")
    public ResponseEntity getTaskList() {
        return ResponseEntity.ok().body(taskItemService.taskList());

    }

    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public ResponseEntity addComment(@RequestBody TaskCommentRequestModel taskCommentRequestModel) {
        return ResponseEntity.ok().body(taskItemService.addTaskComment(taskCommentRequestModel.getTaskId(), taskCommentRequestModel.getComment()));
    }
}
