public class LibraryDTO{

public LibraryDTO(){

System.out.println("Library object is created");
}

private String libraryName;
private int  noOfBooks;
private String location;

public String getLibraryName(){
return libraryName;
}
public void setLibraryName(String libraryName){
this.libraryName=libraryName;
}

public int getNoOfBooks(){
return noOfBooks;
}

public void setNoOfBooks(int noOfBooks){
this.noOfBooks=noOfBooks;
}

public String getLocation(){
return location;
}

public void setLocation(String location){
this.location=location;
}
}