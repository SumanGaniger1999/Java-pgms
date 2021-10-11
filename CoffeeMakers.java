class CoffeeMakers{

public CoffeeMakers(){

System.out.println("constructor is created");
System.out.println(this.getClass().getSimpleName() + " object is created  ");

}

static {

System.out.println("static block is created ");
}

{

System.out.println("init block is created");
}
}