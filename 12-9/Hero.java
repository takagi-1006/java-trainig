public class Hero extends Character {
    public void attack(Monster main){
        System.out.println(this.name+"の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた！");
        m.hp-=10;
    }
}
