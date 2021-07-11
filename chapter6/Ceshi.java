package chapter6;

public class Ceshi {
  public static void main(String[] args){
     var pa = new ProcessArray();
     int[] array = {3,-4,6,4};
     pa.process(array,(int element)->{
        System.out.println("数组元素的平方是:" + element*element);
     });
  }
}
