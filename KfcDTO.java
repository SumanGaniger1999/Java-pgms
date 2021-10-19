public class KfcDTO{

public KfcDTO(){

System.out.println("Kfc object is created");
}

private String itemName;
private int price;


public String getItemName(){
return itemName;
}

public void setItemName(String itemName){
this.itemName=itemName;
}

public int getPrice(){
return price;
}

public void setPrice(int price){
this.price=price;
}
@Override
public String toString(){
return"KfcDTO-{itemName="+this.itemName+",price="+this.price+"}";

}
}