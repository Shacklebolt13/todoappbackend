package app.backend.todo.todoappbackend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoItemService {

    @Autowired
    TodoItemRespository todoItemRepository;

    public List<TodoItem> getTodoItems() {
        System.out.println("getTodoItems");
        List<TodoItem> todoItems = new ArrayList<TodoItem>();
        todoItemRepository.findAll().forEach(item -> todoItems.add(item));
        return todoItems;
    }

    public void deleteTodoItem(TodoItem todoItem) {
        System.out.println("Deleted TodoItem: " + todoItem);
        todoItemRepository.delete(todoItem);
    }

    public void addTodoItem(TodoItem todoItem) {
        System.out.println("Added TodoItem: " + todoItem);
        todoItemRepository.save(todoItem);
    }

    public void updateTodoItem(TodoItem todoItem) {
        System.out.println("Updated TodoItem: " + todoItem);
        todoItemRepository.save(todoItem);
    }

}
