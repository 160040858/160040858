class p9{
  public static void main(String[] ar){
        char ae='W';
        if(ae>=0 && ae<=9)
             System.out.println("Digit");
        else if((ae>='a' && ae<='z' )||(ae>='A' && ae<='Z'))
              System.out.println("Character");
        else
            System.out.println("Special Character");
}}