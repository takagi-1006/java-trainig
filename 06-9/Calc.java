package calcapp.main;
import calcapp.logics.*;//calcapp.logicsパッケージに所属する全クラスをインポートする

public class Calc {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
    int total = CalcLogic.tasu(a, b);// CalcLogicクラスのtasuメソッドを指している
    int delta = calcapp.logics.CalcLogic.hiku(a, b);// (.)は「～の」
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
