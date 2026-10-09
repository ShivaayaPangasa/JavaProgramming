/* 
## Q2. What is the difference between ArrayList and LinkedList in terms of performance and usage?

**Answer:**

`ArrayList` and `LinkedList` are implementations of the `List` interface in Java. Both allow duplicate elements and maintain insertion order, but they store and access elements differently.

**ArrayList:** It uses a dynamically resizable array to store elements. It provides fast index-based access but may require shifting elements when inserting or removing elements at the beginning or middle.

**LinkedList:** It uses a doubly linked list in which each node contains an element and links to the previous and next nodes. It supports efficient insertion and removal at the ends, but accessing an element by index is slower because the list must be traversed.

**Differences between ArrayList and LinkedList:**

| ArrayList                                                                 | LinkedList                                                                                                           |
| ------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| Uses a dynamic array.                                                     | Uses a doubly linked list.                                                                                           |
| Fast random access by index, generally \(O(1)\).                          | Index-based access takes \(O(n)\).                                                                                   |
| Insertion or removal at the beginning or middle generally takes \(O(n)\). | Insertion or removal at an end takes \(O(1)\); at an arbitrary position, locating the node generally takes \(O(n)\). |
| Appending an element takes amortized \(O(1)\) time.                       | Adding an element at either end takes \(O(1)\) time.                                                                 |
| Usually uses less memory per element.                                     | Uses additional memory for node links.                                                                               |
| Suitable for frequent retrieval by index.                                 | Suitable when frequent operations at the ends are required.                                                          |

**Example:**

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);

        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);

        System.out.println(a.get(1));
        System.out.println(l.get(1));
    }
}
```

**Output:**

```text
20
20
```

**Explanation:** Both lists store the same elements and return `20` at index `1`. However, `ArrayList` accesses the element directly by index, whereas `LinkedList` traverses its nodes to reach the element.

**Conclusion:** `ArrayList` is generally preferred for frequent indexed access and iteration. `LinkedList` can be useful for frequent additions and removals at the ends. The best choice depends on the operations performed most often.

*/