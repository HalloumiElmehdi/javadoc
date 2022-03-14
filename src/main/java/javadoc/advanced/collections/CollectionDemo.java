package javadoc.advanced.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
  public static void show() {
    Collection<String> collection = new ArrayList<>();
    collection.add("a");
    collection.add("b");
    collection.add("c");

    // Add multiple items in one go
    Collections.addAll(collection, "a", "b", "c");

    int size = collection.size();

    collection.remove("a");
    boolean containsA = collection.contains("a");

    collection.clear();
    boolean isEmpty = collection.isEmpty();

    Object[] objectArray = collection.toArray();
    String[] stringArray = collection.toArray(new String[0]);

    Collection<String> other = new ArrayList<>();
    other.add("a");
    other.add("b");
    other.add("c");
    System.out.println(collection == other);
    System.out.println(collection.equals(other));
  }
}
