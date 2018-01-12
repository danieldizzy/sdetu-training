package StudentDatabase;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        StudentDatabaseData newStudent = new StudentDatabaseData("James Bond", "5151515");
        newStudent.showCourses("\nEnglish \nMaths \nScience");

        StudentDatabaseData newStudent2;
        newStudent2 = new StudentDatabaseData("Christiano Ronaldo", "505667433");
        newStudent.showCourses("\nEnglish \nMaths \nChemistry");
        newStudent2.toString();

    }
}
