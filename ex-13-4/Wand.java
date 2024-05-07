package bouken.Wand;
public class Wand {
   private String name;
   private double power;
   
   public String getName(){
      return this.name;
   }
   public void setHp(String name){
      if (name==null) {
         throw new IllegalArgumentException("名前がnullである。処理を中断。");
     }
     if (name.length()<=3) {
         throw new IllegalArgumentException("魔法使いや杖の名前には必ず3文字以上を指定してください。");
     }
      this.name=name;
   }

   public double getPower(){
      return this.power;
   }
   public void setPower(double power){
      if (power<=0.5) {
         throw new IllegalArgumentException("増幅できません。");
      }
      if (power>=100) {
         throw new IllegalArgumentException("増幅率を超えています。増幅できません。");
      }
      this.power=power;
   }
}
