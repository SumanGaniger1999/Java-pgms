class Sofa{

public String brand;
public int cost;
public String color;

public Sofa(String brand,int cost,String color){

System.out.println("Sofa object is created");
this.brand=brand;
this.cost=cost;
this.color=color;
}


public static void main(String a[]){
Sofa sofa=new Sofa("VIP",20000,"cream");
System.out.println(sofa.brand+ " " + sofa.cost + " " +sofa.color);
}
}
