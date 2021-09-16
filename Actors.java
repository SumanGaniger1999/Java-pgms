class Actors{

   static String actorsName[]={"Vihnuvardhana","Yash","Ganesh","Rakshita Shetty","Sudeep","Anup Bhandari","Darling Krishna","Puneeth Rajkumar"};
   static int    noOfMovies[]={200,30,40,10,19,3,20,100};

public static void main (String a[]){
System.out.println("Main method started");
getActorsName(actorsName);
getNoOfMovies(noOfMovies);

}

public static void getActorsName(String[] actorsName){
System.out.println("inside getActorsName method with string array parameters ");
for(int i=0;i<actorsName.length;i++){
System.out.println(actorsName[i]);
}
}	

public static void getNoOfMovies(int[] noOfMovies){
System.out.println("inside getNoOfMovies method with string array parameters ");
for(int i=0;i<noOfMovies.length;i++){
System.out.println(noOfMovies[i]);
}
}
}			