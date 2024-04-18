public class Main {
    public static void main(String[] args) {
      for (int i = 1004; i <= 3000; i++) {
        if ((i % 100 != 0 && i % 4== 0 )||i % 400 == 0) {//
          //4でも１００で割り切れたらうるう年ではない
          //400で割り切れたら４でも割り切れる
          System.out.println(i + "年");
  
        }
      }
    }
  }