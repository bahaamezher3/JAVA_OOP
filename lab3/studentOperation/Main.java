import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StudentManager studentManager = new StudentManager();

    while (true) {
      System.out.println("\n1. Add Student\n2. Update Student\n3. Remove Student\n4. Display Students\n5. Exit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter student ID: ");
          int id = scanner.nextInt();
          scanner.nextLine(); // Consume newline
          System.out.print("Enter student name: ");
          String name = scanner.nextLine();
          studentManager.addStudent(new Student(id, name));
          break;
        case 2:
          System.out.print("Enter student ID to update: ");
          int updateId = scanner.nextInt();
          scanner.nextLine(); // Consume newline
          System.out.print("Enter new name: ");
          String newName = scanner.nextLine();
          studentManager.updateStudent(updateId, newName);
          break;
        case 3:
          System.out.print("Enter student ID to remove: ");
          int removeId = scanner.nextInt();
          studentManager.removeStudent(removeId);
          break;
        case 4:
          studentManager.displayStudents();
          break;
        case 5:
          System.out.println("Exiting program.");
          System.exit(0);
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }
}
