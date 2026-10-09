package Module4.List.Q07_ListPerformance;

// Basic timing comparison of ArrayList and LinkedList

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static long timeBeginningAdds(List<Integer> list, int count) {
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) list.add(0, i);
        return System.nanoTime() - start;
    }
    static long timeMiddleRemoves(List<Integer> list) {
        long start = System.nanoTime();
        while (!list.isEmpty()) list.remove(list.size() / 2);
        return System.nanoTime() - start;
    }
    static long timeIteration(List<Integer> list) {
        long sum = 0;
        long start = System.nanoTime();
        for (Integer n : list) sum += n;
        long elapsed = System.nanoTime() - start;
        if (sum == -1) System.out.println(sum); // Prevent unused-sum confusion.
        return elapsed;
    }
    public static void main(String[] args) {
        final int N = 5000;
        System.out.println("Beginning adds, ns: ArrayList=" + timeBeginningAdds(new ArrayList<Integer>(), N));
        System.out.println("Beginning adds, ns: LinkedList=" + timeBeginningAdds(new LinkedList<Integer>(), N));

        List<Integer> a = new ArrayList<>(); List<Integer> b = new LinkedList<>();
        for (int i = 0; i < N; i++) { a.add(i); b.add(i); }
        System.out.println("Middle removals, ns: ArrayList=" + timeMiddleRemoves(a));
        System.out.println("Middle removals, ns: LinkedList=" + timeMiddleRemoves(b));

        List<Integer> c = new ArrayList<>(); List<Integer> d = new LinkedList<>();
        for (int i = 0; i < N; i++) { c.add(i); d.add(i); }
        System.out.println("Iteration, ns: ArrayList=" + timeIteration(c));
        System.out.println("Iteration, ns: LinkedList=" + timeIteration(d));
        System.out.println("Timing varies by machine/JVM; repeat runs for meaningful comparison.");
    }
}
