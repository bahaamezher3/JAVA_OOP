import java.util.Scanner;
public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
      System.out.println("plz enter positive n: ");
      n = sc.nextInt();
    } while (n < 0);
    double s1 = 0, s2 = 0;
    for(int i=1; i<=n; i++){
      s1 = s1 + i*i*i;
      s2 = s2 + 1.0/i;
    }
    System.out.println("s1 = " + s1 + " s2 =  " + s2);
  }
}
