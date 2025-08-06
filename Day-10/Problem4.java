import java.util.Arrays;
import java.util.TreeSet;

public class Problem4{
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        colors.add("Orange");
        System.out.println("Printing Tree set: " + colors);
        System.out.println();

        System.out.println("Iterating through tree set");
        for(String color : colors){
            System.out.println("Color: " + color);
        }
        System.out.println();

        TreeSet<String> newColors = new TreeSet<>();
        newColors.addAll(colors);
        System.out.println("After adding elements of other tree set: " + newColors);
        System.out.println(); 

        System.out.println("Reverse Order View: " + colors.descendingSet());
        System.out.println();

        System.out.println("First Element: " + colors.first());
        System.out.println("Last Element: " + colors.last());
        System.out.println();

        TreeSet<String> clonedSet = (TreeSet<String>)colors.clone();
        System.out.println("Cloned Tree Set: " + clonedSet);
        System.out.println();

        System.out.println("Number of Elements in Tree Set: " + colors.size());
        System.out.println();

        System.out.println("Comparing 2 Tree Sets: " + newColors.equals(colors));
        TreeSet<String> others = new TreeSet<>();
        others.add("Red");
        others.add("Blue");
        others.add("Black");

        for(String color: colors){
            System.out.println("Contains " + color + " in other colors : " + others.contains(color));
        }
        System.out.println();

        TreeSet<Integer> nums = new TreeSet<>();
        nums.addAll(Arrays.asList(1, 3, 5, 6, 7, 46));

        System.out.println("Numbers less than 7: " + nums.headSet(7));
        System.out.println("Number >= 6: " + nums.ceiling(6));
        System.out.println("Number <= 5: " + nums.floor(5));
        System.out.println("Strictly > 7: " + nums.higher(7));
        System.out.println("Strictly < 7: " + nums.lower(7));
        System.out.println();

        System.out.println("Removed first Element: " + nums.pollFirst());
        System.out.println("After removing first ele: " + nums);
        System.out.println();

        System.out.println("Removed Last Element: " + nums.pollLast());
        System.out.println("After removing last ele: " + nums);
        System.out.println();

        nums.remove(3);
        System.out.println("After Removing 3: " + nums);

    }
}

/*
 * Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.
 */