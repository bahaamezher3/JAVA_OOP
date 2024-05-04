public class Maximumfinder{
  int[] array;
  Maximumfinder(int[] array){
    this.array = array;
  }
  public int findMaximum(){
    int max = array[0];
    if(array.length == 0 || array == null){
      return -1;
    }
    for(int i=0; i<array.length; i++){
      if(array[i]>max){
        max = array[i];
      }
    }
    return max;
  }
  public static void main(String[] args){
    int[] T = {17,15,89,0};
    Maximumfinder m = new Maximumfinder(T);
    int max = m.findMaximum();
    System.out.println(max);
  }
}
