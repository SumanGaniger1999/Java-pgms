class Tablets{


public Tablets(){


System.out.println("constructor is called");
System.out.println(this.getClass().getSimpleName() + "  object is created ");

}


static {


System.out.println("static block is created");
}

{

System.out.println("instance block is created");
}

} 

