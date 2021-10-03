public class PharmacyDTO{

public PharmacyDTO(){
System.out.println("Pharmacy  object is created");
}

private String pharmacyName;
private String location;
private int price;

public String getPharmacyName(){
return pharmacyName;
}

public void setPharmacyName(String pharmacyName){
this.pharmacyName=pharmacyName;
}

public String getLocation(){
return location;
}

public void setLocation(String location){
this.location=location;
}
public int getPrice(){
return price;
}

public void setPrice(int price){
this.price=price;
}
}