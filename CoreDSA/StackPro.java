import java.util.Stack;

public class StackPro {
    public static void main(String[] args) {

        //Stack
        Stack<Character> stack= new Stack<>();

        //String
        String parameters="{{[}}";

        for(int i=0;i<parameters.length();i++){

            char temp=parameters.charAt(i);

            if(temp == '{'){stack.push(temp);}
            if(temp == '['){stack.push(temp);}
            if(temp == '('){stack.push(temp);}
            
            if(temp == '}'){
                if(stack.peek()=='{')
                {
                    stack.pop();
                }
            }
            if(temp == ']'){
                if(stack.peek()=='[')
                {
                    stack.pop();
                }
            }
            if(temp == ')'){
                if(stack.peek()=='(')
                {
                    stack.pop();
                }
            }
            
        }   

        if(stack.isEmpty())
        {
            System.out.println(" GIVEN PARAMETER IS VALID");
        }
        else
        {
            System.out.println("GIVEN PARAMETER IS NOT VALID");
        }
    }
}
/// 4 5 2 10   answer is 5 10 10 -1
/// sort method = 2 4 5 10    answer 5 10 4 -1 
/// decrease method = 10 5 4 2  
/// 