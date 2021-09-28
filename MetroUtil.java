class MetroUtil{

public static void main(String a[]){

Metro metro=new Metro();
metro.stations[0]="Kuvempu metro station";
metro.stations[1]="Mahalaxmi metro station";
metro.stations[2]="Srirampura metro station";

Metro  metro1=new Metro("Namma Metro "," Banglore",metro.stations);
metro1.displayMetro();
metro1.getStations();




}
}
