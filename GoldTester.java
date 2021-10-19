class GoldTester{

public static void main(String a[]){

GoldDTO dto =new GoldDTO();
dto.setPrice("Rs.20000");
dto.setWeight("200gm");

System.out.println(dto.toString());



GoldDTO dto1 = new GoldDTO();
dto1.setPrice("Rs.36726");
dto1.setWeight("200gm");

System.out.println(dto1.toString());
}
}