
class ExaminationUtil{
static  String[] hallTicket=new String[3];

public static void main(String a[]){




hallTicket[0]="candidateName";
hallTicket[1]="usnNo";
hallTicket[2]="subject";


System.out.println("main method started");

Examination exam=new Examination("VTU",1100);
Examination.allow(hallTicket);
Examination.allow(1100);
System.out.println("main method ended");
System.out.println(exam.universityName+ "  " +exam.fees);
}
}

