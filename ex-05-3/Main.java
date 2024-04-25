public class Main {

    public static void main(String[] args) {
      email("メールの宛先","メールの本文");
    }
    public static void email(String addres,String text){
    ;
      System.out.println(addres+"に、以下のメールを送信しました");
      System.out.println("件名：無題");
      System.out.println("本文："+text);
    }
    public static void email(String addres,String text,String title){
        System.out.println(addres+"に、以下のメールを送信しました");
      System.out.println("件名："+title);
      System.out.println("本文："+text);
    }
  }