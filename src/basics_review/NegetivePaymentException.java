package basics_review;

public class NegetivePaymentException extends Exception {

    double paymentamount;

    public NegetivePaymentException(double paymentamount) {
        this.paymentamount = paymentamount;
        System.out.println("ERROR: Negative Payment");
    }

    @Override
    public String toString() {
        return "ERORRO: Cannont take negetive Payment: " + paymentamount;
    }
}
