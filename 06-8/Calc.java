package calcapp.main;
import calcapp.logics.CalcLogic;//「このソースコードでCalcLogicという表記があったら、それは
                                //calcapp.logics(パッケージ名).CalcLogoc(クラス名)のことだと解釈しなさい」という指示

public class Calc {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
    int total = CalcLogic.tasu(a, b);// CalcLogicクラスのtasuメソッドを指している
    int delta = calcapp.logics.CalcLogic.hiku(a, b);// (.)は「～の」
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
