public class Hero extends Charcter {
    public void attack(Matango m){
        System.out.println(this.name+"の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた！");
        m.hp-=10;
    }
}
