package oop;

public class BankAccount implements IRate {

    //Define variable
    private String accountNumber;
    //static keyword belongs to the CLASS not the OBJECT instance and it does not change when called in the main
    //final keyword is a constant, indicates it does NOT change,(usually static final)
    private static int routingNumber = 8366748;
    static final int countryCode = 880293;
    //Here we are going to employ the encapsulation to the variables by making them private
    private String name;
    private double balance;
    private String ssn;
    private String accoutType;

    private int numbers1 = 1000;

    //1.Constructors are unique methods and the are used to define/ setup / initialize  properties of an object
    //2.Constrcutors are are IMPLICITLY called upon INSTANTIATION
    //3.Constructors have the same name as the class it self
    //4.Constructors have no return type/statement
    //example of a Constructor
    BankAccount() {
        System.out.println("NEW ACCOUNT CREATED");
    }

    //OVERLOADING: this is when we call the same method name with different arguments
    //This usually applies to methods but we can apply it to constructors as well
    //In method overloading Java is able to discern which method is being called based on the argument passed in the constructor
    BankAccount(String accoutType) {
        System.out.println("ACCOUNT CREATED: " + accoutType);
    }

    //Method Overloading with two different arguments
    BankAccount(String accoutTypem, double initialDeposit) {
        System.out.println("ACCOUNT TYPE" + accoutTypem);
        System.out.println("INITIAL DEPOSIT $ " + initialDeposit);
    }

    //Getters and Setters for encapsulation mainly applied to the variables
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static int getCountryCode() {
        return countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = " Mr." + name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAccoutType() {
        return accoutType;
    }

    public void setAccoutType(String accoutType) {
        this.accoutType = accoutType;
    }


    // Interface Methods
    public void setRate() {
        System.out.println("SETTING RATE");
    }

    public void increaseRate() {
        System.out.println("INCREASE RATE");
    }


//Defined Methods

    public void depositAmount(double amount) {
        balance = balance + amount;
        showActivity("DEPOSIT");
    }

    public void withdrawAmount(double amount) {
        balance = balance + amount;
        showActivity("WITHDRAW");

    }

    //The private access specifiers can only be called within this class
    private void showActivity(String activity) {
        System.out.println("YOUR RECENT TRANSACTION: " + activity);
        System.out.println("YOUR NEW BALANCE IS: " + balance);
    }


    //When defining methods and you do not want a return type use the void keyword ignore the void keyword when you want a return type
    void checkBalance() {
        System.out.println("Checking Balance.....");
    }

    void getStatus() {

    }

    @Override
    public String toString() {
        return "[ " + name + ". " + " . ACCOUNT# " + accountNumber + " . ROUTING# " + routingNumber + ". BALANCE: $" + balance + " " + accoutType + "] ";
    }

}
