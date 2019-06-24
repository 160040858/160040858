class sumall{
      public static void main(String[] ar){
 int a=Integer.parseInt(ar[0]);
 int d=a;,q=0,sum=0;
   while(a>0){
        q=a%10;
        sum=sum+q;
        a=a/10;
      }
        System.out.println(sum);
  
     }
}   