class Countries{


static String countryName[]=new String[3];
public static void main(String a[]){

countryName[0]="India";
countryName[1]="Pakistan";
countryName[2]="England";
getcountryName();
}
public static void getcountryName()
{
System.out.println(countryName.length);
for(int i=0;i<countryName.length;i++)
{

System.out.println(countryName[i]);
}
}
}