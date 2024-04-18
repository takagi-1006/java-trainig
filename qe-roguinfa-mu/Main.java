public class Main {
    public static void main(String[] args) {
      loginCheck();
    }
  
    public static void loginCheck() {
      boolean OK = false;
      System.out.println("ログインします");
      for (;;) {//for(;;)と記述するとはfor文の無限ループにできる
        System.out.print("ユーザー名>");
        String user = new java.util.Scanner(System.in).nextLine();
        System.out.print("パスワード>");
        String pass = new java.util.Scanner(System.in).nextLine();
        if (user.equals("helloUser") && pass.equals("helloPass")) {// 文字列の比較
          OK = true;
        } else {
          System.out.println("ログイン失敗");//OK=trueでなかった場合の処理
        }
        if (OK) {
          System.out.println("ログイン成功");
          break;//break;でfor(;;)の無限ループを抜けてあげる。
        }
  
      }
    }
  }