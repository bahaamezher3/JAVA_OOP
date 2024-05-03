import java.util.Scanner;
public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("plz enter a and b: ");
    a = sc.nextInt();
    b = sc.nextInt();
    int gcd = 1;
    for(int i=1; i<=a && i<=b;i++){
      if(a%i==0 && b%i == 0){
        gcd = i;
      }
    }
    System.out.println(gcd);
  }
}
