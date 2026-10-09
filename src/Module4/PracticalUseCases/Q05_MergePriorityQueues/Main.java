package Module4.PracticalUseCases.Q05_MergePriorityQueues;

// Merge two priority queues into sorted removal order

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> first = new PriorityQueue<>();
        PriorityQueue<Integer> second = new PriorityQueue<>();
        first.add(7); first.add(1); first.add(5);
        second.add(6); second.add(2); second.add(4);
        PriorityQueue<Integer> merged = new PriorityQueue<>(first);
        merged.addAll(second);
        System.out.print("Merged values in sorted poll order: ");
        while (!merged.isEmpty()) System.out.print(merged.poll() + " ");
        System.out.println();
    }
}