package org.example;

import org.example.easy.ValidParentheses;


public class Main {
    public static void main(String[] args) {


        String string = "([)]";
        ValidParentheses validParentheses = new ValidParentheses();

        System.out.println(validParentheses.isValid(string));
    }
}