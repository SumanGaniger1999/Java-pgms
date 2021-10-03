class EngineerTester{

public static void main(String a[]){

Cse cse = new Cse();

cse.universityName="Vtu";
cse.branchName="cse";
cse.noOfAdmission=80;
cse.solve="application";

String solve=cse.solve();
System.out.println(solve);

cse.displayDetails();



Civ  civ = new Civ();

civ.universityName="Vtu";
civ.branchName="civ";
civ.noOfAdmission=20;
civ.solve="application";
civ.displayDetails();


Mech mech= new Mech();

mech.universityName="Vtu";
mech.branchName="mech";
mech.noOfAdmission=30;
mech.solve="application";

mech.displayDetails();


Ec ec = new Ec();

ec.universityName="Vtu";
ec.branchName="ec";
ec.noOfAdmission=28;
ec.solve="application";
ec.displayDetails();


EEE  eee= new EEE();

eee.universityName="Vtu";
eee.branchName="eee";
eee.noOfAdmission=39;
eee.solve="application";
eee.displayDetails();




}
}












