import java.util.Scanner;
public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
      System.out.println("plz enter positive n: ");
      n = sc.nextInt();
    } while (n < 0);
    int s = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        s += i;
      }
    }
    System.out.println(s);
  }
}
