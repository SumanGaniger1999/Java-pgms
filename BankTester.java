class BankTester{

public static void main(String a[]){

Bank bank=new BandhanBank();
bank.provideLoans(7.5);
System.out.println(bank);

Bank bank1=new SBIBank();
bank1.provideLoans(8.2);
System.out.println(bank1);


Bank bank2=new KaveriBank();
bank2.provideLoans(7.6);
System.out.println(bank2);


Bank bank3=new ApnaBank();
bank3.provideLoans(9.5);
System.out.println(bank3);

Bank bank4=new HDFCBank();
bank4.provideLoans(4.2);
System.out.println(bank4);

Bank bank5=new ICICIBank();
bank5.provideLoans(5.6);
System.out.println(bank5);
}
}