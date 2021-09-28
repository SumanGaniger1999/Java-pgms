class FancyStores{

String storeName;
String location;
String ownerName;
boolean isOpen;

public FancyStores(){

System.out.println("FancyStores object is created");


}

public FancyStores(String storeName,String location,String ownerName,boolean isOpen){

this.storeName=storeName;
this.location=location;
this.ownerName=ownerName;
this.isOpen=isOpen;

}
 

public void displayFancyStores(){
System.out.println(storeName+ " " + location+ " " +ownerName+ " " + isOpen);

}

}