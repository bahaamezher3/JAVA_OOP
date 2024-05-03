import java.util.Scanner;
public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("plz enter n: ");
    n = sc.nextInt();
    int sum=0;
    while(n>0){
      sum += n%10;
      n /= 10;
    }
    System.out.println(sum);
  }
}
