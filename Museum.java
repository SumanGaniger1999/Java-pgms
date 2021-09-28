class Museum{

String museumName;
String location;
boolean isOpen;


public Museum(){

System.out.println("Museum object is created");


}

public Museum(String museumName,String location,boolean isOpen){

this.museumName=museumName;
this.location=location;
this.isOpen=isOpen;

}
 

public void displayMuseum(){
System.out.println(museumName+ " " + location+ " " +isOpen);

}

}