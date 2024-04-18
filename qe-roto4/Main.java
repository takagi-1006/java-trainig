public class Main {
    public static void main(String[] args) {
      int[] winningNumber = {4,4,1,2};
      System.out.println("ロト4を始めます");
      int[] roto = new int[4];
      for (int i = 0; i < 4; i++) {
        System.out.print(i + "個目の数字を入力してください>");
        roto[i] = new java.util.Scanner(System.in).nextInt();
      }
      boolean isroto = true;
      for (int i = 0; i < 4; i++) {
  
        if (winningNumber[i]!= roto[i]) {//左辺と右辺が異なる場合
          isroto = false;
        }
      }
      if (isroto) {
        System.out.println("大当たり");
      } else {
        System.out.println("はずれ・・・");
      }
  
    }
  }