public class Maximumfinder{
  private String[] s;
  Maximumfinder(String[] s){
    this.s = s;
  }
  public String maximum(){
    if(s.length == 0 || s == null){
      return null;
    }
    String max = s[0];
    for(int i=1; i<s.length; i++){
      if(s[i].compareTo(max)<0){
        max = s[i];
      }
    }
    return max;
  }
  public static void main(String[] args){
    String s[] = {"hello", "nah","gigga", "HaretNaahme"};
    Maximumfinder m = new Maximumfinder(s);
    String max = m.maximum();
    System.out.println(max);
  }
}
