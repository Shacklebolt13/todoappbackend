package app.backend.todo.todoappbackend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class TodoItemController {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getTodos")
    @ResponseBody
    public TodoItem[] getTodoItem() {

        // fetch from db
        TodoItem[] todoA = { new TodoItem(1, "mayank", "test description", false),
                new TodoItem(2, "title", "desc", false) };
        return todoA;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addTodo")
    @ResponseBody
    public TodoItem addTodoItem(@RequestBody(required = true) TodoItem todoItem) {
        System.out.println("Added TodoItem: " + todoItem);

        // save to db

        return todoItem;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/updateTodo")
    @ResponseBody
    public TodoItem updateTodoItem(@RequestBody(required = true) TodoItem todoItem) {
        System.out.println("Updated TodoItem: " + todoItem);

        // save to db

        return todoItem;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/deleteTodo")
    @ResponseBody
    public TodoItem deleteTodoItem(@RequestBody(required = true) TodoItem todoItem) {
        System.out.println("Deleted TodoItem: " + todoItem);

        // save to db

        return todoItem;
    }
}
