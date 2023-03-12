package com.project_euler;

public class Fibonacci {

    public static void main (String [] args){

        int n1 = 1;
        int n2 = 2;
        int sum = 2;
        while(n2 < 4000000 ){
            int n3 = n1 + n2;
            if (n3 % 2 ==0){
                sum += n3;
            }
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sum);
    }
    
}
