class WaterPurifiers{


public WaterPurifiers(){

System.out.println("Contructor is called");
System.out.println(this.getClass().getSimpleName()+ " object is created  ");
}

static {

System.out.println("static block is created");

}


{
System.out.println("init block is created");

}
}