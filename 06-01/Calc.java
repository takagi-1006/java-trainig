public class Calc {
    public static void main(String[] args) {
      int a=10;int b=2;
      int total=tasu(a,b);//tasuメソッドで行われた計算がtotalの中に入っている
      int delta=hiku(a,b);//hikuメソッドで行われた計算がdeltaの中に入っている
      System.out.println("足すと"+total+"、引くと"+delta);
    }
    public static int tasu(int a,int b){//tasuメソッド
      return(a+b);//total=tasuの中身の計算をしている。それをmainメソッドに返して値を入れている
    }
    public static int hiku(int a,int b){
      return(a-b);
    }
  }
  