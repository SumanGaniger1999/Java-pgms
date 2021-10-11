class GunTester{

static{

System.out.println("static block is started");

}

public static void main(String a[]){

System.out.println("main method is started");
Gun gun = new Gun();
System.out.println(gun);

}
}