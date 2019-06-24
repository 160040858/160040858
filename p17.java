import java.util.*;
class p17{
    public static void main(String[] ar){
            Scanner s=new Scanner(System.in);
            int c=0,n;
            for(int i=23;i<57;i++){
                    n=i; 
                    c=0;
             for(int j=1;j<i;j++){
                     if(n%j==0)
                          c+=1;
         }
         if(c==1)
             System.out.println(n);
          
}

   }       
}