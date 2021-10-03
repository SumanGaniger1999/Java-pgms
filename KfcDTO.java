public class KfcDTO{

public KfcDTO(){

System.out.println("Kfc object is created");

}

private String itemName;
private int   price;
private int   orderNo;

public String getItemName(){
return itemName;
}

public void setItemName(String itemName){
this.itemName=itemName;
}

public int getPrice(){
return price;
}

public void setPrice(int price){
this.price=price;
}

public int getOrderNo(){
return orderNo;
}

public void setOrderNo(int orderNo){
this.orderNo=orderNo;
}
}
 

