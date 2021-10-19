class GodTester{

public static void main(String a[]){

GodDTO dto=new GodDTO();
dto.setGodId(345678);
dto.setGodName("Ganesh");
dto.setPlace("Jamkhandi");

System.out.println(dto.toString());


GodDTO dto1=new  GodDTO();
dto1.setGodId(6678687);
dto1.setGodName("Krishna");
dto1.setPlace("Udupi");

System.out.println(dto1.toString());
}
}