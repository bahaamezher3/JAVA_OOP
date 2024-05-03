import java.util.Scanner;
public class Main{
  public static void max_min(int T[]){
    int max = T[0];
    int min = T[0];
    for(int i=1; i<T.length; i++){
      if(T[i]>max){
        max = T[i];
      }
      if(T[i]<min){
        min = T[i];
      }
    }
    System.out.println("max = " + max + " min = " + min);
  }
  public static void main(String args[]) {
    int T[] = {1,2,5,6,4};
    max_min(T);
  }
}
