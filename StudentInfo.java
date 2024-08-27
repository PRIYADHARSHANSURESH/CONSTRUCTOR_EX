import java.util.Scanner;

class StudentData {
    String name;
    String panNumber;
    long aadharNumber;
    int mobileNumber; 
    String emailAddress;
    StudentData[] students;

    // Constructor
    public StudentData(String name, String panNumber, long aadharNumber, int mobileNumber, String emailAddress) {
        this.name = name;
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
    }

    // Default constructor
    public StudentData() {
    }

    // Method to get data from user
    int collectData(int numberOfStudents) {
        students = new StudentData[numberOfStudents];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("PAN Number: ");
            String panNumber = scanner.next();
            System.out.print("Aadhar Number: ");
            long aadharNumber = scanner.nextLong();
            System.out.print("Mobile Number: ");
            int mobileNumber = scanner.nextInt();
            System.out.print("Email Address: ");
            String emailAddress = scanner.next();
            students[i] = new StudentData(name, panNumber, aadharNumber, mobileNumber, emailAddress);
        }
        scanner.close(); // Close the Scanner
        return 1; 
    }

    // Method to print data
    void displayData(int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Details of student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].name);
            System.out.println("PAN Number: " + students[i].panNumber);
            System.out.println("Aadhar Number: " + students[i].aadharNumber);
            System.out.println("Mobile Number: " + students[i].mobileNumber);
            System.out.println("Email Address: " + students[i].emailAddress);
            System.out.println();
        }
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        StudentData studentDataManager = new StudentData();
        studentDataManager.collectData(numberOfStudents);
        studentDataManager.displayData(numberOfStudents);
        scanner.close(); // Close the Scanner
    }
}
