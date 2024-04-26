public class Main {
    public static void main(String[] args) {
        Character[] c=new Character[5];//様々な職業のキャラクターたちも、すべてCharacter配列に格納して一括で処理できる
        //従来のやり方で5人のインスタンスを厳密にHeroやThiefとして扱おうとする限り、それらを一括しては扱えない。
        //しかし、それぞれをCharacterだとザックリ見なせば「どれもキャラクター」なので一括できる
        c[0]=new Hero();
        c[1]=new Hero();
        c[2]=new Thief();
        c[3]=new Wizard();
        c[4]=new Wizard();
        //宿屋に泊まる
        for(Character ch : c){
            ch.hp+=50;
        }
    }
}
