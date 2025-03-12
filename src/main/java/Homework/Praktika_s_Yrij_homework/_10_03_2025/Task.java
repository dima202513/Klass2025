package Homework.Praktika_s_Yrij_homework._10_03_2025;

public class Task {

    private String description;
    private TaskPriority priority;
    private TaskStatus status;

    public Task(String description, TaskPriority priority, TaskStatus status) {
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}
