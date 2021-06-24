import java.util.*;
class ValidParenthesis{
    


    public static void valid_paren(String input_str)
    {   //Declaring a stack
        Stack<Character> s = new Stack<Character>();
        //Iterating over the entire string
        for (char st : input_str.toCharArray()){
         //If the input string contains an opening parenthesis
         //push it on to stack
         if(st=='('){
             s.push(st);
         }
         else{
             //In the case of valid parentheses, the stack cannot be 
             //empty if a closing parathesis is encountered.
            if(s.empty()){
                System.out.println(input_str + 
            " contains invalid parentheses.");
            return;
            }
            else{
              //if the input string contains ) ,then pop the
              //correspon ( 
              char top= (Character) s.peek();
              if(st==')' && top =='(')
              {
                  s.pop();

              }

              else{
                  System.out.println(input_str +" contains invalid parantheses");
                  return;
              }


            }

          }

        }
        if(s.empty()){
            System.out.println(input_str +" contains valid parentheses."); 
        }
        else{
             System.out.println(input_str +"  contains invalid parentheses.");
        }
    
    }


    public static void main( String args[]){
        String input_str1="(())()(())";
        String input_str2="((()";
        String input_str3=")";
        valid_paren(input_str1);
        valid_paren(input_str2);
        valid_paren(input_str3);
    }
}
