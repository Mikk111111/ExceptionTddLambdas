package org.example;

public class IntDivider {
    public static int divide(String[] numbers) throws ArgumentIsZeroException{
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);
        if(num1==0&&num2==0){
            throw new ArgumentIsZeroException("All");
        }
        else if(num1==0){
            throw new ArgumentIsZeroException("First");
        }
        else if(num2==0){
            throw new ArgumentIsZeroException("Second");
        }

        return num1/num2;
    }
}
