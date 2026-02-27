import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

/// i excute the first two program in this file

public class executeProgram{

    private static List<String> subsets(String words)
    {
        List<String> result= new ArrayList<>();
        StringBuilder temp=new StringBuilder();

        backtracking(0,words,temp,result);
        return result;
    }
    private static void backtracking(int index,String words,StringBuilder temp,List<String> result)
    {
       if(index==words.length())
       {
        result.add(temp.toString());
        return ;
       }

       //Include
       temp.append(words.charAt(index));
       backtracking(index+1, words, temp, result);

       //Exclude
       temp.deleteCharAt(temp.length()-1);
       backtracking(index+1, words, temp, result);
    }
    public static void main(String[] args) {
        System.out.println(subsets(new String("san")));
    }
}