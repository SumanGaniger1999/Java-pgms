class ShirtsTester{


public static void main(String a[]){

Shirt shirt=new Shirt();
shirt.brand="Zodiac";
shirt.price=3000;


System.out.println(shirt.brand+ " " + shirt.price);

shirt.wear();


Shirt shirt1=new Shirt();
shirt1.brand="Parx";
shirt1.price=5000;


System.out.println(shirt1.brand+ " " + shirt1.price);

shirt1.wear();


Shirt shirt2=new Shirt();
shirt2.brand="Park Avenue";
shirt2.price=3000;


System.out.println(shirt2.brand+ " " + shirt2.price);

shirt2.wear();


}
}