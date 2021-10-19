public class DrivingLicenseDTO{

public DrivingLicenseDTO(){

System.out.println("DrivingLicenseDTO object is created");

}

private String name;
private int  age;
private int  adharCardNumber;

public String getName(){

return name;
}

public void setName(String name){
this.name=name;
}

public int getAge(){
return age;
}

public void setAge(int age){
this.age=age;
}

public int getAdharCardNumber(){
return adharCardNumber;
}

public void setAdharCardNumber(int adharCardNumber){
this.adharCardNumber=adharCardNumber;
}
@Override
public String toString(){
return "DrivingLicenseDTO-{name="+this.name+",age="+this.age+"}";
}
}

