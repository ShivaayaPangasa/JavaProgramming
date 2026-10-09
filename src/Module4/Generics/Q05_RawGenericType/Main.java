/* ### Q5. How do raw types differ from parameterized types in Generics, and why should raw types be avoided?

**Answer:**

In Java, a **raw type** is a generic class or interface used without specifying its type parameter, whereas a **parameterized type** specifies the type of data that the class or interface can store.

**Differences between Raw Types and Parameterized Types:**

| Raw Type                                          | Parameterized Type                                                       |
| ------------------------------------------------- | ------------------------------------------------------------------------ |
| Does not specify a type parameter.                | Specifies a type parameter.                                              |
| Provides weaker type safety.                      | Provides better type safety.                                             |
| May allow different types of objects to be added. | Allows only the specified type of objects.                               |
| Type errors may occur at runtime.                 | Type errors can generally be detected at compile time.                   |
| May require explicit type casting.                | Usually does not require explicit type casting when retrieving elements. |

**Example:**

```java
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // Raw type
        ArrayList list1 = new ArrayList();
        list1.add("Java");
        list1.add(100);

        // Parameterized type
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Python");
        list2.add("Java");

        System.out.println(list1);
        System.out.println(list2);
    }
}
```

**Output:**

```text
[Java, 100]
[Python, Java]
```

**Explanation:**

1. `ArrayList list1` is a raw type because no type parameter is specified. Therefore, it allows different types of objects to be added, such as a `String` and an `Integer`.
2. `ArrayList<String> list2` is a parameterized type because the type parameter `String` is specified. It allows only strings to be added.
3. If we write `list2.add(100)`, the compiler reports a type error because `100` is an integer, not a string.

**Why should raw types be avoided?**

Raw types should be avoided because they reduce type safety, may cause runtime errors such as `ClassCastException`, require additional type casting, and make programs more difficult to maintain. Parameterized types are preferred because they detect incompatible types at compile time.

**Conclusion:** Parameterized types provide better type safety and readability than raw types. Therefore, we should specify the appropriate type parameter when using generic classes and interfaces.
*/