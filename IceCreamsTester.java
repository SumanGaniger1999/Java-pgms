class IceCreamsTester{


public static void main(String a[]){

IceCreams icecream=new IceCreams();
icecream.name="Cornetto";
icecream.price=30;
icecream.brand="Classic";

System.out.println(icecream.name+ " " + icecream.price+" " +icecream.brand);

icecream.taste();


IceCreams icecream1=new IceCreams();
icecream1.name="Cone Icecream";
icecream1.price=20;
icecream1.brand="Amul";

System.out.println(icecream1.name+ " " + icecream1.price+" " +icecream1.brand);

icecream1.taste();



IceCreams icecream2=new IceCreams();
icecream2.name="Chocobar";
icecream2.price=20;
icecream2.brand="Amul";

System.out.println(icecream2.name+ " " + icecream2.price+" " +icecream2.brand);

icecream2.taste();



}
}