class Printers{

private static Printers printers=null;
public static Printers getPrinters(){
return printers;
}

static{
printers=new Printers();
}
}