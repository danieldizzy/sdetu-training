package exceptionsandfiles;

import java.util.Scanner;

public class PaymentApp {

    //Take payment from user
    public static void main(String[] args) {
        double paymentAmount = 0;

        boolean positivePayment = true;
        do {
            //1. Ask the user for input
            System.out.print("Enter the payment amount: ");

            //2. get the amount and test the value
            Scanner inpuAmount = new Scanner(System.in);
            //3. Handle the exceptions appropriately

            try {
                paymentAmount = inpuAmount.nextInt();
                if (paymentAmount < 0) {
                    //Throw an error
                    throw new NegativePaymentError(paymentAmount);
                } else {
                    positivePayment = true;
                }
            } catch (NegativePaymentError e) {
                System.out.println(e.toString());
                System.out.print("Please try again");
                positivePayment = false;
            }
        } while (!positivePayment);

        //4. Print confirmation
        System.out.println("Thank you for your payment of $" + paymentAmount);

    }
}
