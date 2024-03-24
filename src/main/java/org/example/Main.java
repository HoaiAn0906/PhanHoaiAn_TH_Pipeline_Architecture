package org.example;

import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> square = initFilter();
        Function<Integer, Integer> half = firstFilter();
        Function<Integer, String> toString = finalFilter();
        Function<Integer, String> pipeline = square //init
                .andThen(half) //first step
                .andThen(toString); // second
        String result = pipeline.apply(5);
        System.out.println(result);
    }

    private static Function<Integer, String> finalFilter() {
        return Object::toString;
    }

    private static Function<Integer, Integer> firstFilter() {
        return s -> s / 2;
    }

    private static Function<Integer, Integer> initFilter() {
        return s -> s * s;
    }
}