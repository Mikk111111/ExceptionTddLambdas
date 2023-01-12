package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {


    private static int insertDigit(String numberContinuities){
        Scanner sc = new Scanner(System.in);
        int input =0;
        boolean isInputOK = false;
        do{
            try{
                System.out.println("Enter "+numberContinuities+" number:");
                input=sc.nextInt();
                isInputOK=true;
            }catch (InputMismatchException e){
                System.out.println("Error "+e);
            }catch (Exception e){
                System.out.println("Error");
            }finally {
                sc.nextLine();
            }
        }while(!isInputOK);
        return input;
    }

    public static String[] askForInput(){
        Integer num1 = insertDigit("First");
        int num2 = insertDigit("Second");
        return new String[]{num1.toString(), String.valueOf(num2)};
    }
}
