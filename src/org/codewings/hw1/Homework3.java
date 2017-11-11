package org.codewings.hw1;

import java.util.*;
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i;

        for (i=1; i<=N; i++){
            if(i*i<=N) System.out.println(i*i);
        }
    }
}
