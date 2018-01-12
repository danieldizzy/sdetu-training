package basics;

public class Cities {
    public static void main(String[] args) {
        //Declear and Define an array we are implicitly defining the size
        String[] cities = {"New York", "Accra", "Tokyo", "Sydney"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);

        //Declear an array
        String[] countries;

        //Define the array
        countries = new String[3];
        countries[0] = "Ghana";
        countries[1] = "Japan";
        countries[2] = "Australia";
        System.out.println(countries[2]);

        //Declear the array explicitly defining the size
        String[] states = new String[4];
        states[0] = "Kyoto";
        states[1] = "Moscow";
        states[2] = "Tamale";
        states[3] = "Cebu";
//        System.out.println(states[2]);
        int i = 0;
        //Do loop: enters the loop THEN tests condition
        do {
            System.out.println("STATE : " + states[i]);
//            i = i + 1;
            i++;
        } while (i < 4);
        System.out.println("******************");
        // While
        int n = 0;
        boolean stateFound = false;
        while (!stateFound) {
            String state = states[n];
            System.out.println(state);
            if (state == "Tamale") {
                System.out.println("STATE FOUND: " + state);
                stateFound = true;
            }
            n++;
        }
        //For loop: Best structure for iterating through an array
        for (int x = 1; x < 5; x++) {
            String state = states[x];
            System.out.println(state);
        }

    }
}
