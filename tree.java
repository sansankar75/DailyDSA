class tree{

    private static String nodes(String a,int l,String c)
    {
      if(l==0){
        return c;
      }
      return c + nodes(a,l-1,(String) a.charAt(l-1));
    }

    public static void main(String args[])
    {
        String value="san";
        int lenOfValue=value.length();
        String val=nodes(value,lenOfValue,value.chatAt(lenOfValue-1));
        System.out.println(val);
    }
}