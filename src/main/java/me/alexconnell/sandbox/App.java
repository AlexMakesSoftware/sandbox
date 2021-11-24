package me.alexconnell.sandbox;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, whats your name?");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Hi there " + str);
    }
}
