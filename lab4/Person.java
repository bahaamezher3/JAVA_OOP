import java.util.ArrayList;
import java.util.Comparator;

public class Person {
  int number;
  String firstName;
  String lastName;
  int age;
  Person(int number, String firstName, String lastName, int age){
    this.number = number;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
  int getNumber(){
    return this.number;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  static class sortArrayList implements Comparator<Person> {
    public int compare(Person a, Person b) {
      return Integer.compare(a.number, b.number);
    }
  }
}
