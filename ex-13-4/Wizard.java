package bouken.Wizard;
public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basepoint = 10;
        int recovPoint = (int) (basepoint * this.wand.power);
        h.setHp(h.setHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if (name==null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length()<=3) {
            throw new IllegalArgumentException("魔法使いや杖の名前には必ず3文字以上を指定してください。");
        }
        this.name=name;
    }

    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        if (hp<0) {
            hp=0;
        }else{
            this.hp=hp;
        }
    }

    public int getMp(){
        return this.mp;
    }
    public void setMp(int mp){
        if (mp<0) {
            throw new IllegalArgumentException("MP値が異常です。");
        }
        this.mp=mp;
    }

    public Wand getWand(){
        return this.wand;
    }
    public void setWand(Wand wand){
        if (wand==null) {
            throw new IllegalArgumentException("異常です。");
        }
        this.wand=wand;
    }
}
