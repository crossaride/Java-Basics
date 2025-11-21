
package com.example.Java_Basics.model;

import java.util.Arrays;


public class Level2 {
    
    //Find largest value in array;
    public int findMax(int[] input){
        
        int result = 0;
        
        for (int i = 0; i < input.length - 1; i++){
            if (input[i] < input[i + 1]){       
                result = input[i + 1];
            }
        }
        return result;
    }
    
    //Print only Even number from array
    public void extractEvenNumber(int[] input){
        
        System.out.printf("Even number: ");
        
        for (int i = 0; i < input.length; i++){
            if(input[i] % 2 == 0){
                System.out.print(input[i] + " ");
            }
        }
        System.out.printf("\n");
    }
    
    //Print reversed elements
    public void reverseElement(int[] input){
        
        int temp = 0;
        
        for (int i = 0; i < input.length / 2; i++){
            temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println("The reversed Array: " + Arrays.toString(input));   
    }
    
    //Bubble sort array
    public void bubbleSortArray(int[] input){
        for (int i = input.length-1; i > 0; i--){
            for (int j = 0; j < i; j++){             
                if(input[j] > input[j + 1]){
                     int temp = input[j];
                     input[j] = input[j+1];
                     input[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(input));
    }
    
    //Linear search in array
    public String linearSearch(int[] arr, int input) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                return "Found";
            }
        }
        return "Not found";
    }
}
