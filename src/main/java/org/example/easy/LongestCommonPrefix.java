package org.example.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String prefix =strs[0];

        for(int i =1; i <strs.length; i++){
            prefix=returnLongestPrefix(prefix,strs[i]);
            if(prefix.isEmpty()) return "";
        }
        return prefix;
    }

    private String returnLongestPrefix(String actualPrefix, String nextWord){
        int prefixLength = actualPrefix.length();
        char[] charPrefix = actualPrefix.toCharArray();
        char[] charWord = nextWord.toCharArray();

        int newPrefixLength=0;
        int size = Math.min(prefixLength,nextWord.length());
        for(int i=0; i<size; i++){
            if(charPrefix[i] == charWord[i]){
                newPrefixLength=i+1;
            }
            else break;
        }

        return actualPrefix.substring(0,newPrefixLength);
    }

}
