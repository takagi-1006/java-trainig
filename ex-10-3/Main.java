public class Main {
    public static void main(String[] args) {
        Hero h=new Hero();
        PoisonMatango pm=new PoisonMatango('A');

        pm.attack(h);

        System.out.println("残りHP："+h.hp);
    }
}
