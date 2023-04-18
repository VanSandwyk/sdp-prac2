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
        
        // create a new array with only the elements that were added to the output array
        return Arrays.copyOf(outputArray, outputIndex);
    }

    public static List<Integer> Task4(List<Integer> a, List<Integer> b){
    //If lists are different sizes, return null
    if (a.size() != b.size()){
        return null; 
    }
    List<Integer> output = new ArrayList<Integer>();
    int size = a.size();
    for(int i = 0; i < size; i++){
        output.add(a.get(i) * b.get(size - i -1));
    }
}
