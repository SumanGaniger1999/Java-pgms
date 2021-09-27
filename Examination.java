class Examination{
public  String universityName="VTU";
public  int fees=1350;


public Examination(String universityName,int fees ){
System.out.println("Exam object is created");
this.universityName=universityName;
this.fees=fees;
}


public  void allow(String[] hallTicket){
System.out.println("start of allow method with hallTicket");
if(hallTicket!=null){
  getHallTicket(hallTicket);
}
else{
  System.out.println("No HallTicket Found");
}
System.out.println("end of allow method with Hallticket");
}

 public static void allow(int fees){
  
 System.out.println("start of allow method with fees");
 if(fees>1000){
 System.out.println(fees);
 
}
  else{
 
 System.out.println("Gubee......please pay fees");
}
System.out.println("end allow method with fees");
}

 

public static void getHallTicket(String[] hallTicket){

for(int i=0;i<hallTicket.length;i++){
System.out.println(hallTicket[i]);
}
}
}
