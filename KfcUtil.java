class KfcUtil{

public static void main(String a[]){

KfcDTO dto= new KfcDTO();
dto.setItemName("Veg Burger");
dto.setPrice(30);
dto.setOrderNo(20);

System.out.println(dto.getItemName() + "  " + dto.getPrice() + "  " +  dto.getOrderNo());

}
}