package StudentDatabase;

public class StudentDatabaseData {

    private String name;
    private String SSN;
    private static int iD = 10001;
    private String uniqueID;
    private String email;
    private String emailPrefix = "@research_tech.com";
    private double balance;
    private String courses;


    public StudentDatabaseData(String name, String SSN) {
        enroll();
        System.out.println(iD + " STUDENT NAME: " + ". " + name + "Your SSN: " + SSN);
        this.SSN = SSN;
        iD++;
        userID();
        studentEmail(name);
        toString();
        //showCourses("\nEnglish, \nMaths , Science");
    }

    public void studentID() {

    }

    public void studentEmail(String name) {
        this.name = name;
        email = name.toLowerCase() + emailPrefix;
        System.out.println("EMAIL: " + email.replaceAll("\\s+", "")); //Removes whitespaces and prints the email address
    }

    public void userID() {
        int random = (int) (Math.random() * 1000);
        uniqueID = iD + "" + random + SSN.substring(0, 2);
        System.out.println("UNIQUE ID: " + uniqueID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[Name: " + name + "]\n[Account Number: " + uniqueID + "]\n" + "[Routing NUmber: " + email + "]\n" + "]";
    }

    public void enroll() {
        System.out.println("***************New Student Enrolling***************.");
    }

    public void paytution(double amount) {
        //pay tuition fees
        balance = balance - amount;
        System.out.println(balance);
    }

    public void checkBalance() {
        System.out.println("Balance " + balance);
    }

    public void showCourses(String courses) {
        System.out.println("COURSES ENROLLED: ############# " + courses);
    }


}
