package basics;

public class NumbersCalc {
    public static void main(String[] args) {
        printName();
        int a = 20;
        int b = 40;
        addNumber(a, b);
        System.out.println("The producut of Num A and Num B is = " + multiplyNumbers(a, b));
    }


    //Functions with a parameters and no return type
    static void addNumber(int numberA, int numberB) {
        int sum = numberA + numberB;
        System.out.println("Addition of " + numberA + " + " + numberB + " is equal to = " + sum);
    }//Function with no parameters and no return types

    static void printName() {
        System.out.println("Tim Duncun");
    }

    //Function with parameters and a return type
    static int multiplyNumbers(int numberMultiA, int numberMultiB) {
        int product = numberMultiA * numberMultiB;
        //Calling a function in another function
        addNumber(product + 50, product);
        return product;

    }
}
