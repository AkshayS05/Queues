import java.util.Stack;

public class CheckRedundantBrackets {
    private static boolean checkRedundant(String str) {
        if(str.isEmpty()){
            return false;
        }
        //stack in which everything except closing bracket will be pushed
        Stack<Character> stack= new Stack<>();
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) != ')') {
                stack.push(str.charAt(i));
            } else {
                char ch = stack.pop();
                while (ch != '(') {
                    count++;
                    ch = stack.pop();
                }
                if (count<= 1) {
                    return true;
                }
            }
                count = 0;
            }

        return false;
    }
    public static void main(String[] args) {
        String str= "a+(b+d)+c";
        System.out.println(checkRedundant(str));
    }


}
