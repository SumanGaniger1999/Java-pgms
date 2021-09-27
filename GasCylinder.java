class GasCylinder{

public String cylinderName;
public int cost;
public String color;


public GasCylinder(String cylinderName,int cost,String color){

System.out.println("GasCylinder object is created");
this.cylinderName=cylinderName;
this.cost=cost;
this.color=color;
}

public static void main(String a[]){
GasCylinder gascylinder=new GasCylinder("Bharat Gas",450,"Red");
System.out.println(gascylinder.cylinderName+ " " +gascylinder.cost+ " " + gascylinder.color);
}
}
