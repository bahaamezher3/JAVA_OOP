import java.util.Scanner;
public class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n;
    System.out.print("enter positive n: ");
    n = scan.nextInt();
    boolean test=true;
    for(int i=2;i<n;i++){
      if(n%i==0){
        test=false;
        break;
      }
    }
    if(test)
      System.out.println("n is prime");
    else
      System.out.println("n is not prime");

  }
}
