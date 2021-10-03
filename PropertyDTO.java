public class PropertyDTO{

public 	PropertyDTO(){
System.out.println("Property object is created");
}

private String propertyName;
private String location;
private String ownerName;
private int  price;

public String getPropertyName(){
 return propertyName;
}

public void setPropertyName(String propertyName){
this.propertyName=propertyName;
}

public String getLocation(){
return location;
}

public void setLocation(String location){
this.location=location;
}

public String getOwnerName(){
return ownerName;
}

public void setOwnerName(String ownerName){
this.ownerName=ownerName;
}

public int  getPrice(){
return price;
}
public void setPrice(int price){
this.price=price;

}
}

