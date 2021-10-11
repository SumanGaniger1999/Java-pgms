class TravelsTester{

public static void main(String a[]){

TravelAccessories travels=TravelAccessories.getTravelAccessories();
System.out.println(travels);
TravelAccessories travels1=TravelAccessories.getTravelAccessories();
System.out.println(travels);

TravelAccessories travels2=new TravelAccessories();
System.out.println(travels2);
TravelAccessories travels3=new TravelAccessories();
System.out.println(travels3);

}
}