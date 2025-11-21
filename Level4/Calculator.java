
package com.example.Java_Basics.model.Level4;

public class Calculator {
    
    private double number;

    public Calculator(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double newNumber) {
        this.number = newNumber;
    }
    
    public double add(double input){
        setNumber(input + getNumber());
        return getNumber();
    }
    
    public double substract(double input){
        setNumber(getNumber() - input);
        return getNumber();
    }
    
    public double multiply(double input){
        setNumber(input * getNumber());
        return getNumber();
    }
    
    public double divide(double input){
        setNumber(getNumber() / input);
        return getNumber();
    }
    
    public void callApp(int input, double number){
        
        double temp = 0;
        
        switch(input){
            case 1:
                temp = add(number);
                break;
            case 2:
                temp = substract(number);

                break;
            case 3:
                temp = multiply(number);
                break;
            case 4:
                temp = divide(number);
                break;
        }   
        
        System.out.println("Output: " + temp);
    }
}
