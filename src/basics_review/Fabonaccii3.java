package basics_review;

public class Fabonaccii3 {
    public static void main(String[] args) {
        System.out.println(fabon(5));
        System.out.println(factorial(5));
    }

    public static int fabon(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return fabon(n - 1) + (n - 2);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return factorial(n - 1) * n;
    }


}

