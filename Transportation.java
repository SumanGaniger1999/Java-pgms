class Transportation{
 
String name;
String location;
String modesOfTransport[]= new String[3];

public Transportation(){
System.out.println("Metro object is created");
}

public Transportation(String name,String location,String modesOfTransport[]){

this.name=name;
this.location=location;
this.modesOfTransport=modesOfTransport;
}

public void displayTransportation(){
System.out.println(name+" "+location + " "+modesOfTransport);
}
public void getModesOfTransport(){
for(int i=0;i<modesOfTransport.length;i++){
System.out.println(modesOfTransport[i]);
}
}
}

 