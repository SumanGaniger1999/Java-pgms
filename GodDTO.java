public class GodDTO{

public GodDTO(){

System.out.println("GodDTO object is created");

}

private int   godId;
private String godName;
private String place;

public int getGodId(){
return godId;
}

public void setGodId(int godId){

this.godId=godId;
}

public String getGodName(){
return godName;
}

public void setGodName(String godName){
this.godName=godName;
}

public String getPlace(){
return place;
}

public void setPlace(String place){
this.place=place;
}
@Override
public String toString(){

return"GodDTO-{godId="+this.godId+",godName="+this.godName+",place="+this.place+"}";
}
}

