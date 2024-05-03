import java.util.Scanner;

public class Main{
  double a,b,c;
  void Eq(double a, double b, double c){
    this.a=a;this.b=b;this.c=c;
  }
  void Solution(){
    double d=b*b-4*a*c;
    if(d<0)
      System.out.println("no solutions");
    else
    if(d==0)
      System.out.println("Solution double x1=x2="+(-b/(2*a)));
    else{
      double x1,x2;
      x1=(-b-Math.sqrt(d))/(2*a);
      x2=(-b+Math.sqrt(d))/(2*a);
      System.out.println("x1 = "+x1+" ,x2 = "+x2);
    }

  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a,b,c: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    Main quadraticSolver = new Main();
    quadraticSolver.Eq(a, b, c);
    quadraticSolver.Solution();
  }
}
