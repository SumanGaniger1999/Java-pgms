class StaplesTester{

static{

System.out.println("static block is created");
}

public static void main(String a[]){
System.out.println("main method is started");
Staples staples=new Staples();
System.out.println(staples);
}
}
