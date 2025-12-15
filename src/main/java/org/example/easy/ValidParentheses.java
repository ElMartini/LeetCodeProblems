package org.example.easy;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        if (s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();

        char[] sChar = s.toCharArray();
        for (char c : sChar) {

            if (stack.empty()) stack.push(c);
            else {
                switch (c) {
                    case '}': {
                        if (stack.lastElement().equals('{')) stack.pop();
                        else stack.push(c);
                        break;
                    }
                    case ']': {
                        if (stack.lastElement().equals('[')) stack.pop();
                        else stack.push(c);
                        break;
                    }
                    case ')': {
                        if (stack.lastElement().equals('(')) stack.pop();
                        else stack.push(c);
                        break;
                    }
                    default:
                        stack.push(c);
                }
            }
        }

        return stack.empty();
    }

}