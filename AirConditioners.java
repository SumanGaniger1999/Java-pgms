class AirConditioners{

private static AirConditioners airConditioners=null;
public static AirConditioners getAirConditioners(){

return airConditioners;
}

static{

airConditioners=new AirConditioners();
}
}


