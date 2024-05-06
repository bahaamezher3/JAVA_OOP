import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
  static void printArrayList(ArrayList<Person> list) {
    for (Person person : list) {
      System.out.println("Number: " + person.getNumber());
      System.out.println("First Name: " + person.getFirstName());
      System.out.println("Last Name: " + person.getLastName());
      System.out.println("Age: " + person.getAge());
      System.out.println();
    }
  }
  public static void main(String args[]){
    ArrayList<Person> listPerson = new ArrayList<Person>();
    System.out.println("plz enter n: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      boolean isRepeated;
      int number;
      do{
        isRepeated = false;
        System.out.println("plz enter number: ");
        number = sc.nextInt();
        for(Person p : listPerson){
          if(p.getNumber()==number){
            isRepeated = true;
            System.out.println("choose another one");
            break;
          }
        }
      }while(isRepeated);
      sc.nextLine();
      System.out.println("plz enter fisrt name: ");
      String fisrtName = sc.nextLine();
      System.out.println("plz enter last name");
      String lastName = sc.nextLine();
      System.out.println("plz enter age: ");
      int age = sc.nextInt();
      Person p = new Person(number,fisrtName,lastName,age);
      listPerson.add(p);
    }
    Collections.sort(listPerson,new Person.sortArrayList());
    printArrayList(listPerson);
  }
}
