class AppliancesUtil{

public static void main(String a[]){
Appliances appliances=new Appliances();
appliances.company[0]="Samsung";
appliances.company[1]="LG";
appliances.company[2]="Panasonic";

Appliances appliances1=new Appliances("Oven","near VasanEyecare Banglore", appliances.company);
appliances1.displayAppliances();
appliances1.getCompany();
}
}
