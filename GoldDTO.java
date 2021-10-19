public class GoldDTO{

public GoldDTO(){

System.out.println("Gold object is created");

}

private String price;
private String weight;

public String getPrice(){
return price;
}

public void setPrice(String price){
this.price=price;
}

public String getWeight(){
return weight;
}

public void setWeight(String weight){
this.weight=weight;
}
@Override
public String toString(){
return"GoldDTO-{price="+this.price+",weight="+this.weight+"}";
}
}