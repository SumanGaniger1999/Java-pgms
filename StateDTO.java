public class StateDTO{


public StateDTO(){

System.out.println("State object is created");
}

private int stateId;
private String stateName;



public int getStateId(){
return stateId;
}

public void setStateId(int stateId){

this.stateId=stateId;
}

public String getStateName(){
return stateName;
}

public void setStateName(String stateName){
this.stateName=stateName;
}

@Override
public String toString(){

return"StateDTO-{stateId="+this.stateId+",stateName="+this.stateName+"}";
}
}

