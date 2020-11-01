package com.ToDo.service.impl;

import com.ToDo.model.ToDo;
import com.ToDo.repository.ToDoRepository;
import com.ToDo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    public ToDoRepository toDoRepository;

    @Override
    public ToDo create(ToDo toDo) {

        if(toDo.getId() != null) {
            return null;
        }

        return toDoRepository.save(toDo);
    }

    @Override
    public void delete(Long id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public ToDo update(ToDo toDo) {

        if(toDo.getId() == null) {
            return null;
//            return new ToDo();
        }

        return toDoRepository.save(toDo);
    }
}
