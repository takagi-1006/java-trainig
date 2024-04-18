public class Main {
    public static void main(String[] args) {
      int[] nunbers = new int[5];
      nunbers[0] = new java.util.Random().nextInt(9) + 0;
      nunbers[1] = new java.util.Random().nextInt(9) + 0;
      nunbers[2] = new java.util.Random().nextInt(9) + 0;
      nunbers[3] = new java.util.Random().nextInt(9) + 0;
      nunbers[4] = new java.util.Random().nextInt(9) + 0;
      int Max = nunbers[0];//
      int Min = nunbers[0];
      for (int num : nunbers) {
        System.out.println(num + ",");
      } // 拡張for文
      for (int i = 0; i < nunbers.length; i++) {// 従来のfor文
        if (Max < nunbers[i]) {//
          Max = nunbers[i];
        } else if (Min > nunbers[i]) {// もしnumber[i]がMin変数より大きければ、numbers[i]がMin変数に代入
          Min = nunbers[i];
        }
      }
      System.out.println("最小値：" + Min);
      System.out.println("最大値：" + Max);
      int b = nunbers[0];//移動される場所にいる値を代わりの値に入れておく。
      nunbers[0] = nunbers[nunbers.length-1];//最初と最後の値を入れ替えるプログラム。
      nunbers[nunbers.length-1] = b;
      for (int num : nunbers) {
        System.out.println(num + ",");
      } // 拡張for文// b←nunber[0] , nunber[0]←nunber[4] , nunber[4]←b 、一周してね？
      //[nunbers.length-1]でもよい。nunbers.length=Nとするならばnunber[4]などは実際は５番目でnunber[4]はN-1にも当てはまる。
    }
  }