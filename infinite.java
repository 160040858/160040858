class infy{
    public static void main(String[] args){
     int i=0,c=0;
     boolean a=true;
      while(a){
         i+=1;
        if(c==5){
            a=false;
         }else if(i%2==0 && i%3==0 && i%5==0){
                c+=1;
                System.out.println(i);
         }
}
}
}