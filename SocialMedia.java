class SocialMedia{

     static String apps[]={"Whatsapp","Instagram","Facebook","Telegram","Twitter","Snapchat","G-mail","Zomato"};
    

     public static void main(String a[]){
     System.out.println("Main method started");
     getApps(apps);
   

}

      public static void getApps(String[] apps){
 
    System.out.println("inside getApps method with string array parameters");
    for(int i=0;i<apps.length;i++){
    System.out.println(apps[i]);
}
}
}
   