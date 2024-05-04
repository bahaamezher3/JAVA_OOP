import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StudentManager studentManager = new StudentManager();
    NotesManager notesManager = new NotesManager();

    boolean exit = false;

    while (!exit) {
      System.out.println("Choose an option:");
      System.out.println("1. Add Student");
      System.out.println("2. Update Student Name");
      System.out.println("3. Remove Student");
      System.out.println("4. Display Students");
      System.out.println("5. Display Notes for Student");
      System.out.println("6. Add Note");
      System.out.println("7. Modify Note");
      System.out.println("8. Remove Note");
      System.out.println("9. Display All Notes");
      System.out.println("10. Exit");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter student number:");
          int studentNumber = scanner.nextInt();
          System.out.println("Enter student name:");
          String studentName = scanner.next();
          Student newStudent = new Student(studentNumber, studentName);
          studentManager.addStudent(newStudent);
          break;
        case 2:
          System.out.println("Enter student number to update:");
          int updateId = scanner.nextInt();
          System.out.println("Enter new name:");
          String newName = scanner.next();
          studentManager.updateStudent(updateId, newName);
          break;
        case 3:
          System.out.println("Enter student number to remove:");
          int removeId = scanner.nextInt();
          studentManager.removeStudent(removeId);
          break;
        case 4:
          studentManager.displayStudents();
          break;
        case 5:
          System.out.println("Enter student number to display notes:");
          int studentId = scanner.nextInt();
          studentManager.displayNotesForStudent(studentId);
          break;
        case 6:
          System.out.println("Enter note number:");
          int noteNumber = scanner.nextInt();
          System.out.println("Enter note code:");
          String noteCode = scanner.next();
          System.out.println("Enter note:");
          int note = scanner.nextInt();
          Notes newNote = new Notes(noteNumber, noteCode, note);
          notesManager.addNote(newNote);
          break;
        case 7:
          System.out.println("Enter note code to modify:");
          String modifyCode = scanner.next();
          System.out.println("Enter new note:");
          int newNoteValue = scanner.nextInt();
          notesManager.modifyNote(modifyCode, newNoteValue);
          break;
        case 8:
          System.out.println("Enter note code to remove:");
          String removeCode = scanner.next();
          notesManager.removeNote(removeCode);
          break;
        case 9:
          notesManager.displayNotes();
          break;
        case 10:
          exit = true;
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice. Please enter a number from 1 to 10.");
          break;
      }
    }
    scanner.close();
  }
}
