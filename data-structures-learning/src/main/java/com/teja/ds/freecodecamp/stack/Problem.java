package com.teja.ds.freecodecamp.stack;

public class Problem {

    private static char leftCircle = '(';
    private static char rightCircle = ')';
    private static char leftParanth = '{';
    private static char rightParanth = '}';
    private static char leftSquare = '[';
    private static char rightSquare = ']';

    public static void main(String[] args) {
        String str = "({}[])";

        boolean isValid = isValidParanthesis(str);
        System.out.println(isValid);
    }

    private static boolean isValidParanthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(isLeftBracket(ch)){
                stack.push(ch);
            }else{
                char reverseBracket = getReverseBracket(ch);
                Character pop = stack.pop();
                if(pop!=reverseBracket){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isLeftBracket(char ch){
        return (ch == leftCircle || ch == leftSquare || ch == leftParanth);
    }

    private static char getReverseBracket(char ch) throws RuntimeException {
        if(ch == rightCircle){
            return leftCircle;
        }
        if(ch == rightParanth){
            return leftParanth;
        }
        if(ch == rightSquare){
            return leftSquare;
        }
        throw new RuntimeException();
    }
}
