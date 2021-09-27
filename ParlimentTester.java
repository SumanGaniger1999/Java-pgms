class ParlimentTester{

public static void main(String a[]){

Parliment parl= new Parliment();

 parl.house="Rajya Sabha";
 parl.members=245;

parl.assembly();

parl.displayParlimentDetails();



Parliment parl1= new Parliment();

 parl1.house="Lok Sabha";
 parl1.members=543;

parl1.assembly();

parl1.displayParlimentDetails();


}
}