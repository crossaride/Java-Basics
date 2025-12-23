
package javabasic;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//These are built-in, value types
public class PrimitiveDataTypes {
    
    /** Numeric primitives **/
    
    //Integers
    private byte  Raw_Binary_data;         // -128 to 127
    private short Compact_Structured_data; // -32768 to 32767
    private int   General_purpose_data;    // -2,147,483,648 to 2,147,483,647
    private long  Large_Integers;          // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    
    
    //Floating-point
    private float Memory_Efficient_decimals; // ~7 digits
    private double Default_Math_decimals;    // ~15 digits
    
    
    /** Non-numeric primitives **/
    
    private char Characters; //Single UTF-16 character
    private boolean Logical_States; 

    
    
    /**** Getter & Setter *****/
    
    public byte getRaw_Binary_data() {
        return Raw_Binary_data;
    }

    public void setRaw_Binary_data(byte New_Raw_Binary_data) {
        this.Raw_Binary_data = New_Raw_Binary_data;
    }

    public short getCompact_Structured_data() {
        return Compact_Structured_data;
    }

    public void setCompact_Structured_data(short New_Compact_Structured_data) {
        this.Compact_Structured_data = New_Compact_Structured_data;
    }

    public int getGeneral_purpose_data() {
        return General_purpose_data;
    }

    public void setGeneral_purpose_data(int New_General_purpose_data) {
        this.General_purpose_data = New_General_purpose_data;
    }

    public long getLarge_Integers() {
        return Large_Integers;
    }

    public void setLarge_Integers(long New_Large_Integers) {
        this.Large_Integers = New_Large_Integers;
    }

    public float getMemory_Efficient_decimals() {
        return Memory_Efficient_decimals;
    }

    public void setMemory_Efficient_decimals(float New_Memory_Efficient_decimals) {
        this.Memory_Efficient_decimals = New_Memory_Efficient_decimals;
    }

    public double getDefault_Math_decimals() {
        return Default_Math_decimals;
    }

    public void setDefault_Math_decimals(double New_Default_Math_decimals) {
        this.Default_Math_decimals = New_Default_Math_decimals;
    }

    public char getCharacters() {
        return Characters;
    }

    public void setCharacters(char New_Characters) {
        this.Characters = New_Characters;
    }

    public boolean isLogical_States() {
        return Logical_States;
    }

    public void setLogical_States(boolean New_Logical_States) {
        this.Logical_States = New_Logical_States;
    }
    
    
    
}
