class SportTester{

public static void main(String a[]){

Sports sport=new Sports();
sport.name="Cricket";
sport.players=11;

System.out.println(sport.name+ " " + sport.players);

sport.play();

Sports sport1=new Sports();
sport1.name="Cricket";
sport1.players=12;

System.out.println(sport1.name+ " " + sport1.players);

sport1.play();


Sports sport2=new Sports();
sport2.name="Volleyball";
sport2.players=6;

System.out.println(sport2.name+ " " + sport2.players);

sport2.play();

}
}