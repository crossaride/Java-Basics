
package com.example.Java_Basics.model;

import java.util.ArrayList;

public class Level3 {
    
    //Prime Number Checker
    public boolean isPrime(int input){
        if(input <= 1){
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(input); i++){
            if (input % i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    //Factorial Method
    public void factorial(int input){
        
        if (input < 0) {
            System.err.println("Negative number is not allowed.");
        }else {
            int result = 1;

            for (int i = 1; i <= input; i++) {
                result *= i;
            }
            System.out.println(input + "! is " + result);
        }
    }
    
    //Longest Word Finder
    public void longestWord(String input){
        
        String[] words = input.trim().split(" ");
        String temp = "";
        
        for(int i = 0; i < words.length - 1; i++){
            if(words[i].length() > temp.length()){
                temp = words[i];
            }
        }
        System.out.println("The longest word is: " + temp);
    }
    
    //Filter even numbers and return it
    public void arrayEvenNumbers(int[] input){
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < input.length; i++){
            if (input[i] % 2 == 0) {
                result.add(input[i]);
            }
        }
        System.out.println("Even Number array: " + result.toString());
    }
    
    //Check character frequency
    public void charFrequency(String input, char word){
        int result = 0;
        
        for (int i = 0; i < input.length(); i++){
            if(input.charAt(i) == word){
                result += 1;
            }
        }
        System.out.println("'" + word +"' appeared " + result + " times in '" + input + "'.");
    }
}
