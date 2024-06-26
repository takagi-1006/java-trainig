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
        this.name=name;
    }

    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        this.hp=hp;
    }

    public int getMp(){
        return this.mp;
    }
    public void setMp(int mp){
        this.mp=mp;
    }

    public Wand getWand(){
        return this.wand;
    }
    public void setWand(Wand wand){
        this.wand=wand;
    }
}
