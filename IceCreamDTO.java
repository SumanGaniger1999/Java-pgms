public class  IceCreamDTO{

public IceCreamDTO(){

System.out.println(this.getClass().getSimpleName()  + " Object is created");

}

private int   iceCreamId;
private String iceCreamName;
private int price;

public int getIceCreamId( ){
return iceCreamId;
}

public void setIceCreamId(int iceCreamId){
this.iceCreamId=iceCreamId;
}

public String getIceCreamName(){
return iceCreamName;
}

public void setIceCreamName(String iceCreamName){
this.iceCreamName=iceCreamName;
}

public int getPrice(){
return price;
}

public void setPrice(int price){
this.price=price;
}
@Override
public String toString(){
return"IceCreamDTO-{iceCreamId="+this.iceCreamId+",iceCreamName="+this.iceCreamName+",price="+this.price+"}";
}
}     