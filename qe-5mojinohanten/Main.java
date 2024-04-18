public class Main {
    public static void main(String[] args) {
      String[] r = new String[6];//文字列配列　new要素の型[入れる値の数]
      for (int i = 0; i < 5; i++) {
        System.out.print(i + "文字目を入力してください>");
        r[i] = new java.util.Scanner(System.in).nextLine();
  
      }
      System.out.println(5 + "文字目：" + r[4]);
      System.out.println(4 + "文字目：" + r[3]);
      System.out.println(3 + "文字目：" + r[2]);
      System.out.println(2 + "文字目：" + r[1]);
      System.out.println(1 + "文字目：" + r[0]);
  
    }
  }