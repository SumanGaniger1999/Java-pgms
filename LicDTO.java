public class LicDTO{


public LicDTO(){

System.out.println("Lic object is created");

}

private int policyId;
private String agentName;
private String customerName;
private int   years;

public int getPolicyId(){

return policyId;
}

public void setPolicyId(int policyId){

this.policyId=policyId;
}

public String getAgentName(){
return agentName;
}

public void setAgentName(String agentName){
this.agentName=agentName;
}

public String getCustomerName(){
return customerName;
}

public void setCustomerName(String customerName){
this.customerName=customerName;
}

public int getYears(){
 return years;
}

public void setYears(int years){
this.years=years;
}
}


