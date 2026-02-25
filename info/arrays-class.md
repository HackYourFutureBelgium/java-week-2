# 📘 Java `Arrays` Class

```java
import java.util.Arrays;
```

The `Arrays` class contains **static methods**; you don’t need to create an object to use them.

---

## 1. Sorting Methods

### `sort()`

* Sorts an array in **ascending order**.
* Works for primitive types and objects.

```java
public class Main 
{
    public static void main(String[] args) 
    {
        int[] arr = {5, 2, 8, 1};
        Arrays.sort(arr);  // [1, 2, 5, 8]
    }
}
```

### `sort(T[] a, int fromIndex, int toIndex)`

* Sort a **range** of an array.

```java
public class Main 
{
    public static void main(String[] args) 
    {
        int[] arr = {5, 2, 8, 1};
        Arrays.sort(arr, 1, 3);  // Only sorts elements at index 1 and 2
    }
}
```

---

## 2. Searching Methods

### `binarySearch()`

* Performs **binary search** (array must be sorted).

```java
public class Main
{
    static void main() 
    {
        int[] arr = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(arr, 3); // Returns 2
    }
}
```

### Overloaded:

```md
Arrays.binarySearch(arr, fromIndex, toIndex, key);
```

---

## 3. Comparison Methods

### `equals()`

* Checks if **two arrays are equal** (same length, same elements).

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
boolean eq = Arrays.equals(arr1, arr2); // true
```

### `deepEquals()`

* For **multi-dimensional arrays**, compares elements recursively.

```java
int[][] a = {{1,2},{3,4}};
int[][] b = {{1,2},{3,4}};
boolean eq = Arrays.deepEquals(a, b); // true
```

---

## 4. Filling Arrays

### `fill()`

* Fill **entire array** with a value.

```java
int[] arr = new int[5];
Arrays.fill(arr, 7); // {7,7,7,7,7}
```

### `fill(array, fromIndex, toIndex, value)`

* Fill **specific range**.

```java
int[] arr = {1,2,3,4,5};
Arrays.fill(arr, 1, 4, 9); // {1,9,9,9,5}
```

---

## 5. Copying Arrays

### `copyOf()`

* Copy entire array or part of it.

```java
int[] arr = {1,2,3};
int[] copy = Arrays.copyOf(arr, 5); // {1,2,3,0,0}
```

### `copyOfRange()`

* Copy **specific range**.

```java
int[] arr = {1,2,3,4,5};
int[] range = Arrays.copyOfRange(arr, 1, 4); // {2,3,4}
```

---

## 6. Array to String

### `toString()`

* Convert **single-dimensional array** to string.

```java
int[] arr = {1,2,3};
System.out.println(Arrays.toString(arr)); // [1, 2, 3]
```

### `deepToString()`

* Convert **multi-dimensional array** to string.

```java
int[][] arr = {{1,2},{3,4}};
System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4]]
```

---

## 7. Hash Code Methods

### `hashCode()`

* Returns **hash code** for single-dimensional array.

```java
int[] arr = {1,2,3};
int hash = Arrays.hashCode(arr);
```

### `deepHashCode()`

* For **multi-dimensional arrays**.

```java
int[][] arr = {{1,2},{3,4}};
int hash = Arrays.deepHashCode(arr);
```

---

## 8. Mismatch Method

### `mismatch()`

* Returns **first index where two arrays differ**, or -1 if equal.

```java
int[] a = {1,2,3};
int[] b = {1,4,3};
int index = Arrays.mismatch(a, b); // 1
```

---

## 9. Parallel Methods (Java 8+)

* `parallelSort()` → faster sorting for large arrays using multiple threads.
* `parallelPrefix()` → apply a **cumulative operation** on array.
* `parallelSetAll()` → initialize array elements in parallel.

Example:

```java
int[] arr = {5,2,8,1};
Arrays.parallelSort(arr);  // sorts array in parallel
```

---

## 10. Utility Methods

* `asList(T... a)` → Convert **array to List**.

```java
String[] arr = {"A", "B", "C"};
List<String> list = Arrays.asList(arr);
```

* `spliterator()` → Return a **Spliterator** for the array (for streams).

---

## ✅ Summary of Most Used `Arrays` Methods

| Method           | Purpose                                  |
|------------------|------------------------------------------|
| `sort()`         | Sort array                               |
| `binarySearch()` | Search in sorted array                   |
| `equals()`       | Compare arrays                           |
| `deepEquals()`   | Compare multidimensional arrays          |
| `fill()`         | Fill array with value                    |
| `copyOf()`       | Copy array                               |
| `copyOfRange()`  | Copy array range                         |
| `toString()`     | Convert array to string                  |
| `deepToString()` | Convert multidimensional array to string |
| `hashCode()`     | Hash code of array                       |
| `deepHashCode()` | Hash code of multidimensional array      |
| `mismatch()`     | Find first differing index               |
| `parallelSort()` | Parallel sort (Java 8+)                  |
| `asList()`       | Convert array to List                    |

