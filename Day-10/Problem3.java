import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Problem3{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        System.out.println("Appending elements to end of hash set:");
        set.add("Mango");
        set.add("Banana");
        set.add("Apple");
        set.add("BlackBerry");
        System.out.println("Hash set after appending elements: " + set);
        System.out.println();

        System.out.println("Iterating through hash list: ");
        for(String s: set){
            System.out.println("Fruit: " + s);
        }
        System.out.println();

        System.out.println("Size of Hash Set: " + set.size());
        System.out.println();

        set.clear();
        System.out.println("Hash set after emptying: " + set);
        System.out.println();

        System.out.println("Hash set isEmpty ?: " + set.isEmpty());
        System.out.println();

        set.add("Mango");
        set.add("Banana");
        set.add("JackFruit");

        HashSet<String> clonedset = (HashSet<String>) set.clone();
        System.out.println("Cloned set: " + clonedset);
        System.out.println();

        String [] ar = set.toArray(new String [set.size()]);
        System.out.println("Hash set to Array: " + Arrays.toString(ar));
        System.out.println();

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Hash set to Tree set: " + treeSet);
        System.out.println();

        ArrayList<String> list = new ArrayList<>(set);
        System.out.println("Hash set to Array List: " + list);
        System.out.println();

        HashSet<String> set1 = new HashSet<>();
        set1.add("Mango");
        set1.add("Banana");
        set1.add("JackFruit");
        set1.add("Banana");

        System.out.println("Hash sets isEqual ? : " + set.equals(set1));

    }
}

/*
 *  Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
 */