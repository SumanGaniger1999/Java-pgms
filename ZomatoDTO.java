public class ZomatoDTO{

public ZomatoDTO(){

System.out.println("Zomato object is created ");

}

private String restaurantName;
private String itemName;
private int price;

public String getRestaurantName(){
return restaurantName;
}

public void setRestaurantName(String restaurantName){
this.restaurantName=restaurantName;
}

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
return"Zomato-{restaurantName="+this.restaurantName+",itemName="+this.itemName+",price="+this.price+"}";
}
}