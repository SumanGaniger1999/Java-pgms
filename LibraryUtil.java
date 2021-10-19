class LibraryUtil{

public static void main(String a[]){

LibraryDTO dto=new LibraryDTO();

dto.setLibraryName("National Library");
dto.setNoOfBooks(24);
dto.setLocation("near Prestige road");

System.out.println(dto.toString());

}
} 