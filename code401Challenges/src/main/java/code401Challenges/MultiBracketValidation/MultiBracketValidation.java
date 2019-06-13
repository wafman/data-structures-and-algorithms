package code401Challenges.MultiBracketValidation;

import code401Challenges.stacksandqueues.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        char current;
        Stack s = new Stack();
        for(int i = 0; i < input.length(); i++){
            current = input.charAt(i);
            if(current == '(' || current == '{' || current == '['){
                s.push(current);
            } else if( current == ')'){
                if(s.peek() == null || (char) s.pop() != '('){
                    return false;
                }
            } else if( current == '}'){
                if(s.peek() == null || (char) s.pop() != '{'){
                    return false;
                }
            } else if( current == ']'){
                if(s.peek() == null || (char) s.pop() != '['){
                    return false;
                }
            }
        }
        return s.peek() == null ? true : false;
    }

}
