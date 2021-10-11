class PowerBank{

private static PowerBank powerBank=null;
public static PowerBank getPowerBank(){

return powerBank;


}

static{

powerBank=new PowerBank();
}
}