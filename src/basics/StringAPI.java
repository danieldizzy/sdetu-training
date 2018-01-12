package basics;

//import static jdk.nashorn.internal.objects.NativeMath.min;

import static java.lang.Math.*;

public class StringAPI {
    public static void main(String[] args) {
        System.out.println("Program is starting.....");

        String bookTItle;
        String keyWord = "Ring";
        bookTItle = "The Lord of the Rings";

        if (bookTItle.endsWith("Ring")) {
            System.out.println("The Title of the book ends with: " + keyWord);
        } else if (bookTItle.contains("Rings"))
            System.out.println("Checking again");
        {
            System.out.println("Ahh found the correct on the book title ends with: " + keyWord);
        }
        if (bookTItle.contains("Ring")) {
            System.out.println("The book contains the keyword " + keyWord);
        }
        if (bookTItle.equalsIgnoreCase("ringss")) {
            System.out.println("This is the ignorecase in Java");
        } else System.out.println("No match in the " + bookTItle);

        String firstName = "Dizzy";
        String lastName = "Ghost";
        String SSN = "25643971266";
        if (SSN.length() > 5) {
            System.out.println("There are " + SSN.length() + " digits in your SSN. ");
        }
        System.out.println(firstName.substring(0, 1));
        System.out.println(lastName.substring(0, 1));
        System.out.println(SSN.substring(5));

        int a = 50;
        int b = 40;
        int c = (int) min(a, b);
        System.out.println(c);
        System.out.println(sin(a));
        System.out.println(PI);
        System.out.println(sqrt(b));

    }
}


