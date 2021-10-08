class BankTester{

public static void main(String a[]){

Bank bank=new BandhanBank();
BandhanBank bandhanBank=(BandhanBank)bank;
bank.provideLoans(7.5);
System.out.println(bank);

Bank bank1=new SBIBank();
SBIBank sbiBank=(SBIBank)bank1;
bank1.provideLoans(8.2);
System.out.println(bank1);


Bank bank2=new KaveriBank();
KaveriBank kaveriBank=(KaveriBank)bank2;
bank2.provideLoans(7.6);
System.out.println(bank2);


Bank bank3=new ApnaBank();
ApnaBank apnaBank=(ApnaBank)bank3;
bank3.provideLoans(9.5);
System.out.println(bank3);

Bank bank4=new HDFCBank();
HDFCBank hdfcBank=(HDFCBank)bank4;
bank4.provideLoans(4.2);
System.out.println(bank4);

Bank bank5=new ICICIBank();
ICICIBank iciciBank=(ICICIBank)bank5; 
bank5.provideLoans(5.6);
System.out.println(bank5);
}
}