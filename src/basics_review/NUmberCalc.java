package basics_review;

public class NUmberCalc {
    public static void main(String[] args) {
        String name = "Davidson";
        printName("Davidson");
        int a = 50;
        int b = 60;
        addNumbers(a, b);
        System.out.println("The product of two numbers is: " + multiplyNumbers(a, b));
    }

    static void printName(String name){
        System.out.println("***This is a regular function or method***");
        System.out.println("My Name is " + name);
    }

    static void addNumbers(int numberA, int numberB){
        int sum = numberA + numberB;
        System.out.println("\n***This is a funtion/method with parameters but no return type***");
        System.out.println("The Sum of two numbers " + numberA + " and " + numberB + " is equal to " + sum);
    }
    static int multiplyNumbers(int numberA, int numberB){
        System.out.println("\nThis is a function with a return type no use of void and also with parameters");
        int product = numberA * numberB;
        addNumbers(product, product);
        return product;

    }
}
