/*Write a program that allows entering a positive integer n and stores the divisors of n in an array t.*/

import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n;
    do{
      System.out.println("plz enter positive n: ");
      n = sc.nextInt();
    }while(n<0);
    int k = 0;
    for(int i = 1; i<= n; i++){
      if(n%i==0){
        k++;
      }
    }
    int T[] = new int[k];
    k = 0;
    for(int i = 1; i<=n;i++){
      if(n%i==0){
        T[k++] = i;
      }
    }
    for(int i=0; i<T.length; i++){
      System.out.println(T[i]);
    }
  }
}
