package com.company;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<String> printPrintResult = s -> System.out.println("result: " + s);
        printPrintResult.accept("10.0");
        printWithPrefixAndPostfix("Result:   ", "Great!  ").accept("10.0  ");


    }

    public static Consumer<String> printWithPrefixAndPostfix(String prefix, String postfix) {
        return (s) -> {
            System.out.println(prefix + s + postfix);

        };


    }

}