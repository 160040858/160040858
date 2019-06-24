class p10{
   public static void main(String[] ar){
     int n=Integer.parseInt(ar[1]);
     if(ar[0].charAt(0)=='F' && n>=1 && n<=58)
          System.out.println("Percentage of interest:"+"8.2%");
     else if(ar[0].charAt(0)=='F' && n>=59 && n<=100)
           System.out.println("Percentage of interest:"+"9.2%");
     else if(ar[0].charAt(0)=='M' && n>=1 && n<=58)
            System.out.println("Percentage of interest:"+"8.4%");
     else if(ar[0].charAt(0)=='M' && n>=59 && n<=100)
            System.out.println("Percentage of interest:"+"10.5%");
}
}