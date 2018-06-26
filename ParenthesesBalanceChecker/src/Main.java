import java.util.Stack;

public class Main {

    private static int maxTokens = 0;
    private static char[][] tokens = {{'{','}'}, {'(', ')'}, {'[',']'}};

    private static boolean isBalanced(String expression){

        Stack<Character> stack = new Stack<Character>();
        for(char c : expression.toCharArray()){

            if(!(isOpenTerm(c) || isCloseTerm(c))){
                continue;
            }

            if(isOpenTerm(c)){
                stack.push(c);
                maxTokens = maxTokens < stack.size()? stack.size():maxTokens;

                System.out.println("pushed: "+ c + "  => size: " + stack.size());
            }else if (isCloseTerm(c)){
                char top = stack.pop();
                System.out.println("popped: "+ c + "  => size: " + stack.size());

                if(stack.isEmpty() || !matches(top, c)){
                    return  false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char openTerm, char closeTerm) {
        for(char[] array: tokens){
            if(array[0] == openTerm)
            {
                if(array[1] == closeTerm){
                    return true;
                }
            }
        }
        return  false;
    }

    private static boolean isCloseTerm(char c){
        for(char[] array: tokens){
            if(array[1] == c){
                return true;
            }
        }
        return false;

    }
    private static boolean isOpenTerm(char c) {

        for(char[] array: tokens){
            if(array[0] == c){
                return  true;
            }
        }
        return  false;

    }

    public static void main(String[] args) {
	// write your code here

        String expression = "2 + 3 * (100 / 3 + (111 + 2) * [ 120 + { 100 + 1) + {20 + 1 * [20 * 10 + 1] } + 10} + ) + 1)";

        System.out.println("Expression balanced? " + isBalanced(expression));
        System.out.println("Max Tokens: " + maxTokens);
    }
}
