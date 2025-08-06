import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Problem5{
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");
        colors.add("White");
        colors.add("Yellow");

        System.out.println("Displaying priority queue: "+ colors);
        System.out.println();
        System.out.println("Iterating: ");
        for(String color: colors){
            System.out.println("Color: " + color);
        }
        System.out.println();

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.addAll(colors);
        System.out.println("New Priority Queue: " + pq);

        colors.add("Red");
        System.out.println("Queue after adding Red: " + colors);
        System.out.println();

        colors.clear();
        System.out.println("Cleared priority queue: " + colors);
        System.out.println();

        System.out.println("Number of Elements: " + pq.size());
        System.out.println();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Green");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Red");
        pq.add("Red");
        System.out.println(colors);
        System.out.println(pq);
        

        System.out.println("Is Queues equal: " + new HashSet<>(colors).equals(new HashSet<>(pq)));

        System.out.println();

        System.out.println("First Element: " + colors.peek());
        System.out.println();
        System.out.println("Removed First Element: " +colors.poll());
        System.out.println("After removing: " + colors);
        System.out.println();

        String[] arr = colors.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(arr));

    }
}

/*
 * Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.
 */