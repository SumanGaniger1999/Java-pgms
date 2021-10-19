public class ContinentDTO{


public ContinentDTO(){

System.out.println("Continent object is created");
}

private int continentId;
private String continentName;



public int getcontinentId(){
return continentId;
}

public void setContinentId(int ContinentId){

this.continentId=continentId;
}

public String getContinentName(){
return continentName;
}

public void setContinentName(String ContinentName){
this.continentName=continentName;
}

@Override
public String toString(){

return"ContinentDTO-{continentId="+this.continentId+",continentName="+this.continentName+"}";
}
}

