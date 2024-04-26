public class Main {
    public static void main(String[] args) {
        Monster[] monster=new Monster[3];
        monster[0]=new Slime();
        monster[1]=new Goblin();
        monster[2]=new DeathBat();
        for (Monster m :monsters){
            m.run();
        }
    }
}
