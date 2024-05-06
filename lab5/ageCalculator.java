import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class Main{
  public static void main(String args[]){
    String s;
    System.out.println("plz enter date YYYY-MM-DD: ");
    Scanner sc = new Scanner(System.in);
    s=sc.nextLine();
    LocalDate d = LocalDate.parse(s);
    LocalDate current = LocalDate.now();
    Period age = Period.between(d,current);
    System.out.println("you are " + age.getYears() + " years " + age.getMonths()+ " Months " + age.getDays() + " days " );

  }
}
