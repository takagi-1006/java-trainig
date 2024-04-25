public class Calc {
    public static void main(String[] args) {
      int a = 10;
      int b = 2;
      int total = CalcLogic.tasu(a, b);//CalcLogicのtasu()であると明示的に所属を示す必要がある。 
      int delta = CalcLogic.hiku(a, b);//(.)は「～の」という意味がある。
      System.out.println("足すと" + total + "、引くと" + delta);
    }
  }
  