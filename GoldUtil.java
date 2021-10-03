class GoldUtil{
 public static void main(String a[]){

 GoldDTO dto = new GoldDTO();

dto.setPrice("Rs.20000");
dto.setWeight("200grams");
dto.setGoldId(233456);

System.out.println(dto.getPrice()+" " +dto.getWeight()+ " "+ dto.getGoldId());
}
}
