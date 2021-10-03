class DrivingTester{

public static void main(String a[]){

DrivingLicenseDTO dto = new DrivingLicenseDTO();

dto.setName("Suman");
dto.setAge(23);
dto.setAdharCardNumber(526256756);

System.out.println(dto.getName() + " " + dto.getAge() + "  "  + dto.getAdharCardNumber());

}
}
