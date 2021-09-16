class IPL1{


static String teamsName[]=new String[3];
public static void main(String a[]){

teamsName[0]="RCB";
teamsName[1]="CSK";
teamsName[2]="RR";
getteamsName();
}
public static void getteamsName()
{
System.out.println(teamsName.length);
for(int i=0;i<teamsName.length;i++)
{

System.out.println(teamsName[i]);
}
}
}