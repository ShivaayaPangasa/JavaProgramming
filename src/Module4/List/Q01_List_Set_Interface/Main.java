/* 
## Q1. What is the List interface, and how does it differ from the Set interface?

**Answer:**

The **List interface** in Java is a part of the Java Collection Framework present in the `java.util` package. It represents an ordered collection of elements in which duplicate elements are allowed. Elements can be accessed, inserted, removed, and replaced using their index.

The **Set interface** is also a part of the Java Collection Framework. It represents a collection that does not allow duplicate elements. Its ordering depends on the implementation used.

**Differences between List and Set:**

| List Interface                                 | Set Interface                                      |
| ---------------------------------------------- | -------------------------------------------------- |
| Allows duplicate elements.                     | Does not allow duplicate elements.                 |
| Maintains an ordered sequence of elements.     | Ordering depends on the implementation.            |
| Supports index-based access.                   | Does not support index-based access.               |
| Elements can be retrieved using their index.   | Elements are generally accessed through iteration. |
| Examples: `ArrayList`, `LinkedList`, `Vector`. | Examples: `HashSet`, `LinkedHashSet`, `TreeSet`.   |

**Example:**

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(list);
        System.out.println(set);
    }
}
```

**Possible output:**

```text
[10, 20, 10]
[20, 10]
```

*Note: The order of elements in a `HashSet` is not guaranteed.*

**Conclusion:** The List interface is used when order, duplicates, and index-based access are required, whereas the Set interface is used when only unique elements are needed.
*/