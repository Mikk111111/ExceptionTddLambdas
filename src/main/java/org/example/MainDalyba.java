package org.example;

public class MainDalyba {
    public static void main(String[] args) {
        String[] arr = InputManager.askForInput();
        try {
            System.out.println(IntDivider.divide(arr));
        } catch (ArgumentIsZeroException e) {
            System.out.println(e);
        }
    }
}