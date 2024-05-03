import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n ;
    do{
      System.out.println("plz enter positive n: ");
      n = sc.nextInt();
    }while(n<0);
    int x = 1;
    if(n==0){
      System.out.println(x);
    }
    else{
      while(n>0){
        x = x * n;
        n--;
      }
    }
    System.out.println(x);
  }
}
