class Candles{

private static Candles candles=null;
public static Candles getCandles(){

return candles;
}

static {
candles=new Candles();
}
}