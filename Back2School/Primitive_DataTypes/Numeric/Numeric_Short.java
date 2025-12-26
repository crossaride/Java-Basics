
package javabasic;

public class Numeric_Short {
    
    public void shortExamples(){
        
        short integer1 = 100;
        short integer2 = 200;
        short integer3 = (short)(integer1 + integer2);
        Short object1  = Short.valueOf(integer1);
        Short object2  = Short.valueOf(integer2);
        
        // Comparing primitive shorts
        int result1 = Short.compare(integer2, integer1);
        System.out.println("Compare methods return whether the first argument is "
                            + "less than, equal to, or greater than the second argument: " 
                            + result1);
        
        // Comparing Short objects
        int result2 = object1.compareTo(object2); 
        System.out.println("100.compareTo(200) is: " + result2);
        
        // Equality comparison
        Short object3 = Short.valueOf((short) 1);
        System.out.println("s1.equals(s3): " + object1.equals(object3));
        
        // May be true due to caching:
        System.out.println("s1 == s3: " + (object2 == object3)); // == compares object references, not values. 
        
        String example = "2";
        Short object4 = Short.valueOf(Short.parseShort(example));
        System.out.println("The result is: " + object4 + " , " + integer3);
    }

}
