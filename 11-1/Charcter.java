public class Charcter {
    String name;
    int hp;
    //
    public void run(){
        System.out.println(this.name+"は逃げ出した");
    }
    //戦う
    public void attack(Matango m){
        System.out.println(this.name+"の攻撃！");
        m.hp-=??;
        System.out.println("敵に？？ポイントのダメージをあたえた！");
    }
}