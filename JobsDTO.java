public class JobsDTO{


public JobsDTO(){

System.out.println("Jobs object is created");
}

private int jobId;
private String companyName;
private String jobType;


public int getJobId(){
return jobId;
}

public void setJobId(int jobId){

this.jobId=jobId;
}

public String getCompanyName(){
return companyName;
}

public void setCompanyName(String companyName){
this.companyName=companyName;
}

public String getJobType(){
return jobType;
}

public void setJobType(String jobType){
this.jobType=jobType;
}

@Override
public String toString(){

return"JobsDTO-{jobId="+this.jobId+",companyName="+this.companyName+",jobType="+this.jobType+"}";
}
}

