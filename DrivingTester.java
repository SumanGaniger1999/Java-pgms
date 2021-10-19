class DrivingTester{

public static void main(String a[]){

DrivingLicenseDTO dto = new DrivingLicenseDTO();

dto.setName("Suman");
dto.setAge(23);
dto.setAdharCardNumber(526256756);

System.out.println(dto.toString());


DrivingLicenseDTO dto1=new DrivingLicenseDTO();

dto1.setName("Tappu");
dto1.setAge(18);
dto1.setAdharCardNumber(2889797);

System.out.println(dto1.toString());




DrivingLicenseDTO dto2=new DrivingLicenseDTO();

dto2.setName("Souji");
dto2.setAge(22);
dto2.setAdharCardNumber(677678);

System.out.println(dto2.toString()); 

}
}
