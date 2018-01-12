package basics_review;

public class Factorial_review {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int n){
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        } return factorial(n -1 ) * n;
    }
}
