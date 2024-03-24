package org.example.polymonial;

import java.util.ArrayList;
import java.util.List;

public class Element {
    private String sign;
    private double coefficient;
    private int exponent;

    public Element(String sign, double coefficient, int exponent) {
        this.sign = sign;
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public Element() {
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    @Override
    public String toString() {
        return "Element{" +
                "sign='" + sign + '\'' +
                ", coefficient=" + coefficient +
                ", exponent=" + exponent +
                '}';
    }

    public static List<Element> parseElement(String element) {
        List<Element> elements = new ArrayList<>();
        //String polynomial = "-5x^3 + 9x^6 - 3x + 6x^2 + 8";
        String[] stringElements = element.split(" ");
        for (int i = 0; i < stringElements.length; i++) {
            if (i % 2 == 0) {
                System.out.println(stringElements[i]);
            } else {
                System.out.println(stringElements[i]);
                Element element1 = new Element();
//                -5x^3
                if (stringElements[i].length() == 1) {
                    element1.setSign("stringElements[i].length() == 1"+stringElements[i]);
                    element1.setCoefficient(Double.parseDouble(stringElements[i]));
                }
                elements.add(element1);
            }
        }

        System.out.println(elements);
        return elements;
    }
}
