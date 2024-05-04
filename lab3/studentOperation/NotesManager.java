import java.util.ArrayList;
public class NotesManager{
  ArrayList <Notes> notesList;
  NotesManager(){
    notesList = new ArrayList<Notes>();
  }
  void addNote(Notes n){
    notesList.add(n);
  }
  void modifyNote(String code, int note){
    for(Notes notee : notesList){
      if(notee.getCode().compareTo(code)==0){
        notee.setNote(note);
        break;
      }
    }
  }
  void removeNote(String code){
    for(int i=0; i<notesList.size();i++){
      Notes n = notesList.get(i);
      if(n.getCode().equals(code)){
        notesList.remove(i);
      }
    }
  }
  void displayNotes(){
    for(int i=0; i<notesList.size(); i++){
      Notes n = notesList.get(i);
      System.out.println(n.getCode() + " " + n.getNote() + " " + n.getNumber());
    }
  }
}
