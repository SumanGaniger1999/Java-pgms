class ToysTester{

static {

System.out.println("static block is created");
}

public static void main(String a[]){

System.out.println("main method started");
Toys toys=new Toys();
System.out.println(toys);
}
}
 