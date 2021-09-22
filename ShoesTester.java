class ShoesTester{

public static void main(String a[]){

Shoes shoes= new Shoes();
shoes.brand="Bata";
shoes.price=500;

System.out.println(shoes.brand+ " " + shoes.price);

shoes.wear();


Shoes shoes1= new Shoes();
shoes1.brand="Sparx";
shoes1.price=1000;

System.out.println(shoes1.brand+ " " + shoes1.price);

shoes1.wear();


Shoes shoes2= new Shoes();
shoes2.brand="Adiddas";
shoes2.price=20000;

System.out.println(shoes2.brand+ " " + shoes2.price);

shoes2.wear();


}
}