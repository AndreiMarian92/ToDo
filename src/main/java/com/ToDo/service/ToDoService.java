package com.ToDo.service;

import com.ToDo.model.ToDo;

public interface ToDoService {

    ToDo update(ToDo toDo);

    ToDo create(ToDo toDo);

    void delete(Long id);
}
