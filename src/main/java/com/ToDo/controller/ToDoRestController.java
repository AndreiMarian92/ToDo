package com.ToDo.controller;


import com.ToDo.model.ToDo;
import com.ToDo.repository.ToDoRepository;
import com.ToDo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/todo")
public class ToDoRestController {

    @Autowired
    public ToDoRepository toDoRepository;

    @Autowired
    public ToDoService toDoService;

    @GetMapping(value = "/all")
    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    @PostMapping(value = "/create")
    public ToDo create(@RequestBody ToDo toDo){
        return toDoService.create(toDo);
    }

    @PutMapping(value = "/update")
    public ToDo update(@RequestBody ToDo toDo){
        return toDoService.update(toDo);
    }

//    @DeleteMapping(value = "/delete/{id}")
//    public void delete(@PathVariable Long id) {
//        toDoService.delete(id);
//    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestParam(name = "id") Long id) {
        toDoService.delete(id);
    }
}
