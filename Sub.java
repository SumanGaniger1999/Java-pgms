class Sub{
 public static void main(String a[]){

 int ans= sub(8,1);   
 int res=sub(9,8,1);
System.out.println(ans);
System.out.println(res);


}

public static int sub(int a,int b){

return(a-b);

}
public static int sub(int a,int b,int c){

return(a-b-c);

}
}