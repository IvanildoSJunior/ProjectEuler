package com.project_euler;
public class LargestPalindromeProduct {
    
    public static boolean isPalindrome(int num){
        
        String numString = Integer.toString(num);
        String invString = new StringBuilder(numString).reverse().toString();

        if (numString.equals(invString)){
            return true;
        }

        return false;
    }

    public static int calcLargestPalindrome(){
        int maxPalin = 0;
        for(int num1 = 100;num1 <1000; num1++){
            for(int num2 = 100; num2 <1000; num2++){
                int result = num1 * num2;
                if(isPalindrome(result) && result > maxPalin){
                    maxPalin = result;
                }
            }
        }
        return maxPalin;
    }

    public static void main(String [] args){

        System.out.println(calcLargestPalindrome());



    }
}


