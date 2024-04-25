public abstract class TangibleAsset extends Asset implements Thing{
    String color;
    double weight;

    public TangibleAsset(String name, int price, String color, double weight){
        super(name,price);
        this.color=color;
        this.weight=weight;
    }

    public String getColor(){//getColorは自分に返してあげてる感じ
        return this.color;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        this.weight=weight;//オーバーライドしてあげなくちゃいけない決まり。インターフェースはあくまで値の入れられていない箱
    }
} 