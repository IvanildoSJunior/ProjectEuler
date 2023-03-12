package com.project_euler;

public class LargestPrimeFactor {

public static long getFirstPrimeFactor(long n1){
    long factor = 2L;
    while(n1 % factor !=0){
        factor++;
    } 
    return factor;
}


    public static void main (String [] args){
        
        
        
        long number = 600851475143L;

        System.out.println(getFirstPrimeFactor(600851475143L));
        long div = 600851475143L / 71;
        System.out.println(div);
        System.out.println(getFirstPrimeFactor(div));

        long div2 = div / 839;
        System.out.println(div2);
        System.out.println(getFirstPrimeFactor(div2));
        
        long div3 = div2 / 1471;
        System.out.println(div3);
        System.out.println(getFirstPrimeFactor(div3));
        

    }
    
}
