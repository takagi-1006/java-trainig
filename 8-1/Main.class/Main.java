public class Main {
    public static void main(String[] args) {
        //1.勇者を生成
        Hero h=new Hero();//Heroクラスからインスタントを生成し、変数hに入れる
        //2.フィールドに初期値をセット
        h.name="ミナト";//変数hのnameに代入
        h.hp=100;//変数hのhpに代入
        System.out.println("勇者"+h.name+"を生み出しました！");
        //3.勇者のメソッドを呼び出していく
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
        }
}
