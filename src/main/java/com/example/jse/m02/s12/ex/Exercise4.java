package com.example.jse.m02.s12.ex;

public class Exercise4 {
    public static void main(String[] args) {
        /*
         * TODO: print up to 3 args
         * 
         * ["ciao", "hello"] -> "ciao" "hello"
         * 
         * ["ciao", "hello", "ciao", "hello"] -> "ciao" "hello", "ciao"
    
         */
    
    	switch (args.length) {
    	case 0: 
    		System.out.println("No argument passed.");
    		break;
    	case 1:
    		System.out.println(args[0]);
    		break;
    	case 2:
    		System.out.println(args[0] + ", " + args[1]);
    		break;
    	default:
    		System.out.println(args[0] + ", " + args[1] + ", " + args[2]);
    		break;
    	}
    
    }
    
}
