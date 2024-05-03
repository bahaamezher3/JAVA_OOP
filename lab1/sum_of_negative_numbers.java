import java.util.Scanner;
public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n, sum = 0;
    do{
      System.out.println("plz enter n: ");
      n = sc.nextInt();
      if(n<0){
        sum += n;
      }
    }while(n<0);
    System.out.println("sum of negative numbers entered: " + sum);
  }
}
