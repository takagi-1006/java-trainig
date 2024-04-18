public class Main {
    public static void main(String[] args) {
      System.out.print("-100~100を入力>");
      int input=new java.util.Scanner(System.in).nextInt();
      if (input>=0) {
        System.out.print("入力された数値は　正の");//inputが0以上だったときのif文
      }else if (input<0) {
        System.out.print("入力された数値は　負の");//inputが0未満だったときのif else文
      } if (input%2==0) {
        System.out.print("偶数");//inputを2で割ったとき余りが0で偶数であることが正しいif文
      }else 
      System.out.print("奇数");//inputの余りが0でなかった場合のelse文
    }
  }//inputが正か負かのif文
  //inputが奇数か偶数かのif文の2つのif文を使う。