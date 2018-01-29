package collections;


import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {
        //1. Create a Collection
        ArrayList<String> cities = new ArrayList<String>();

        //2. Add some data
        cities.add("Accra");
        cities.add("Nima");
        cities.add("Mamobi");
        cities.add("Agbozume");
        cities.add("Kumasi");

        //Iterate over the elements
        for (String city : cities) {
            System.out.println(city);
        }
        //Get the Size of the Collection
        int size = cities.size();
        System.out.println(" The are " + size + " elements in the collection");

        //Remove some elements
        cities.remove(0);
        size = cities.size();
        System.out.println(" Now there are " + size + " elements in the collection ");

    }
}

