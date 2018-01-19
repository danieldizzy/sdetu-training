package BankAccountProjects;

public class BankAccountApp {
    public static void main(String[] args) {

        BankAccount account1;
        account1 = new BankAccount("500510483", 5000);
        account1.setName("James Bond");
        System.out.println(account1.toString());

        BankAccount account2;
        account2 = new BankAccount("500510853", 5000);
        account2.setName("Brad Pitt");
        System.out.println(account2.toString());

        BankAccount account3;
        account3 = new BankAccount("500510473", 10000);
        account3.setName("Chris Rock");
        //System.out.println(account3.getName());
        account3.makeDeposit(1000);
        account3.accrue();
        System.out.println( account3.toString() );
    }
}
