public class Thief {
    String name;
    int hp;
    int mp;

    public Thief(String name, int hp, int mp) {

        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Thief(String name, int hp) {
        this(name, hp, 5);

        this.mp = 5;
        this.hp = hp;
        this.name = name;
    }

    public Thief(String name) {
        this(name, 40, 5);// 6行目のコンストラクタを呼び出して初期値を書き込むこともできる

        this.name = name;
        this.hp = 40;
        this.mp = 5;
    }
}
