class GameTester{

public static void main(String a[]){

GamesDTO dto=new GamesDTO();
dto.setGameId(857857);
dto.setGameName("Kabaddi");
dto.setGameType("Outdoor");
System.out.println(dto.toString());

GamesDTO dto1=new GamesDTO();
dto1.setGameId(857845);
dto1.setGameName("Table Tennise");
dto1.setGameType("Indoor");
System.out.println(dto1.toString());
}
}