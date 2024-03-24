package org.example;

import org.example.polymonial.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.example.polymonial.Element.parseElement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//        Function<Integer, Integer> square = initFilter();
//        Function<Integer, Integer> half = firstFilter();
//        Function<Integer, String> toString = finalFilter();
//        Function<Integer, String> pipeline = square //init
//                .andThen(half) //first step
//                .andThen(toString); // second
//        String result = pipeline.apply(5);
//        System.out.println(result);
//    }
//
//    private static Function<Integer, String> finalFilter() {
//        return Object::toString;
//    }
//
//    private static Function<Integer, Integer> firstFilter() {
//        return s -> s / 2;
//    }
//
//    private static Function<Integer, Integer> initFilter() {
//        return s -> s * s;
//    }
    public static void main(String[] args) {
        final String polynomial = "-5x^3 + 9x^6 - 3x + 6x^2 + 8";
        Function<Integer, List<Element>> init = processParse(polynomial);
        init.apply(10);
    }

    private static Function<Integer, List<Element>> processParse(String polynomial) {
        return e -> parseElement(polynomial);
    }
}