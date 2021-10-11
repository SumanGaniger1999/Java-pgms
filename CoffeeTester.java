class CoffeeTester{

static{

System.out.println("static block is created");
}

public static void main(String a[]){
System.out.println("main method is started");
CoffeeMakers coffee=new CoffeeMakers();
System.out.println(coffee);
}
}
