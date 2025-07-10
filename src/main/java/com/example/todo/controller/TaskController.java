package com.example.todo.controller;

import com.example.todo.model.Task;
import com.example.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TaskController {               

    @Autowired
    private TaskRepository repo;

    @GetMapping("/tasks")
    public List<Task> getAll() {
        return repo.findAll();
    }

    @PostMapping("/task")
    public Task create(@RequestBody Task task) {
        return repo.save(task);
    }

    @PutMapping("/task/{id}")
    public Task update(@PathVariable String id, @RequestBody Task task) {
        task.setId(id);
        return repo.save(task);
    }

    @DeleteMapping("/task/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Running";
    }
}
