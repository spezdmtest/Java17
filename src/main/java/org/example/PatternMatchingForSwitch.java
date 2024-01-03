package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PatternMatchingForSwitch {
    static void doDemoOne(Object o) {
        switch (o) {
            case String s -> System.out.println("String: " + s);
            case Integer i -> System.out.println("Integer: " + i);
            case Long l -> System.out.println("Long: " + l);
            default -> System.out.println(o);
        }
    }

    static void doDemoTwo(Object o) {
        switch (o) {
            case String s -> System.out.println("String: " + s);
            case Integer i -> System.out.println("Integer: " + i);
            case Long l -> System.out.println("Long: " + l);
            case Scanner scanner -> System.out.println("Scanner: " + scanner);
            default -> System.out.println(o);
        }
    }

    static void doDemoThree() {
        Object o = null;
        switch (o) {
            case null -> System.out.println("Maybe NPE");
            default -> System.out.println(o);
        }
    }

    static void doDemoFour() {
        Object o = "Str";

        switch (o) {
            case String s -> System.out.println("String: " + s);
            case CharSequence cs -> System.out.println("String: " + cs);
            default -> System.out.println("Default: " + o);
        }
    }


}
