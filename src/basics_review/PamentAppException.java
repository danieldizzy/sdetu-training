package basics_review;


import exceptionsandfiles.NegativePaymentError;

import java.util.Scanner;

public class PamentAppException {
    //Take Payment from the user
    public static void main(String[] args) {
        double paymentamount = 0;
        boolean positivePayment = true;


        do {
            //1. Ask the user for input
            System.out.print("Enter the payment amount: ");
            //2. Get the amount and test the value
            Scanner inpuAmount = new Scanner(System.in);
            try {
                paymentamount = inpuAmount.nextDouble();
                if (paymentamount < 0) {
                    //throws NegetivePaymentException error
                    throw new NegetivePaymentException(paymentamount);
                    //3 Handle the exception appropriately
                }else {
                    positivePayment = true;
                }
                //4. Print the confirmation
            } catch (NegetivePaymentException e) {
                System.out.println(e.toString());
                System.out.println("Please try again");
                positivePayment = false;
            }
        } while (!positivePayment);
        System.out.println("Thank you for your payment: " + paymentamount);
    }

}