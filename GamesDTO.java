public class GamesDTO{

public GamesDTO(){
System.out.println("GamesDTO object is created");

}
private int gameId;
private String gameName;
private String gameType;

public int getGameId(){
return gameId;
}

public void setGameId(int gameId){
this.gameId=gameId;
}

public String getGameName(){
return gameName;
}

public void setGameName(String gameName){
this.gameName=gameName;
}

public String getGameType(){
return gameType;
}

public void setGameType(String gameType){
this.gameType=gameType;
}
@Override
public String toString(){
return "GameDTO-{gameId="+gameId+",gameName="+gameName+",gameType="+gameType+"}";
}
}

