package app.backend.todo.todoappbackend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TodoItem {

    @Id
    @Column
    private int item_id;

    @Column
    private String title;

    @Column
    private String desc;

    @Column
    private boolean done;

    public int getId() {
        return item_id;
    }

    public void setId(int id) {
        this.item_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public TodoItem(int id, String title, String desc, boolean done) {
        this.item_id = id;
        this.title = title;
        this.desc = desc;
        this.done = done;
    }
}
