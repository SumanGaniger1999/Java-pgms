class Supermarket{

  static String perfumes[]={"Wotta girl","Eva","Engage","Sweet Heart","Fogg","VIP"};
  static String fruits[]={"Mango","Strawberry","Watermelon","Orange","Sweet Lemon","Apple"};
  
az  static String perfume="Ajmal";

public static void  main(String a[]){
System.out.println("Main method Started");
getPerfumes(perfumes);
getFruits(fruits);
String perf=getPerfumes(perfume);
System.out.println(perf);

}


public static void getPerfumes(String[] perfumes){
System.out.println("inside getPerfume method with string array parameters");
for(int i=0;i<perfumes.length;i++){
System.out.println(perfumes[i]);
}
}

public static void getFruits(String[] fruits){
System.out.println("inside getPerfume method with string array parameters");
for(int i=0;i<fruits.length;i++){
System.out.println(fruits[i]);
}
}

public static String getPerfumes(String perfume){
System.out.println("inside getperfume method");
return perfume;

}
}