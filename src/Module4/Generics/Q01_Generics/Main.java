/* 
### Q1. What is the purpose of Generics in Java, and how do they improve type safety and code reusability?

**Answer:**

Generics in Java allow us to write classes, interfaces, and methods that can work with different data types while maintaining type safety. They use **type parameters**, such as `T`, to specify the type of data that will be used.

**Purpose and advantages of Generics:**

1. **Type Safety:** Generics ensure that only the specified type of data is stored in a class or collection. Type errors can be detected at compile time, reducing the chances of runtime errors.

2. **Code Reusability:** A single generic class or method can be used with different data types without writing separate code for each type.

3. **No Explicit Type Casting:** Generics allow us to retrieve values without explicitly converting them to the required type.

4. **Improved Readability:** They make programs easier to understand by clearly specifying the types of data being used.

**Example:**

```java
class Box<T> {
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

class Main {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.setItem("Java");
        System.out.println(b1.getItem());

        Box<Integer> b2 = new Box<>();
        b2.setItem(100);
        System.out.println(b2.getItem());
    }
}
```

**Output:**

```text
Java
100
```

**Explanation:** In this example, `T` is a type parameter. The class `Box<T>` can store different types of data. `Box<String>` stores strings, whereas `Box<Integer>` stores integers. If we try to store a value of the wrong type, the compiler detects the error.

**Conclusion:** Generics improve type safety, code reusability, readability, and maintainability by allowing the same code to work with different data types while checking types at compile time.
*/