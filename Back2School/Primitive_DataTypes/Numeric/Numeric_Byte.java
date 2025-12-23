
package javabasic;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Numeric_Byte extends PrimitiveDataTypes{
    
    byte min = -128;
    byte max = 127;
    
    public Numeric_Byte(){
        super();
    }
    
    /** Byte Usage **/
    
    // Memory-constrained counters
    public void TypeCasting(){ // Used when range is known (−128 to 127).
        byte one = 1;
        super.setRaw_Binary_data(one);
        
        //Overflow
        byte addition = (byte)(super.getRaw_Binary_data() + max); // 128 + 1
    }
    
    
    // Compact state machines / Low-memory structures
    public void StateMachine(){ // To replace scenarios where multiple booleans are needed, to store many small values efficiently.
        byte state = 0; // Ex. (0=INIT, 1=RUNNING, 2=DONE)
        
        byte[] state2 = new byte[1_000_000];
        state2[0] = 1;
        // then define to up state[1,000,000]...
    }
    
    
    // Protocol fields / headers / Control codes
    public void BinaryProtocol(){ // Used fixed-size fields in network packets, device protocols, custom TCP/UDP formats
        
        // Declare information
        /** 
         * Fixed-size binary messages where each byte has a defined meaning
        **/
        byte version = 1;       // Protocol version
        byte messageType = 3;   // Message type (Ex. Text)
        byte statusCode = 0x7F; // Flags / results
        
        // Store them to be sent to another (receiver) side.
        byte[] packet = new byte[]{
            version,
            messageType,
            statusCode
        };
        
        // Now packet is stored with binary protocols, the receiver is now able read them by position in the same order to assign meaning.
        /** 
         * byte version     = packet[0]; 
         * byte messageType = packet[1]; 
         * byte statusCode  = packet[2]; 
        **/
    }
    
    // Reading from streams (single byte)
    public void FileIO(){ //Process one byte at a time, not a buffer.
        try{
            InputStream FileInput = new FileInputStream("/path");
            int found;
            
            //File format parsing
            while ((found = FileInput.read()) != -1) {
                byte value = (byte) found;
                System.out.println(value);
                
                if (value != (byte) 0x89) {
                    throw new IOException("Not a PNG file");
                }
            }         
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    // Same as File I/O, process one byte at a time.
    public void ImageProcess(){
        /** 
         * Libraries like BufferedImage use DataBufferByte to store pixel data in byte arrays.
         * Most image formats (ex: PNG, JPEG) use unsigned 8-bit color values (0 to 255).
        **/
        
        // To interpret a signed byte as unsigned, mask with 0xFF to convert to int
        byte pixelByte = (byte) 0xFF; // Represents 255 (unsigned).
        int unsignedPixel = pixelByte & 0xFF; // Convert to unsigned int: 255.
            
        
        // Accessing Pixel data in a BufferedImage
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_BYTE_GRAY);
        byte[] pixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
    }
    
    
    // Flags or Bit masks
    public void FlagsANDMasks(){
        /** 
         * Use on multiple (true/false) scenario but want to store them efficiently,
         * so instead of using 8 separate boolean variables, store 8 flags in 1 byte (1 bit per flag).
        **/
        byte flags = 0b0101_0010; //Bit starts from 0 to 7
        boolean enabled = (flags & 0b0001_0000) != 0; //Selects bit 4 from byte and CHECK the bit
        
        /**
         * Flags & Mask → bitwise AND, keeps only the bits that are 1 in both.
         * Flags: 0 1 0 1 0 0 1 0 
         * Mask : 0 0 0 1 0 0 0 0 
         * AND result: 0 0 0 1 0 0 0 0 
         * '!= 0' → converts it to true if the bit was 1, false if it was 0.
        **/
        
        System.out.println(enabled); //TRUE because bit 4 in 01010010 is 1.
        
        // Turn on bit 3
        flags |= 0b0000_1000; 
        //Turn off bit 3
        flags &= ~0b0000_1000; 
        
        // Check if bit 3 is turned on.
        boolean bit3Enabled = (flags & 0b0000_1000) != 0;
        System.out.println(bit3Enabled);
    }

}
