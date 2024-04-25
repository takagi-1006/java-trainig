public class Main {
    public static void heal(int hp) {
        hp += 10;
    }

    public static void heal(Thief thief) {
        thief.hp += 10;
    }

    public static void main(String[] args) {
        int baseHP = 25;
        baseHP+=10;
        Thief t = new Thief("アサカ", baseHP);
        heal(baseHP);
        System.out.println(baseHP + ":" + t.hp);
        heal(t.hp);
        System.out.println(baseHP + ":" + t.hp);
    }
}
// healメソッドでThiefを呼び出しても元の値が変わることはない
//逆に呼び出したら値が変わる。コピーによる参照渡し
//int 型が値渡しをしている。Thiefは参照渡しをしている。