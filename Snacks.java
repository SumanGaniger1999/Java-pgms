class Snacks{

private static Snacks snacks=null;
public static Snacks getSnacks(){
return snacks;

}

static{

snacks=new Snacks();
}
}