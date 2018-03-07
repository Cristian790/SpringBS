package com.springBS.dao;

import org.springframework.data.repository.CrudRepository;

import com.springBS.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
