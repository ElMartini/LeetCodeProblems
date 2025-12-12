package org.example.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if (x<10) return true;

        int y=x;
        int reverse=0;
        while (x!=0){
            int tmp=x%10;
            reverse= reverse*10+tmp;
            x/=10;

        }
        return y == reverse;

    }
}
