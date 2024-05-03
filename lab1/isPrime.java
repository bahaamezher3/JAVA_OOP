import java.util.Scanner;
public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
      System.out.println("plz enter positive n: ");
      n = sc.nextInt();
    } while (n < 0);
    if(n==0 || n ==1){
      System.out.println("not prime");
      return;
    }
    if(n==2){
      System.out.println("prime");
      return ;
    }
   for(int i=2; i<n; i++){
     if(n%i==0){
       System.out.println("not prime");
       return ;
     }
   }
    System.out.println("prime");
  }
}
