package calcapp.main;

public class Calc {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
    int total = calcapp.logics.CalcLogic.tasu(a, b);// 「calcapp.logicsパッケージ」の「CalcLogicクラス」の「tasu()」であると明示的に所属を示す必要がある。
    int delta = calcapp.logics.CalcLogic.hiku(a, b);// (.)は「～の」
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
