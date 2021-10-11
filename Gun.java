class Gun{


public Gun(){
System.out.println("constructor is called");
System.out.println(this.getClass().getSimpleName()+"object is created  " );

}


static{
System.out.println("static block is created");
}

{
 
System.out.println("init block is created");


}
}