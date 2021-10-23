
import java.util.*;
class HospitalTester{


public static void main(String a[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter size"  );
int size=sc.nextInt();

Hospital hospital=new Hospital(size);

for(int i=0;i<size;i++){
PatientDTO dto=new PatientDTO();
System.out.println("Enter the Patient Details");
System.out.println("Enter the PatientId");
int patientId=sc.nextInt();
System.out.println("Enter the Patient Name");
String patientName=sc.next();
System.out.println("Enter the address");
String address=sc.next();
System.out.println("Enter the age");
int age=sc.nextInt();
System.out.println("Enter the gender");
char gender=sc.next().charAt(0);
System.out.println("Enter the bloodGroup");
String bloodGroup=sc.next();
System.out.println("Enter the contactNo");
long contactNo=sc.nextLong(); 


dto.setPatientId(patientId);
dto.setPatientName(patientName);
dto.setAddress(address);
dto.setAge(age);
dto.setGender(gender);
dto.setBloodGroup(bloodGroup);
dto.setContactNo(contactNo);

boolean isAdded=hospital.createPatientDetails(dto);
System.out.println("PatientAdded:"+isAdded);
}



System.out.println(hospital.getPatientByName("Suman"));
System.out.println(hospital.getPatientById(1));
System.out.println(hospital.getPatientByContactNo(9632895336L));
System.out.println(hospital.getPatientByAddress("Jamkhandi"));
System.out.println(hospital.getPatientByBloodGroup("O-ve"));
System.out.println(hospital.getPatientByAge(22));
System.out.println("Enter patient id and contact number to update");
int patientId=sc.nextInt();
long contactNo=sc.nextLong();
hospital.updateContactNoById(1,9448133784L);

hospital.getAllPatients();

System.out.println("Enter patient Id to delete");
int id1=sc.nextInt();
hospital.deletePatientById(id1);
		
hospital.getAllPatients();


}
}