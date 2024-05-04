import java.util.ArrayList;
public class StudentManager {
  private ArrayList<Student> studentList;
  private NotesManager NotesManager;
  public StudentManager(){
    studentList = new ArrayList<>();
    NotesManager = new NotesManager();
  }
  public void addStudent(Student s){
    studentList.add(s);
  }
  public void updateStudent(int id, String newName){
    for(Student student : studentList){
      if(student.getNumber() == id){
        student.setName(newName);
        break;
      }
    }
  }

  /*
  * public void updateStudent(int id, String newName){
  * for(int i=0; i<studentList.size();i++){
  * Student student = Student.getNumber(i);
  * if(student.getNumber() == id){
  * student.setName(newName);
  * break;
  * }
  * }
  * }
  */
  public void removeStudent(int id) {
    for (int i = 0; i < studentList.size(); i++) {
      Student student = studentList.get(i);
      if (student.getNumber() == id) {
        studentList.remove(i);
        break;
      }
    }
  }
  public void displayStudents(){
    for(Student student : studentList){
      System.out.println("id = " + student.getNumber()+"\n name: " + student.getName());
    }
  }
  public void displayNotesForStudent(int studentNumber) {
    for (Notes note : NotesManager.notesList) {
      if (note.getNumber() == studentNumber) {
        System.out.println("Student number: " + note.getNumber());
        System.out.println("Note code: " + note.getCode());
        System.out.println("Note: " + note.getNote());
        System.out.println("--------------------");
      }
    }
  }
}
