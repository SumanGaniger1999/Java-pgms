class LaptopTester{


public static void main(String a[]){


 Laptop laptop=new Laptop();
 laptop.laptopId=289812;
 laptop.name="hp";
 laptop.price=38000;
 laptop.memory="16 GB";

System.out.println(laptop.laptopId+ " " + laptop.name+" " +laptop.price+ "  " +laptop.memory);

laptop.typing();

Laptop laptop1=new Laptop();
 laptop1.laptopId=289867;
 laptop1.name="dell";
 laptop1.price=33000;
 laptop1.memory="16 GB";

System.out.println(laptop1.laptopId+ " " + laptop1.name+" " +laptop1.price+ "  " +laptop1.memory);

laptop1.typing();

Laptop laptop2=new Laptop();
 laptop2.laptopId=289823;
 laptop2.name="lenovo";
 laptop2.price=30000;
 laptop2.memory="8 GB";

System.out.println(laptop2.laptopId+ " " + laptop2.name+" " +laptop2.price+ "  " +laptop2.memory);

laptop2.typing();

}
}

