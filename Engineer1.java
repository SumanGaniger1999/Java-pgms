class Engineer1{

static String streams[]=new String[4];
public static void main(String a[]){

streams [0]="CSE";
streams [1]="EC";
streams [2]="CV";
streams [3]="Mech";
getstreams();
}

public static void getstreams( ){

System.out.println(streams.length);

for(int i=0;i<streams.length;i++){

System.out.println(streams[i]);
}
}
}
