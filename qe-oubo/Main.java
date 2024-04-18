public class Main {
    public static void main(String[] args) {
      System.out.print("応募番号　N>");
      int number = new java.util.Scanner(System.in).nextInt();
  
      if (number%7==0&&number%47==0) {//７と４７の最小公倍数は３２９なので順番としてABのif文を先に書けば優先されて出力される。
        System.out.println("AB");
      }else if (number % 7 == 0) {
        System.out.println("A");
      }else if (number % 47 == 0) {
        System.out.println("B");
      } else 
        System.out.println("N");
    }
  }