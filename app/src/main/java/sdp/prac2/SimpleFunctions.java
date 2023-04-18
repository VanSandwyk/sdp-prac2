package sdp.prac2;

import java.util.*;


public class SimpleFunctions {
    public SimpleFunctions() {}
    //Author: Jacobus van Sandwyk
    //Begin
    public static int Task1(List<Integer> a, List<Integer> b) {
        int total = 0; // Initialize accumulator
        for (int index : b) { // Loop through each index in the List b
            if (index >= 0 && index < a.size()) { // Check if the index is within range of the List a
                total += a.get(index); // Add the corresponding element from a to the total
            }
        }
        return total; // Return the total sum
    }
    //End

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

   ///////////////////////////////// Task 5 //////////////////////////////////////////////// 
   public static boolean task5(Object a) { //accept any pbject type
    if (a instanceof List) { // check if object is an instance of a list
        List<?> list = (List<?>) a; // make a new list equal to the  parameter a
        if (!list.isEmpty() && list.get(0) instanceof Integer) { // check if the list is not empty and atleast contains an integer
            return true; // return true
        }
    }
    return false; // return false
}
///////////////////////////////// Task 5 end //////////////////////////////////////////////// 


    
    public static List<Integer> Task6(List<Integer> a) { 
        List<Integer> output = new ArrayList<Integer>();
        for (Integer num : a)  //loop around each number in the list
           if(num % 100 == 0){ //check if it is a multiple of 100
             output.add(num);
           }else {
            int rouded =((num /100) + 1) * 100 ; //if not multiple of 100 round up to next highest multiple of 100
            output.add(rouded);
           }
        return output;
    } //task 6

////////// Tests for task 6///////////////////////////////////////////////////////////////////////////

public void task6Test1() {
    // Arrange cretate 2 lists
    List<Integer> inLst = Arrays.asList(100, 201, 310, 400, 590);
    List<Integer> expectedOutLst = Arrays.asList(100, 300, 400, 400, 600);

    // Act
    List<Integer> outputList = Task6(inLst);

    // Assert
    assertEquals(expectedOutLst, outputList);
}

public void task6Test2() {
    // Arrange
    List<Integer> inLst = Arrays.asList(100, 201, 310, 400, 590);
    List<Integer> expectedOutLst = Arrays.asList(100, 300, 400, 400, 600);

    // Act
    List<Integer> outputList = task6FunctionName(inLst);

    // Assert
    if (!expectedOutLst.equals(outputList)) {
         System.out.println("Error");
    }
}
////////// Tests for task 6 end///////////////////////////////////////////////////////////////////////////
}
