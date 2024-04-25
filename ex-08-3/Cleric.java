public class Cleric {
    String name;
    int HP=50;
    int MP=10;

    final int MaxHP=50;
    final int MaxMP=10;


    public void selfAid(){
        this.MP -=5;
        int Aid=this.MaxHP-this.HP;
        int newHP=this.HP+Aid;
        this.HP=newHP;//this.HP=MaxHPということ
        
    }

    public int pray(int sec){
        int hosei= new java.util.Random().nextInt(3)+(sec);
        int cap=this.MaxMP-this.MP;
        if (hosei>cap) {//回復量が回復できる量より大きかった場合回復できる最大量をかえしてあげる
            return cap;
        }else{
            return hosei;
        }
        }


}
