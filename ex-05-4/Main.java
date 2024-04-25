public class Main {//1つ目のメソッド

    public static void main(String[] args) {
      double answer=clacTriangleArea(10.0,5.0);
      System.out.println(answer);
      double as=clacCircleArea(5.0,3.14);
      System.out.println(as);
    }
    public static double clacTriangleArea(double bottom,double height){
      return bottom*height/2;
    }
    public static double clacCircleArea(double radius,double pie){
      return radius*radius*pie;
    }
  }