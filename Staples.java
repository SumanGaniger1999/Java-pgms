class Staples{

public Staples(){

System.out.println("constructor is called");
System.out.println(this.getClass().getSimpleName() + " object is created " );

}

static {

System.out.println("static is created");
}

{

System.out.println("init is created");

}
}