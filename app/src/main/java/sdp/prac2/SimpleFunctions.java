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

    // Author: JuneGemini13
    // StudentId: G21F7853
    // Additon: Method Task2, which removes the first character from
    // every element in a list. If an element has no characters, remove it from
    // the output.

    public static String[] task2(String[] inputArray) {
        // create a new array for the output, with the same length as the input array
        String[] outputArray = new String[inputArray.length];
        // initialize an output index counter
        int outputIndex = 0;
        
        // iterate over each element in the input array
        for (String s : inputArray) {
            // check if the element has more than one character
            if (s.length() > 1) {
                // add a new string to the output array with the first character removed
                outputArray[outputIndex++] = s.substring(1);
            }
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
    return output; // Return the multiple of the first element of a by the last of b
    }//Task4
    
    public static List<Integer> Task6(List<Integer> a) { 
        List<Integer> output = new ArrayList<Integer>();
        for (Integer num : a)  //loop around each number in the list
           if(num % 100 == 0){ //check if it is a multiple of 100
             output.add(num)
           }else {
            int rouded =((num /100) + 1) * 100  //if not multiple of 100 round up to next highest multiple of 100
            output.add(rouded)
           }
        return output
    } //task 6
}
