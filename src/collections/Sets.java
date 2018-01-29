package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {


        HashSet<String> animals = new HashSet<String>();

        animals.add("Cow");
        animals.add("Chicken");
        animals.add("Goat");
        animals.add("Kangaroo");
        animals.add("Panther");

        System.out.println((animals.size()) + " " + animals);

        animals.add("Cow");
        animals.add("Baboo");

        System.out.println((animals.size()) + " " + animals);

        Set<String> farmAnimals = new HashSet<>();
        farmAnimals.add("Cow");
        farmAnimals.add("Chicken");
        farmAnimals.add("Goat");
        farmAnimals.add("Snake");
        farmAnimals.add("Pink Panther");
        System.out.println(farmAnimals);

        //What is the INTERSECTION between animals and farm animals
        //1. Copy the existing set into a new set
        Set<String> intersectionSet = new HashSet<>(animals);
        //2. Retain only the elements that are also in the same sets
        intersectionSet.retainAll(farmAnimals);
        System.out.println("\nThe Intersection is: " + intersectionSet);

        //The UNION = the elements in the same sets to be joined in one set
        Set<String> unionSet = new HashSet<>(farmAnimals);
        unionSet.addAll(animals);
        System.out.println("\n The Union is " + unionSet);

        //DIFFERENCE
        Set<String> differenceSet = new HashSet<>(farmAnimals);
        differenceSet.removeAll(animals);
        System.out.println("The Difference is : " + differenceSet);




    }
}
