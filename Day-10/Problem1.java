import java.util.*;

class Problem1{
    public static void main(String[] args){
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Yellow");
        colours.add("Red");
        colours.add("Blue");
        colours.add("White");
        System.out.println("Displaying List Items:");

        for(String s: colours){
            System.out.println("Colour: " + s);
        }
        System.out.println();
        System.out.println("Inserting Element at First Position: ");
        colours.add(0, "Purple");

        System.out.println(colours);
        System.out.println();

        System.out.println("Retrieving element at index 2:");
        String retrieve_ele = colours.get(2);
        System.out.println(retrieve_ele);
        System.out.println();

        System.out.println("Updating element at index 3:");
        colours.set(3, "Orange");
        System.out.println(colours);
        System.out.println();

        System.out.println("Removing third element");
        colours.remove(2);
        System.out.println(colours);
        System.out.println();

        System.out.println("Searching element:");
        String search = "White";
        boolean isFound = colours.contains(search);
        System.out.println("Search Element Found: " + isFound);
        System.out.println();

        System.out.println("Sorting Elements:");
        Collections.sort(colours);
        System.out.println(colours);
        System.out.println();

        ArrayList<String> copy = new ArrayList<>(colours);
        System.out.println("Copy List: " +copy);

        Collections.shuffle(colours);
        System.out.println("After shuffling: " + colours);
    }
}
