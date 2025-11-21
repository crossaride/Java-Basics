package com.example.Java_Basics.model;

public class Level1 {

    //Check Odd/Even number
    public void checkEvenNumbers(int input) {
        //Check remainder 
        if (input % 2 == 0) {
            System.out.println(input + " is an even number.");
        } else {
            System.out.println(input + " is an odd number.");
        }
    }
    
    //Reverse output of a String
    public void reverseStringOutput(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt((input.length()-1)-i);
            result += String.valueOf(temp);
        }
        System.out.println("The reversed String is: " + result + ".");
    }
    
    //Find Sum
    public void sumOfDigits(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            int x = Integer.parseInt(String.valueOf(temp));
            sum += x;
        }   
        System.out.println("The sum of digits are: " + sum + ".");
    }
      
    /*
    public void sumOfDigits(String input) {

        //Convert String into IntStream of chars
        IntStream convertToChars = input.chars();
        
        //Bottom is the same way, more traditional. 
        //The top is a shortcut for writing a lambda that just calls an existing method
        IntStream digitsOnly = convertToChars.filter(Character::isDigit);
      //IntStream digitsOnly = convertToChars.filter(ch -> Character.isDigit(ch));

        IntStream numericValues = digitsOnly.map(Character::getNumericValue);

        int sum = numericValues.sum();

        System.out.println("The sum of digits are: " + sum + ".");
    } */

    
    //Count Vowels in a String
    public void countVowels(String input) {
        String VOWELS = "aeiouAEIOU";
        int count     = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            
            if(VOWELS.contains(String.valueOf(temp))){
                count += 1;
            }
        }
        System.out.println("The number of vowels are: " + count + ".");
    }
    
    //String indexing, bounds check
    public String findIndexBoundChar(String input, int position) {
        
        if (input.length() - 1 < position){
            System.err.println("Error: Index out of range! Must be between 0 and " + (input.length() - 1) + ".");
            return null;
        }
        char result = input.charAt(position);
        
        if(result == ' '){
            return ("The char in index " + position + " of '" + input +"' is a whitespace." );
        }else{
            return ("The char in index " + position + " of '" + input +"' is " + String.valueOf(result));
        }
    }

}
