package oop;

public class BankAccountApp {
    public static void main(String[] args) {


        //creating multiple bank account objects>>
        // this is also a form of Polymorphism, thus calling the same or we can call is polymorphism through Overloading
        BankAccount account1 = new BankAccount();
        account1.setName("David Jackson");
        System.out.println(account1.getName());

        account1.setBalance(5000);
        System.out.println(account1.getBalance());

        account1.setAccountNumber("348577673");
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.toString());

        BankAccount account2 = new BankAccount("Checking Account");
        account2.setAccountNumber("50544");
        System.out.println(account2.getAccountNumber());
        account2.setSsn("256545456412");
        System.out.println(account2.getSsn());
        System.out.println(account2.toString());



     /*
        //Sample of the calling the constructor overloading in the main this example is with two parameters
        BankAccount account3 = new BankAccount("Savings Account", 5000.00);
        System.out.println(account3.routingNumber);
        System.out.println(account3.countryCode);
        account3.withdrawAmount(5000);
        account3.depositAmount(6000);
        account3.depositAmount(5000);
        */

        CDAccount cdAccount = new CDAccount();
        cdAccount.setName("Clark Superman");
        System.out.println(cdAccount.getName());

        cdAccount.setAccoutType("CD Account");
        System.out.println(cdAccount.getAccoutType());

        cdAccount.setAccountNumber("8883338458");
        System.out.println(cdAccount.getAccountNumber());

        cdAccount.setBalance(5000.00);
        System.out.println(cdAccount.getBalance());

        cdAccount.setRate();
        cdAccount.increaseRate();

        //Polymorphism through Overriding
        System.out.println(cdAccount.toString());

    }
}
