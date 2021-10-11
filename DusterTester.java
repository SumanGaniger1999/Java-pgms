class DusterTester{

public static void main(String a[]){

Duster duster= Duster.getDuster();
System.out.println(duster);
Duster duster1= Duster.getDuster();
System.out.println(duster1);

Duster duster2=new Duster();
System.out.println(duster2);
Duster duster3=new Duster();
System.out.println(duster3);

}
}