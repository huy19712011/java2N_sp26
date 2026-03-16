package com.mycompany.java2n_sp26.lambda;

public class LambdaDemo {

    public static void show() {

        greet((String msg) -> {
            System.out.println(msg);
        });
    }

    public static void greet(Printer printer) {

        printer.print("Hello Lambda Expression");
    }
}
