class Appliances{

String appliancesName;
String appliancesLocation;
String  company[]=new String[3];

public Appliances(){
System.out.println("Appliances object is created");
}

public Appliances(String appliancesName,String appliancesLocation,String  company[]){

this.appliancesName=appliancesName;
this.appliancesLocation=appliancesLocation;
this.company=company;
}
public void displayAppliances(){
System.out.println(appliancesName+ " " +  appliancesLocation + " " +company);
}
public void getCompany(){
for(int i=0;i<company.length;i++){
System.out.println(company[i]);
}
}
}