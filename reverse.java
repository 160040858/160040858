class reverse{
      public static void main(String[] ar){
 int a=Integer.parseInt(ar[0]);
 int d=a;,q=0,sum=0;
   while(a>0){
        q=a%10;
        sum=sum*10+q;
        a=a/10;
      }
   System.out.println("Palindrome");
     }
}  