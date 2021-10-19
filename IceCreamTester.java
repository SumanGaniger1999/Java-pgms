class IceCreamTester{


public static void main(String a[]){

IceCreamDTO dto=new IceCreamDTO();

dto.setIceCreamId(278378);
dto.setIceCreamName("Cornetto");
dto.setPrice(30);


System.out.println(dto.toString());


IceCreamDTO dto1=new IceCreamDTO();

dto1.setIceCreamId(6786996);
dto1.setIceCreamName("Chocobar");
dto1.setPrice(45);
System.out.println(dto1.toString());
}
}