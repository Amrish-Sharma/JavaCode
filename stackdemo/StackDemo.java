package stackdemo;

import java.util.Stack;

public class StackDemo {

    static Stack<String> tmpStack= new Stack<String>();
    static Stack<String> res= new Stack<String>();

    public static void main(String args[]) {
        Stack<String> std1 = new Stack<String>(); 
        Stack<String> std2 = new Stack<String>(); 

        std1.push("Daniel");
        std2.push("Marina");

        std1.push("Roan");
        std1.push("Johnathon");

        std2.push("Clona");
        std2.push("Rev");
        System.out.println("First Stack"+std1);
        System.out.println("Second Stack"+std2);
        System.out.println("Sorted & Merged Stack"+createSortedStack(std1,std2));}
    static Stack createSortedStack(Stack<String> std1, Stack<String> std2) {

         while (std1.size() != 0) { 
            res.push(std1.peek()); 
            std1.pop(); 
        } 
          
        while (std2.size() != 0) { 
            res.push(std2.peek()); 
            std2.pop(); 
        } 

        // Sort the result stack. 
       return sortStack(res);
}
    static Stack sortStack(Stack<String> input){

        while (input.size() != 0)  
        { 
            String tmp = input.peek(); 
                        // pop out the first element 
            input.pop(); 
            // while temporary stack is not empty and 
            // top of stack is greater than temp 
            while (tmpStack.size() != 0 && tmpStack.peek().compareTo(tmp)>0) 
            { 
                // pop from temporary stack and push 
                // it to the input stack 
                input.push(tmpStack.peek()); 
                tmpStack.pop(); 
            } 
            // push temp in tempory of stack 
            tmpStack.push(tmp); 
        } 
      return tmpStack;  
    }
}