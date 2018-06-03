package src.easy;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String intToString = String.valueOf(x);
        Stack<Character> palinStack = new Stack<Character>();
        
        for (char c : intToString.toCharArray()) {
            palinStack.push(c);
        }
        
        StringBuilder poppedString = new StringBuilder();
        
        while (!palinStack.isEmpty()) {
            poppedString.append(palinStack.pop().toString());
        }
        
        return poppedString.toString().equals(intToString);
    }
    
    public boolean isPalindromeNoString(int x) {
        if (x < 0) {
            return false;
        }
        
        ArrayDeque<Integer> palinStack = new ArrayDeque<Integer>();
        ArrayDeque<Integer> palinQueue = new ArrayDeque<Integer>();
        
        int copy1 = x;
        
        while (copy1 > 9) {
            int rightmost = copy1 % 10;
            palinStack.push(rightmost);
            palinQueue.add(rightmost);
            copy1 /= 10;
        }
        
        palinStack.push(copy1);
        palinQueue.add(copy1);
        
        while (!palinStack.isEmpty()) {
            if (palinStack.pop() != palinQueue.remove()) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main (String args[]) {
        PalindromeNumber testObj = new PalindromeNumber();
        System.out.println(testObj.isPalindrome(123321));
        System.out.println(testObj.isPalindromeNoString(123321));
    }
}
