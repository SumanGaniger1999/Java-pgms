class Temple1{


static String templeNames[]=new String[3];
public static void main(String a[]){

templeNames[0]="Emirates";
templeNames[1]="British Airways";
templeNames[2]="Etihad Airways";
gettempleNames();
}
public static void gettempleNames()
{
System.out.println(templeNames.length);
for(int i=0;i<templeNames.length;i++)
{

System.out.println(templeNames[i]);
}
}
}
