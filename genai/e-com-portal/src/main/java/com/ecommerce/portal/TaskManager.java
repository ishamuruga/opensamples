package com.ecommerce.portal;

import java.util.ArrayList;
import java.util.List;

/**
 * The TaskManager class manages a list of tasks, allowing users to add tasks,
 * list all tasks, and mark tasks as done.
 */
public class TaskManager {
    /** The list of tasks managed by this TaskManager. */
    private List<Task> tasks;

    /**
     * Constructs a new TaskManager with an empty list of tasks.
     */
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Adds a new task with the given description to the task list.
     *
     * @param description The description of the task to be added.
     */
    public void addTask(String description) {
        Task newTask = new Task(description);
        tasks.add(newTask);
        System.out.println("Task added: " + description);
    }

    /**
     * Lists all tasks currently in the task list, along with their status.
     * If there are no tasks, it prints a message indicating so.
     */
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Current tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                String status = task.isDone() ? "Done" : "Not done";
                System.out.println((i + 1) + ". " + task.getDescription() + " - " + status);
            }
        }
    }

    /**
     * Marks a task as done based on its description.
     * If the task is found, it is marked as done and a confirmation message is printed.
     * If the task is not found, a message indicating so is printed.
     *
     * @param description The description of the task to be marked as done.
     */
    public void markTaskAsDone(String description) {
        boolean taskFound = false;
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.setDone(true);
                System.out.println("Task marked as done: " + description);
                taskFound = true;
                break;
            }
        }
        if (!taskFound) {
            System.out.println("Task not found: " + description);
        }
    }

   public boolean removeTaskByDescription(String description) {
       boolean taskRemoved = tasks.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
       if (taskRemoved) {
           System.out.println("Task removed: " + description);
       } else {
           System.out.println("Task not found: " + description);
       }
       return taskRemoved;
   }



    /**
     * The main method demonstrates the usage of the TaskManager class.
     * It creates a TaskManager instance, adds sample tasks, lists them,
     * marks a task as done, and then lists the tasks again to show the update.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        // Add some sample tasks
        taskManager.addTask("Buy groceries");
        taskManager.addTask("Clean the house");
        taskManager.addTask("Work on project");
        // List all tasks
        taskManager.listTasks();
        // Mark a task as done
        taskManager.markTaskAsDone("Buy groceries");
        // List all tasks again
        taskManager.listTasks();
    }
}
