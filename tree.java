class tree{


    /// its a string reverse using the recursion 
    public static String reverse(String text, int i)
    {
      if(i<0){
        return " ";
      }
      return text.charAt(i)+reverse(text,i-1);
    }

    /// its a word reverse using the recursion     "I love coding" ===> "coding love I"


    /* i have a method 
    
    i need to split the based on the space 
    
    i 
    love 
    coding 
     
     parameter (text,start,last)
     sting text ="I love coding"
     int len=text.len (13)
    
    base condition
    if len<0 => return " "
    else if len==" "
         return text.substring(start,last)+fu

    if len==maxlen */                                               
    public static String reverse_word(String text,int start, int last)
    {
      if(start<0)
      {
        return text.substring(start+1,last+1);
      }
      else if(text.charAt(start)==' ')
      {
        //System.out.println(text.substring(start,last+1)+" its  a function");
        return text.substring(start,last+1) + reverse_word(text,start-1,start-1);
      }
      else{
        return reverse_word(text,start-1,last);
      }
    }


    public static void main(String args[])
    {
      String val="b    a";
      int len=val.length()-1;
      System.out.println(reverse_word(val,len,len));
      ///System.out.println(reverse(val,val.length()-1));
      //System.out.println("textsafd".substring(2,4));
        
    }
}