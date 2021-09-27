class Division{
 public static void main(String a[]){

 int ans= div(8,7);   
 int res=div(3,2,2);
System.out.println(ans);
System.out.println(res);


}

public static int div(int a,int b){

return(a/b);

}
public static int div(int a,int b,int c){

return(a/b/c);

}
}