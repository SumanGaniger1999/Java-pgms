class OpticalsTester{


public static void main(String a[]){

Opticals optical=new Opticals();

optical.brand="Ray Ban";
optical.price=2000;

System.out.println(optical.brand+ " " + optical.price);

optical.wear();

Opticals optical1=new Opticals();
optical1.brand="Oxydo";
optical1.price=5000;

System.out.println(optical1.brand+ " " + optical1.price);

optical1.wear();


Opticals optical2=new Opticals();
optical2.brand="Boss Orange";
optical2.price=2000;

System.out.println(optical2.brand+ " " + optical2.price);

optical2.wear();

}
}