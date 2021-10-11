class ColdTester{


static {

System.out.println("static block is created");
}

public static void main(String a[]){

System.out.println("main method is created");
ColdDrinks coldDrinks=new ColdDrinks();

System.out.println(coldDrinks);
}
}