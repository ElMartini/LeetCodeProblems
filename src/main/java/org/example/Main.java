package org.example;


import org.example.easy.LongestCommonPrefix;


public class Main {
    public static void main(String[] args) {


        String [] strings = {"flower","flow","flight"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println("Longest prefix:\""+longestCommonPrefix.longestCommonPrefix(strings)+"\"");
    }
}