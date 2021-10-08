class BandhanBank extends Bank{

@Override //this is a annotation,annotation help to fast the process for the compiler,it will tell the compiler this is a method i want to override to the parent 
public void provideLoans(double roi){
System.out.println("Loan provided by BandhanBank ");
System.out.println(roi);


}

}