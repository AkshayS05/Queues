import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    private static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
    if(input.isEmpty()){
        return;
    }
    while(!input.isEmpty()){
        int element= input.pop();
        extra.push(element);
    }
    while(!extra.isEmpty()){
        System.out.print(extra.pop()+" ");
    }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Stack<Integer> input= new Stack<>();
        input.push(-90);
        input.push(9);
        input.push(20);
        input.push(14);
        input.push(6);
        input.push(10);
        input.push(50);
        Stack<Integer> extra = new Stack<>();
        reverseStack(input,extra);
    }

}
