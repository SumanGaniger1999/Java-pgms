class PrintersTester{

public static void main(String a[]){

Printers printers=Printers.getPrinters();
System.out.println(printers);

Printers printers1=Printers.getPrinters();
System.out.println(printers1);

Printers printers2= new Printers();
System.out.println(printers2);

Printers printers3=new Printers();
System.out.println(printers3);
}
}