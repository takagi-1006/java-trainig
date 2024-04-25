public class Main {
    public static void heal(int hp) {
        hp += 10;
    }

    public static void heal(Thief thief) {
        thief.hp += 10;
    }

    public static void main(String[] args) {
        int baseHP=25;
        Thief t=new Thief("アサカ",baseHP);
        heal(baseHP);
        System.out.println(baseHP+":"+t.hp);
        heal(t);
        System.out.println(baseHP+":"+t.hp);
    }
}
//new型が参照としてアドレスがきちんと認識されていない
//コンストラクタを定義する際にメソッド宣言に戻り値の型が記述されていないことが条件なので、
//Thiefのコンストラクタの参照に成功していない
//voidが書かれているためThiefインスタンスが正しく実行できない。

//<25:25><25:35>という実行結果を出したい。