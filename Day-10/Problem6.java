import java.util.TreeMap;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;

public class Problem6{
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(1, "Apple");
        tree.put(2, "Mango");
        tree.put(3, "Banana");
        tree.put(4, "PineApple");

        System.out.println("Tree Map: " + tree);

        TreeMap<Integer, String> tree2 = new TreeMap<>(tree);
        System.out.println("Displaying Tree2: " + tree2);
        System.out.println();

        System.out.println("Searching a Key in tree: ");
        System.out.println("Key Found ? : " + tree.containsKey(1));
        System.out.println();

        System.out.println("Searching a value in tree: ");
        System.out.println("Value Found ? : " + tree.containsValue("Apple"));
        System.out.println();

        Set<Integer> key_set = tree.keySet();
        System.out.println("All keys in the tree: " + key_set);
        System.out.println();

        System.out.println("Before Clearing Tree Map2: " + tree2);
        tree2.clear();
        System.out.println("Cleared all elements from Tree Map 2: " + tree2);
        System.out.println();

        TreeMap<Integer, String> treeMapDesc = new TreeMap<>(Collections.reverseOrder());
        treeMapDesc.putAll(tree);
        System.out.println("Sorting in desc order: " + treeMapDesc);
        System.out.println();

        System.out.println("Key-value with greatest key: " + tree.firstEntry());
        System.out.println("Key-value with lowest key: " + tree.lastEntry());
        System.out.println();

        System.out.println("First Key: " + tree.firstKey());
        System.out.println("Last Key: " + tree.lastKey());
        System.out.println();

        NavigableSet<Integer> descKeys = tree.descendingKeySet();
        System.out.println("Descending key set: " + descKeys);

    }
}

/*
 * Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.
 */