class ChocolatesTaste{


public static void main(String a[]){

Chocolates chocolate= new Chocolates();
chocolate.name="KitKat";
chocolate.price=20;
chocolate.brand="Nestle";

System.out.println(chocolate.name+ " " + chocolate.price+" " +chocolate.brand);

chocolate.eat();

Chocolates chocolate1= new Chocolates();
chocolate1.name="Melody";
chocolate1.price=20;
chocolate1.brand="Parle-G";

System.out.println(chocolate1.name+ " " + chocolate1.price+" " +chocolate1.brand);

chocolate1.eat();


Chocolates chocolate2= new Chocolates();
chocolate2.name="Poppions";
chocolate2.price=10;
chocolate2.brand="Parle-G";

System.out.println(chocolate2.name+ " " + chocolate2.price+" " +chocolate2.brand);

chocolate2.eat();

}
}
