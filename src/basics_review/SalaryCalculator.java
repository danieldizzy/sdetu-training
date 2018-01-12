package basics_review;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("*****Starting Application****");
        String career = "Computer Engineer";

        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 40.20;

        //Calculating Annual Salary = rate * hoursPerWeek * weeksPerYear
        double annualSalary = rate * hoursPerWeek * weeksPerYear;
        System.out.println(" I work as a " + career + " at the rate of " + rate + "per hour is $" + annualSalary );
    }
}
