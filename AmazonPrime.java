//Method overloading
class AmazonPrime{

static String movies[]={"Shersha","Cindrella","RakthaCharitra","Jaathi Rathnalu","Robert","KGF","Yuvarathna","Master","Lights Out","QuitePlace"};
static String series[]={"Mirzapur","The Family Man","Four More Shots","Vampire Diaries","Mumbai Diaries","Originals","The last shift","Inside Edge","Panchayat"};


static String movie="Dia";

public static void main(String a[]){


System.out.println("main method started");
getMovies(movies);
getSeries(series);
String mov=getMovies(movie);
System.out.println(mov);

}



public static void getMovies(String[] movies){
System.out.println("inside getMovies method with string array parameters");
for(int i=0;i<movies.length;i++){
System.out.println(movies[i]);
}
}

public static void getSeries(String[] series){
System.out.println("inside getSeries method with string array parameters");
for(int i=0;i<series.length;i++){
System.out.println(series[i]);
}
}

public static String getMovies(String movie){
System.out.println("inside getmovie method"); 
return movie;
}

}

