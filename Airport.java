class Airport{


static String internationalAirports[]=new String[3];
public static void main(String a[]){

internationalAirports[0]="Emirates";
internationalAirports[1]="British Airways";
internationalAirports[2]="Etihad Airways";
getinternationalAirports();
}
public static void getinternationalAirports()
{
System.out.println(internationalAirports.length);
for(int i=0;i<internationalAirports.length;i++)
{

System.out.println(internationalAirports[i]);
}
}
}
