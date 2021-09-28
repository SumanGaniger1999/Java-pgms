class Metro{


String name;
String locations;
String  stations[]= new String[3];

public Metro(){

System.out.println("Metro object is created");
}

public Metro(String name,String locations,String stations[]){

this.name=name;
this.locations=locations;
this.stations=stations;
}

public void displayMetro(){
System.out.println(name+ " " + locations );
}
public void getStations(){
for(int i=0;i<stations.length;i++){
System.out.println(stations[i]);
}
}
}