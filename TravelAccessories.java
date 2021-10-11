class TravelAccessories{

private static TravelAccessories travelAccessories=null;
public static TravelAccessories getTravelAccessories( ){
return travelAccessories;
}
static {
travelAccessories=new TravelAccessories();
}
}
