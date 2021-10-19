public class ProjectDTO{

public ProjectDTO(){

System.out.println("Project object is created");
}

private String projectName;
private String guideName;
private String projectMate;

public String getProjectName(){
return projectName;
}

public void setProjectName(String projectName){
this.projectName=projectName;
}

public String getGuideName(){
return guideName;
}

public void setGuideName(String guideName){
this.guideName=guideName;
}
public String getProjectMate(){
return projectMate;
}

public void setProjectMate(String projectMate){
this.projectMate=projectMate;
}
@Override
public String toString(){
return"ProjectDTO-{projectName="+this.projectName+",guideName="+this.guideName+",projectMate="+this.projectMate+"}";

}
}



 


