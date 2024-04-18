public class Main {

    public static void main(String[] args) {
      email("メールの宛先アドレス","メールの本文","メールの本文");
    }
    public static void email(String title,String addres,String text){
    ;
      System.out.print(addres+"に、以下のメールを送信しました");
      System.out.print("件名："+title);
      System.out.print("本文："+text);
    }
  }