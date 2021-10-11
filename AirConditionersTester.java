class AirConditionersTester{

public static void main(String a[]){
AirConditioners air=AirConditioners.getAirConditioners();
System.out.println(air);
AirConditioners air1=AirConditioners.getAirConditioners();
System.out.println(air1);

AirConditioners air2=new AirConditioners();
System.out.println(air2);
AirConditioners air3=new AirConditioners();
System.out.println(air3);
}
}