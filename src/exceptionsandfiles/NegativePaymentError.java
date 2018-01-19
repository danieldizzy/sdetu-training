package exceptionsandfiles;


//We have to extend the Exception class so that is will be available to us through inheritance
public class NegativePaymentError extends Exception {
    //Define class variable
    double paymentAmount;

    //1. Constructor that takes the value that would throw the exception
    //2.Assign value of local variable class variable
    public NegativePaymentError(double paymentAmount) {
        this.paymentAmount = paymentAmount;
        //System.out.println("ERROR: Negative Payment ");
        //System.out.println();
        //toString();
    }
    //3. We override the toString() method to include the specific exception
    @Override
    public String toString() {
        return "Cannont take Negative Paymenet: " + paymentAmount;
    }
}
