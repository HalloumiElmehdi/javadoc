package javadoc.advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void show() {
    Customer c1 = new Customer("a", "e1");
    Customer c2 = new Customer("b", "e2");

    Map<String, Customer> map = new HashMap<>();
    map.put(c1.getEmail(), c1);
    map.put(c2.getEmail(), c2);

    boolean exists = map.containsKey("e1");

    Customer unknown = new Customer("Unknown", "");
    Customer customer = map.get("e1");
    customer = map.getOrDefault("e1", unknown);

    map.replace("e1", new Customer("a++", "e1"));

    for (String key : map.keySet())
      System.out.println(key);

    for (Customer value : map.values())
      System.out.println(value);

    for (Map.Entry<String, Customer> entry : map.entrySet())
      System.out.println(entry);
  }
}
