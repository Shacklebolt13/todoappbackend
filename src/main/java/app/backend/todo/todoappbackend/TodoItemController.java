package app.backend.todo.todoappbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class TodoItemController {

    @Autowired
    private TodoItemService todoItemService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/todos")
    @ResponseBody
    public TodoItem[] getTodoItems() {
        return todoItemService.getTodoItems().toArray(new TodoItem[0]);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/todo")
    @ResponseBody
    public TodoItem addTodoItem(@RequestBody(required = true) TodoItem todoItem) {
        System.out.println("Added TodoItem: " + todoItem);

        todoItemService.addTodoItem(todoItem);

        return todoItem;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateTodo")
    @ResponseBody
    public TodoItem updateTodoItem(@RequestBody(required = true) TodoItem todoItem) {
        System.out.println("Updated TodoItem: " + todoItem);

        todoItemService.updateTodoItem(todoItem);

        return todoItem;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteTodo")
    @ResponseBody
    public TodoItem deleteTodoItem(@RequestBody(required = true) TodoItem todoItem) {
        System.out.println("Deleted TodoItem: " + todoItem);

        todoItemService.deleteTodoItem(todoItem);

        return todoItem;
    }
}
