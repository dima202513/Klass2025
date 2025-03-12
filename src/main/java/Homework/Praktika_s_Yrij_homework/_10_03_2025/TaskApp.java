package Homework.Praktika_s_Yrij_homework._10_03_2025;

import java.util.ArrayList;
import java.util.List;

public class TaskApp {

    public static void main(String[] args) {
        List<Task>  tasks = new ArrayList<>();
        Task task1 = new Task("Write code", TaskPriority.NORMAL, TaskStatus.NEW);
        Task task2 = new Task("Write code", TaskPriority.LOW, TaskStatus.IN_PROGRESS);
        Task task3 = new Task("Write code", TaskPriority.HIGH, TaskStatus.COMPLETED);
        Task task4 = new Task("Write code", TaskPriority.LOW, TaskStatus.NEW);
        Task task5 = new Task("Write code", TaskPriority.NORMAL, TaskStatus.IN_PROGRESS);
    tasks.add(task1);
    tasks.add(task2);
    tasks.add(task3);
    tasks.add(task4);
    tasks.add(task5);

        System.out.println(tasks);

        System.out.println();
        System.out.println(tasks);


        changeStatusTasks(tasks);
        System.out.println();
        System.out.println(tasks);
        System.out.println();
        printTasks(tasks);
        System.out.println(tasks);
    }

    public static void changeStatusTasks(List<Task> tasks) {
        for (Task task : tasks) {
            if (task.getPriority() == TaskPriority.HIGH) {
                task.setStatus(TaskStatus.IN_PROGRESS);
            }
        }
    }

        public static void printTasks(List<Task> tasks) {
for (Task task : tasks){
    System.out.println("" + task.getStatus() + " " + task.getStatus().getDescription() + " " + task.getPriority() + " " + task.getDescription());
}
}
        }
