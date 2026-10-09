/* 

## Q4. What is the role of the Vector class, and how does it differ from ArrayList?

**Answer:**

The **Vector class** in Java is a resizable-array implementation of the `List` interface. It is available in the `java.util` package and stores elements in an indexed sequence. It allows duplicate elements and grows automatically when additional capacity is required.

The main feature of `Vector` is that its individual methods are synchronized, providing thread safety for individual method calls. `ArrayList`, on the other hand, is not synchronized by default.

**Differences between Vector and ArrayList:**

| Vector                                                          | ArrayList                                      |
| --------------------------------------------------------------- | ---------------------------------------------- |
| Uses a dynamically resizable array.                             | Uses a dynamically resizable array.            |
| Individual methods are synchronized.                            | Methods are not synchronized by default.       |
| Generally has additional synchronization overhead.              | Generally faster for single-threaded use.      |
| Considered a legacy class.                                      | Commonly used in modern Java programs.         |
| Can be used when synchronized individual operations are needed. | Suitable when synchronization is not required. |

**Example:**

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);

        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);

        System.out.println(v);
        System.out.println(a);
    }
}
```

**Output:**

```text
[10, 20]
[10, 20]
```

**Explanation:** Both classes store and display the elements in the same way. Their main difference is synchronization, not the order or type of data they store.

**Conclusion:** `Vector` provides synchronized individual operations, while `ArrayList` generally provides better performance when synchronization is unnecessary. However, synchronizing individual methods does not automatically make a sequence of multiple operations atomic. For modern concurrent programs, other synchronization mechanisms or concurrent collections may be more appropriate.
 */