package Projects;

import java.security.SecureRandom;

public class BankAccount implements IInterest{
    private static int iD = 2000; //Internal ID
    private String accountNumber;//iD + random 2digit Number + first 2 of SSn
    private static final String routingNumber = "101222000";
    private String name;
    private String ssn;
    private double balance;


    //Constructor
    public BankAccount(String ssn, double initDeposit) {
        System.out.println("New Account Created: Your SSN is: " + ssn + " INITIAL DEPOSIT " + initDeposit);
        balance = initDeposit;
        this.ssn = ssn;
        iD++;
        setAccountNumber();
    }

    public void setAccountNumber() {
        int randomNumber = (int) (Math.random() * 1000);//Creating the random nuber we do the math random multiplied by 1000 for a 3 digit random  number

        accountNumber = iD + "" + randomNumber + ssn.substring(0, 2);
        System.out.println(accountNumber);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Mr." + name;
    }

    public void payBill(double amount) {
        balance = balance - amount;
        System.out.println("Paying Bill " + amount);
        showBalance();
    }

    public void makeDeposit(double amount) {
        System.out.println("Making Deposit " + amount);
        balance = balance + amount;
        showBalance();
    }

    public void showBalance() {
        System.out.println("Balance " + balance);
    }
    @Override
public void accrue(){
    balance = balance * (1 + rate/100);
    showBalance();
}
@Override
public String toString(){
        return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing NUmber: " + routingNumber + "]\n" + "[Balance " + balance + "]";
}

}
