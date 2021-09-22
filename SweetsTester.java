class SweetsTester{


public static void main(String a[]){

Sweets sweet= new Sweets();
sweet.sweetName="Barfi";
sweet.quantity="half kg";

System.out.println(sweet.sweetName+" "+ sweet.quantity);

sweet.eat();

Sweets sweet1= new Sweets();
sweet1.sweetName="Champakali";
sweet1.quantity="half kg";

System.out.println(sweet1.sweetName+" "+ sweet1.quantity);

sweet1.eat();



Sweets sweet2= new Sweets();
sweet2.sweetName="Gulab Jamuna";
sweet2.quantity="half kg";

System.out.println(sweet2.sweetName+" "+ sweet2.quantity);

sweet2.eat();

}
}