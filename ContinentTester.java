class ContinentTester{

public static void main(String a[]){

ContinentDTO dto=new ContinentDTO();
dto.setContinentId(345678);
dto.setContinentName("Asia");

System.out.println(dto.toString());


ContinentDTO dto1=new ContinentDTO();
dto1.setContinentId(345678);
dto1.setContinentName("Antartica");

System.out.println(dto1.toString());
}
}