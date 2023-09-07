package com.app.todo.repository;

import com.app.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findByTask(String task);

    List<Todo> findByIsCompleted(Boolean isCompleted);
}