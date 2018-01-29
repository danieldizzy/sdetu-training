package basics_review;

public class CommonExceptionsReview {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
            System.out.println(e.toString());
        }
        System.out.println("The program is closing");

        String[] states = {"NY", "TX", "CA", "FL"};
        for (int i = 0; i < states.length; i++) {
            try {
                System.out.println(states[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.toString());
                System.out.println("Error: Index outside of array domain");
            }finally {
                System.out.println("Iterating through Array");
            }
        }
        System.out.println("program Closing");

    }

}
