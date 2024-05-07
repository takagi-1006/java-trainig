public class Main {
    public static void main(String[] args) {
        Hero h=new Hero();//インスタンス生成と同時にコンストラクタによってHPに100が代入される

        System.out.println(h.hp);
    }
}
