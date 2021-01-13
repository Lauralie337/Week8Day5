package com.company;

public class AsciiChars {

        // start of step 2
    public static void printNumbers() {
        // TODO: print valid numeric input
        System.out.println("Valid numeric inputs: ");
        for(int i=48; i < 58; i++) {
            System.out.print((char)i);
        }
        System.out.println();
    }

    public static void printLowerCase() {
        //TODO: print valid lowercase alphabetic inout
        System.out.println("Valid lowercase alphabetic inputs: ");
        for(int i=97; i < 123; i++) {
            System.out.print((char)i);
        }
        System.out.println();
    }

    public static void printUpperCase() {
        //TODO: print valid uppercase alphabetic input
        System.out.println("Valid uppercase alphabetic inputs: ");
        for(int i=65; i < 91; i++) {
            System.out.print((char)i);
        }
        System.out.println();
    }
        // end of step 2

}
