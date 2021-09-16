import java.util.Scanner;

class ExaminationUtil{
static String[] hallTicket=new String[3];

public static void main(String a[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Candidate Name");
String candidateName= sc.next();

System.out.println("Enter the USN No");
String usnNo= sc.next();

System.out.println("Enter Subject");
String subject= sc.next();

hallTicket[0]=candidateName;
hallTicket[1]=usnNo;
hallTicket[2]=subject;


System.out.println("main method started");
Examination.allow(hallTicket);
Examination.allow(1100);
System.out.println("main method ended");
}
}

