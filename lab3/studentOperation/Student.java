public class Student {
  private int number;
  private String name;

  Student(int number, String name){
    this.name = name;
    this.number = number;
  }
  void setName(String name){
    this.name = name;
  }
  void setNumber(int number){
    this.number = number;
  }
  int getNumber(){
    return number;
  }
  String getName(){
    return name;
  }
}
