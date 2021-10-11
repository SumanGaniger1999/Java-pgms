class TabletsTester{

static {

System.out.println("static block is created");
}

public static void main(String a[]){

System.out.println("main method is created");
Tablets tablets=new Tablets();
System.out.println(tablets);
}
}