package Module4.QueueStack.Q02_PriorityQueueTasks;

// PriorityQueue to process priority-numbered tasks

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority; // Smaller number means higher priority in this example.
    Task(String name, int priority) { this.name = name; this.priority = priority; }
    public int compareTo(Task other) { return Integer.compare(this.priority, other.priority); }
    public String toString() { return name + "(priority=" + priority + ")"; }
}

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.offer(new Task("Submit assignment", 1));
        tasks.offer(new Task("Read notes", 3));
        tasks.offer(new Task("Revise generics", 2));
        System.out.println("Next highest-priority task: " + tasks.poll());
        System.out.println("Remaining queue (internal iteration isn't sorted): " + tasks);
        System.out.println("Process in priority order:");
        while (!tasks.isEmpty()) System.out.println(tasks.poll());
    }
}
