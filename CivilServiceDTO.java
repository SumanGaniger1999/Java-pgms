class CivilServiceDTO{

public CivilServiceDTO(){
System.out.println("CivilServiceDTO Object is created");
}
private long serviceId;
private String serviceName;
private int noOfSeats;


public long getServiceId(){
  return serviceId;
}

public void setServiceId(long serviceId){
this.serviceId=serviceId;
}

public String getServiceName(){
  return serviceName;

}

public void setServiceName(String serviceName){
this.serviceName=serviceName;
}


public int getNoOfSeats(){
  return noOfSeats;

}

public void setNoOfSeats(int noOfSeats){
this.noOfSeats=noOfSeats;
}


@Override
public String toString(){
return "CivilServiceDTO-{serviceId="+this.serviceId+",serviceName="+this.serviceName+",noOfSeats="+this.noOfSeats+"}";
}
}





