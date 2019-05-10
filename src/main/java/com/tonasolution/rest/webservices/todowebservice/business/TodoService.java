package com.tonasolution.rest.webservices.todowebservice.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tonasolution.rest.webservices.todowebservice.entity.Todo;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;
	static {
		todos.add(
				new Todo(
						++idCounter, 
						"tonasolution", 
						"Learn java",
						new Date(),
						false
				));
		todos.add(new Todo(
						++idCounter, 
						"tonasolution", 
						"Learn Html",
						new Date(),
						false
				)
		);
		todos.add(
				new Todo(
						++idCounter, 
						"tonasolution", 
						"Learn marketing",
						new Date(),
						false
				)
		);
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	public Todo save(Todo todo) {
		
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			this.todos.add(todo);
		} else {
			deleteById(todo.getId());
			this.todos.add(todo);
		}
		
		return todo;
	}
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		
		if(todo == null) return null;
		
		if(todos.remove(todo)) return todo;
		
		return null;
	}

	public Todo findById(long id) {
		
		for(Todo todo: todos) {
			if(todo.getId() == id) return todo;
		} 
		
		return null;
	}
}
