package com.danielberryman;

public class Main {

    public static void main(String[] args) {
        // 1 character with width 16 bits
        // can hold unicode characters
        char myChar = 'd';
        char myUniChar = '\u00A9';
        System.out.println("Character is " + myUniChar);

        boolean myBool = true;
        System.out.println(myBool);

        // Challenge
        char myRegistered = '\u00AE';
        System.out.println("Registered symbol: " + myRegistered);
    }
}
