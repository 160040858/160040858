class pri{
    public static void main(String[] ar){
            int n=Integer.parseInt(ar[0]);
            if(ar.length!=0){
              for(int j=1;j<n;j++){
                     if(n%j==0)
                          c+=1;
         }
}
         if(c==1)
             System.out.println("prime number");
          else
               System.out.println("Not prime number");

   }       
}