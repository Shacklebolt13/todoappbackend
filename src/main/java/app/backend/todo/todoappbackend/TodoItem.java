package app.backend.todo.todoappbackend;

public class TodoItem {

    private int id;
    private String title;
    private String desc;
    private boolean done;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.done = done;
    }
}
