public class PoisonMatango extends Matango {
    int kougeki = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (kougeki > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
        }
        int damege=h.hp/5;//受けたダメージをint型で用意してあげて、HeroのHPを5で割ってあげる
        h.hp-=damege;//勇者の1/5に相当するdamegeを勇者のHPから引いてあげている。
        System.out.println(damege+"ポイントのダメージ！");

        kougeki--;
    }
}