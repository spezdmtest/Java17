package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        PatternMatchingForSwitch.doDemoOne(1L);
        PatternMatchingForSwitch.doDemoOne("Hello, World!");
        PatternMatchingForSwitch.doDemoOne(new Object());
        PatternMatchingForSwitch.doDemoTwo(new Scanner(System.in));
        PatternMatchingForSwitch.doDemoThree();
        PatternMatchingForSwitch.doDemoFour();
    }
}
