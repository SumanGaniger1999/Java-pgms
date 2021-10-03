class PatientUtil{
 public static void main(String a[]){

PatientDTO dto= new PatientDTO();
 dto.setPatientId(34323443);
 dto.setPatientName("Suman");
 dto.setAge(23);
 dto.setGender("Female");
 dto.setAddress("Jamkhandi");
 dto.setBloodGroup("B+");

System.out.println(dto.getPatientId()+ " "+ dto.getPatientName() + " " +dto.getAge() + " " +dto.getGender() + " " +dto.getAddress()+" " +dto.getBloodGroup());
}
}