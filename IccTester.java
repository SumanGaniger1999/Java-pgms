class IccTester{

public static void main(String a[]){


 IccTeams iccteam=new IccTeams();
 iccteam.teamName="India";
 iccteam.rating=113;

System.out.println(iccteam.teamName+ " " + iccteam.rating);

iccteam.play();

 IccTeams iccteam1=new IccTeams();
 iccteam1.teamName="WestIndies";
 iccteam1.rating=84;

System.out.println(iccteam1.teamName+ " " + iccteam1.rating);

iccteam1.play();



 IccTeams iccteam2=new IccTeams();
 iccteam2.teamName="SouthAfrica";
 iccteam2.rating=98;

System.out.println(iccteam2.teamName+ " " + iccteam2.rating);

iccteam2.play();

}
}