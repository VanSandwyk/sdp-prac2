package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static int Task1(int[] a, int[] b) {
    int total = 0; // Initialize accumulator
    for (int index : b) { // Loop through each index in the array b
        if (index >= 0 && index < a.length) { // Check if the index is within range of the array a
            total += a[index]; // Add the corresponding element from a to the total
        }
    }
    return total; // Return the total sum
    }

    //Task 5
    Object obj = // your object to check
    boolean  lstCond = false ;
    if (obj instanceof List) {
        
    List<?> list = (List<?>) obj;
    if (!list.isEmpty() && list.get(0) instanceof Integer) {
        System.out.println("The object is an Integer List");
        cond = true ;
    }

    return cond ;

}
