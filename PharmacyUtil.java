class PharmacyUtil{

public static void main(String a[]){

PharmacyDTO dto= new PharmacyDTO();
dto.setPharmacyName("Apollo");
dto.setLocation("no.665 19th Main Rd");
dto.setPrice(100);

System.out.println(dto.getPharmacyName()+ " " + dto.getLocation() + " " + dto.getPrice());
}
}
