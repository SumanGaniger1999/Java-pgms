class CountryName{

public static void main(String a[]){
 
String[] countryName=new String[5];

countryName[0]="India";
countryName[1]="SriLanka";
countryName[2]="England";
countryName[3]="SouthAfrica";
countryName[4]="USA";

int[] noOfStates=new int[5];

noOfStates[0]=29;
noOfStates[1]=12;
noOfStates[2]=20;
noOfStates[3]=21;
noOfStates[4]=28;


for(int z=0; z<countryName.length;z++){
System.out.println(countryName[z] +"  ");
}
for(int z=0; z<noOfStates.length;z++){
System.out.println(noOfStates[z] +"  ");
}
}
}