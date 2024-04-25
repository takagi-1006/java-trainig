public class Calc {
    public static void main(String[] args) {
      int a = 10;
      int b = 2;
      int total = tasu(a, b);//Clac.javaにはtasu()、hiku()は存在しない 
      int delta = hiku(a, b);//ソースファイルの分割によってtasu()、hiku()はCalcLogicクラスに属するようになった
      System.out.println("足すと" + total + "、引くと" + delta);
    }
  }
          