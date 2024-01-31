package com.webgenerals.sm02.springboot1.dao;

import com.webgenerals.sm02.springboot1.ds.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemsDao extends CrudRepository<TodoItem, Integer> {
}
