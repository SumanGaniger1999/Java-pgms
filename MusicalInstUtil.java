class MusicalInstUtil{



public static void main(String a[]){

MusicalInstruments music=new MusicalInstruments();
music.name=" Guitar";
music.price=4000.50;
music.frequency="40 Hz";
music.type="Western";


System.out.println(music.name+"  "+music.price+ "  "+ music.frequency+ " "+ music.type);

music.play(music.name);




MusicalInstruments music1=new MusicalInstruments();
music1.name="Violin";
music1.price=1000.00;
music1.frequency="12 Hz";
music1.type="Western";


System.out.println(music1.name+"  "+music1.price+ "  "+ music1.frequency+ " "+ music1.type);

music1.play(music1.name);




}
}




