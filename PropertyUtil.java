class PropertyUtil{

public static void main(String a[]){

PropertyDTO dto=new PropertyDTO();

dto.setPropertyName("Real Living");
dto.setLocation("near whitefield ");
dto.setOwnerName("Tappu");
dto.setPrice(30000);

System.out.println(dto.getPropertyName()+ "  " + dto.getLocation() + " " + dto.getOwnerName() + " " + dto.getPrice() );

}
}
 