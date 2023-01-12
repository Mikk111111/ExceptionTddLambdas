package org.lamda;

public class MainLamba {
    public static void main(String[] args) {
        MyErrorMessage errorMessage1 = new MyErrorMessage() {
            @Override
            public void show(String message, int number) {
                System.out.println(message+" | "+number);
            }
        };
        errorMessage1.show("LOL ",4);
        MyErrorMessage errorMessage2 = (message, number) -> System.out.println(message+" | "+number);
        errorMessage2.show("YOLO",8);
        Addable addable = (a,b) -> {return a+b;};
        System.out.println(addable.doMathAdd(3,5));
        addable = (a,b) -> {return a-b;};
        addable = Integer::sum;
        System.out.println(addable.doMathAdd(3,5));
    }
}
