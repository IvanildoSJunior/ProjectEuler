package com.project_euler;

public class LargestPrimeFactor {

public static long getFirstPrimeFactor(long n1){
    long factor = 2L;
    while(n1 % factor !=0){
        factor++;
    } 
    return factor;
}

public static long getLargestPrimeFactor(long number){
    long div = number / getFirstPrimeFactor(number);
    while (div != getFirstPrimeFactor(div)){
        long div2 = div / getFirstPrimeFactor(div);
        div = div2;
    }
    return div;
}
    
    public static void main (String [] args){
        
        System.out.println(getLargestPrimeFactor(600851475143L));

    }
    
}
