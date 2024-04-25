public class Main {
    public static void main(String[] args) {
      int x=100;//addメソッドで使用するつもり
      int y=10;//...
      add();//addメソッドを呼び出す
    }
    public static void add(){
      int ans=x+y;//ここで使用するつもり（エラー）
      System.out.println(x+"+"+y+"="+ans);
    }
  }						