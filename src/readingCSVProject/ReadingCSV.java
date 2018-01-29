package readingCSVProject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadingCSV {
    public static void main(String[] args) {

        List<String[]> transactions = new ArrayList<String[]>();
        String filepath = "C:\\Users\\Sh3berw0k\\Desktop\\JavaTut\\Refresher\\CSVFile.csv";
        String dataRow;
        double balance = 0;

        try {
            //Open the file
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            //Read the data as long as it is not empty
            while ((dataRow = br.readLine()) != null) {
                //Parsing the data by Comas
                String[] line = dataRow.split(",");
                //Add the data to collection
                transactions.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("DATE | TRANSACTION | VENDOR | AMOUNT | BALANCE ");
        for (String[] transaction : transactions) {
            String date = transaction[0];
            String type = transaction[1];
            String vendor = transaction[2];
            double amount = Double.parseDouble(transaction[3]);
            System.out.print(date + " || " + type + " || " +  vendor + " | $ " + amount);
            if (type.equalsIgnoreCase("credit")) {
                //System.out.println("Add to balance");
                balance = balance + amount;
            } else if (type.equalsIgnoreCase("debit")) {
                //System.out.println("Subtract from balance");
                balance = balance - amount;
            } else {
                System.out.println("Some Other transction");
            }
            System.out.print(" || : " + balance + "\n");

        }
        if (balance > 0) {
            System.out.println(" You have a balance of " + balance);
            System.out.println("You are charged a 10% fee of " + balance * .10);
            System.out.println("Your new balance is: " + balance * 1.1);
        } else if (balance < 0) {
            System.out.println("Thanks for your payments.");
            System.out.println("You have a overpayment of " + balance);
        } else System.out.println("Thanks for your payment!!");


//        for (String[] trasaction : transactions) {
//            System.out.print("[");
//            for (String field : trasaction) {
//                System.out.print(field + " ");
//            }
//            System.out.println("]");
//        }
    }
}
