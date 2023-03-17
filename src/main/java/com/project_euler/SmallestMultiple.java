package com.project_euler;

public class SmallestMultiple {

    public static int mdc(int num, int num2){

        while(true){
        if (num == num2){
            return num;
        }
        if(num2 > num){
            int aux = num;
            num = num2;
            num2 = aux;
        }
        else{
        int aux = num;
        num = num2;
        num2 = aux - num2;
            }
        }
    }
    
}
