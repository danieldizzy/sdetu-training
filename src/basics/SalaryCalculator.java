package basics;

public class SalaryCalculator{
    public static void main(String[] args) {


        String career;
        System.out.println("Program Starting...");

        ////Assign the variables
        career = "Software Developer";
        System.out.println("My Career:" + career);

        //Calculate Annual Salary
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.50;

        double annualSalary = rate * hoursPerWeek * weeksPerYear;
        System.out.println("My Salary As a " + career + " at the rate of " + rate + "per hour is $" + annualSalary );
    }

}