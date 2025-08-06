import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem2{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Zebra");
        list.add("Lion");
        list.add("Tiger");
        list.add("Snake");
        System.out.println("After appending: " + list);
        System.out.println();

        System.out.println("Iterating through List: ");
        for(String s: list){
            System.out.println("Animal: " + s);
        }
        System.out.println();

        System.out.println("Iterating through elements from specified positon:");
        int start = 1;
        for(int i= start; i<list.size();i++){
            System.out.println("Element at pos" + i + " : " + list.get(i));
        }
        System.out.println();
        System.out.println("Iterating in Reverse Order:");
        for(int i=list.size()-1; i>=0; i--){
            System.out.println("Element at pos" + i + " : " + list.get(i));
        }
        System.out.println();

        list.add(1, "Horse");
        System.out.println("List after inserting ele at pos 1: " + list);
        System.out.println();

        list.addFirst("Bull");
        list.addLast("Giraffe");
        System.out.println("List after adding first & last elements: " + list);
        System.out.println();

        list.offerFirst("Elephant");
        System.out.println("After inserting Element at Front: " +list);
        System.out.println();
        list.offerLast("Cheetah");
        System.out.println("After inserting element at end: " + list);
        System.out.println();

        System.out.println("Inserting some elements at specified pos:");
        List<String> sub = Arrays.asList("Crocodile", "Lion");
        list.addAll(2,sub);
        System.out.println(list);
        System.out.println();

        int first = list.indexOf("Lion");
        int last = list.lastIndexOf("Lion");
        System.out.println("First index of Lion: " + first);
        System.out.println("Last index of Lion: " + last);

    }
}

/*
 * Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.
 */