package com.springBS.controller;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springBS.model.Task;
import com.springBS.service.TaskService;


@Controller
public class MainController {
	
	@Autowired
	private TaskService  taskService;
	
	
	@GetMapping(path="/all-json")
	public @ResponseBody Iterable<Task> getAllUsersJSON() {
		// This returns a JSON or XML with the users
		return taskService.findAll();
	}
//	@GetMapping(path="/all")
//	public @ResponseBody String getAllUsers() {
//		// This returns a JSON or XML with the users
//		return taskService.findAll().toString();
//	}
	
//	@GetMapping("/add")
//	public @ResponseBody String save(@RequestParam String name, @RequestParam String desc) {
//		Task task=new Task(name,desc,new Date(),false);
//		taskService.add(task);
//		return "Task Saved";
//	}
//	
//	@GetMapping("/delete")
//	public @ResponseBody String delete(@RequestParam int id) {
//		taskService.delete(id);
//		return "Task Delete";
//	}
}
