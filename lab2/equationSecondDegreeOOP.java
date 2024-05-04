import java.lang.Math;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class secondDegree {
  double a,b,c;
  secondDegree(double a,double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  void Answers(){
    double delta = (b*b) - (4 * a * c);
    if(delta<0){
      System.out.println("no solutions");
    }
    else if(delta == 0){
      double x = -b/(2*a);
      System.out.println(x);
    }
    else{
      double x1, x2;
      x1 = (-b - sqrt(delta))/(2*a);
      x2 = (-b + sqrt(delta))/(2*a);
      System.out.println("dobule solution: x1 = " + x1 +" x2 = " + x2);
    }
  }
  public static void main(String[] args){
    System.out.println("plz enter a,b,c: ");
    Scanner sc = new Scanner(System.in);
    double a,b,c;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    secondDegree solv = new secondDegree(a,b,c);
    solv.Answers();
  }
}
