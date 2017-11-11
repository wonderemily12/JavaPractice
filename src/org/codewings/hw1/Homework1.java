package org.codewings.hw1;

import java.util.*;
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        System.out.println("Addition: "+(N+M));
        System.out.println("Subtraction: "+(N-M));
        System.out.println("Multiplication: "+N*M);
        System.out.println("Division Quotient: "+N/M);
        System.out.println("Division Remainder: "+N%M);

    }
}
