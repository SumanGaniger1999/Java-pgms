class Speaker{

          static String name="Boat";
          static int minVolume=0;
          static int maxVolume=15; 
          static boolean isConnected=false;
          static int currentVolume;


 public static boolean  onOrOff(){
    System.out.println("Inside onOroff");
    if(isConnected==false){
    isConnected=true;
     System.out.println("Speaker is turned On......");
 return isConnected;
}
else if(isConnected==true){
   isConnected=false;
System.out.println("Speaker turned Off......");
   return isConnected;
}
 return false;
}
public static void  increaseVolume(){

System.out.println("inside increaseVolume()");
    if(isConnected){
    if(currentVolume<maxVolume){
    currentVolume=currentVolume+1;
System.out.println("The current Volume is:"+currentVolume);
}
  else{

System.out.println("Max Volume reached........");
}
}
else{
System.out.println("Gubee switch  on the Speaker.....");
}
System.out.println("end of increaseVolume()");
}


public static void  decreaseVolume() {

System.out.println("inside decrease Volume()");
    if(isConnected) {
    if(currentVolume>minVolume) {
    currentVolume=currentVolume-1;
System.out.println("The current Volume is:"+currentVolume);
}
  
else{

System.out.println("Min Volume reached........");
}
}
System.out.println("end of decreaseVolume()");
}
}
