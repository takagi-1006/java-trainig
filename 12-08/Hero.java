public class Hero extends Character {
    public void attack(Matango m){
        System.out.println(this.name+"の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた！");
        m.hp-=10;
    }
    public void attack(Gobln g){
        System.out.println(this.name+"の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた！");
        g.hp-=10;
    }
}
