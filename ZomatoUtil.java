class ZomatoUtil{

public static void main(String a[]){

ZomatoDTO dto=new ZomatoDTO();
dto.setRestaurantName("Biriyani House");
dto.setItemName("Veg Biriyani");
dto.setPrice(100);

System.out.println(dto.getRestaurantName()+ " " + dto.getItemName()+ " " + dto.getPrice());

}
}