import java.util.HashMap;
import java.util.Set;
import java.util.Map;


public class Problem7{
    public static void main(String[] args) {
        HashMap<Character, String> map1 = new HashMap<>();
        map1.put('a', "Apple");
        map1.put('b', "Banana");
        map1.put('d', "DragonFruit");
        map1.put('c', "CaustardApple");

        System.out.println("Displaying map: " + map1);
        System.out.println("Size of hash map: " + map1.size());

        System.out.println();
        HashMap<Character, String> map2 = new HashMap<>(map1);
        System.out.println("copy from map1 to map2: " + map2);
        System.out.println();

        System.out.println("Before Clearing map: " + map2);
        map2.clear();
        System.out.println("After Clearing map: " + map2);
        System.out.println();

        System.out.println("Map2 is empty ?: " + map2.isEmpty());
        System.out.println("Map1 is empty ?: " + map1.isEmpty());
        System.out.println();

        HashMap<Character, String> copy = (HashMap<Character, String>) map1.clone();
        System.out.println("Shallow copy: " + copy);
        System.out.println();

        System.out.println("Map1 contains specified key ?: " + map1.containsKey('c'));
        System.out.println("Map1 contains specified value ?: " + map1.containsValue("CaustardApple"));
        System.out.println();

        Set<Map.Entry<Character, String>> setview = map1.entrySet();
        System.out.println("Set View : " + setview);
        System.out.println();

        Character key = 'b';
        System.out.println("Finding value of key: " + map1.get(key));

    }
}

/*
 * Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map.
 */