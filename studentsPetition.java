import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Petition Management System!");
        System.out.println("Select an action:");
        System.out.println("1. Create and save Change of Grade Petition");
        System.out.println("2. Create and save Makeup Exam Petition");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        switch (choice) {
            case 1:
                createAndSaveChangeOfGradePetition(scanner);
                break;
            case 2:
                createAndSaveMakeupExamPetition(scanner);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    private static void createAndSaveChangeOfGradePetition(Scanner scanner) {
        // Get petition details from the user
        System.out.println("Enter petition details:");
        System.out.print("Petition Number: ");
        int petitionNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Instructor Name: ");
        String instructorName = scanner.nextLine();

        System.out.print("Old Grade: ");
        int oldGrade = scanner.nextInt();

        System.out.print("New Grade: ");
        int newGrade = scanner.nextInt();

        System.out.print("Reason for Change: ");
        String reasonForChange = scanner.nextLine();
        
        // Create and save ChangeOfGradePetition object
        ChangeOfGradePetition changeOfGradePetition = new ChangeOfGradePetition(petitionNumber, studentId, courseCode,
                instructorName, oldGrade, newGrade, reasonForChange);
        savePetitionToFile(changeOfGradePetition, "COGPetition.txt");
        System.out.println("Change of Grade Petition created and saved successfully!");
    }

    private static void createAndSaveMakeupExamPetition(Scanner scanner) {
        // Get petition details from the user
        System.out.println("Enter petition details:");
        System.out.print("Petition Number: ");
        int petitionNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Instructor Name: ");
        String instructorName = scanner.nextLine();

        System.out.print("Missed Exam Date: ");
        String missedExamDate = scanner.nextLine();

        System.out.print("Reason for Missing Exam: ");
        String reasonForMissingExam = scanner.nextLine();

        // Create and save MakeupExamPetition object
        MakeupExamPetition makeupExamPetition = new MakeupExamPetition(petitionNumber, studentId, courseCode,
                instructorName, missedExamDate, reasonForMissingExam);
        savePetitionToFile(makeupExamPetition, "MEPetition.txt");
        System.out.println("Makeup Exam Petition created and saved successfully!");
    }

    private static void savePetitionToFile(Petition petition, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(petition.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract static class Petition {
        protected int petitionNumber;
        protected String studentId;
        protected String courseCode;
        protected String instructorName;
        protected String chairpersonDecision;
        protected String deanDecision;

        public Petition(int petitionNumber, String studentId, String courseCode, String instructorName) {
            this.petitionNumber = petitionNumber;
            this.studentId = studentId;
            this.courseCode = courseCode;
            this.instructorName = instructorName;
        }

        public abstract boolean getFinalApproval();

        @Override
        public String toString() {
            return "Petition Number: " + petitionNumber + "\nStudent ID: " + studentId + "\nCourse Code: " + courseCode +
                    "\nInstructor Name: " + instructorName + "\nChairperson Decision: " + chairpersonDecision +
                    "\nDean Decision: " + deanDecision;
        }
    }

    public static class ChangeOfGradePetition extends Petition {
        private int oldGrade;
        private int newGrade;
        private String reasonForChange;

        public ChangeOfGradePetition(int petitionNumber, String studentId, String courseCode, String instructorName,
                                     int oldGrade, int newGrade, String reasonForChange) {
            super(petitionNumber, studentId, courseCode, instructorName);
            this.oldGrade = oldGrade;
            this.newGrade = newGrade;
            this.reasonForChange = reasonForChange;
        }

        @Override
        public boolean getFinalApproval() {
            return chairpersonDecision.equals("approve") && deanDecision.equals("approve");
        }
    }

    public static class MakeupExamPetition extends Petition {
        private String missedExamDate;
        private String reasonForMissingExam;
        private String instructorDecision;

        public MakeupExamPetition(int petitionNumber, String studentId, String courseCode, String instructorName,
                                  String missedExamDate, String reasonForMissingExam) {
            super(petitionNumber, studentId, courseCode, instructorName);
            this.missedExamDate = missedExamDate;
            this.reasonForMissingExam = reasonForMissingExam;
        }

        @Override
        public boolean getFinalApproval() {
            // Assuming instructor decision is always approved for makeup exam petitions
            return instructorDecision.equals("approve") && chairpersonDecision.equals("approve") &&
                    deanDecision.equals("approve");
        }
    }

    public static class UserAccount {
        private String name;
        private String position;
        private String faculty;
        private String decision;

        public UserAccount(String name, String position, String faculty, String decision) {
            this.name = name;
            this.position = position;
            this.faculty = faculty;
            this.decision = decision;
        }
    }
}
