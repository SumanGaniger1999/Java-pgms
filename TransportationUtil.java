class TransportationUtil{

public static void main(String a[]){

Transportation transportation=new Transportation();
transportation.modesOfTransport[0]="Air";
transportation.modesOfTransport[1]="Water";
transportation.modesOfTransport[2]="Land";

Transportation transportation1= new Transportation("United Parcel Service","near Whitefield Banglore",transportation.modesOfTransport);
transportation1.displayTransportation();
transportation1.getModesOfTransport();
}
}
