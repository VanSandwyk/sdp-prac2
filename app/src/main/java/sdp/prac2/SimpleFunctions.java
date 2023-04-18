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
    
   public static boolean task5(Object a) {
    if (a instanceof List) {
        List<?> list = (List<?>) a;
        if (!list.isEmpty() && list.get(0) instanceof Integer) {
            return true;
        }
    }
    return false;
}

////////// Tests for task 6///////////////////////////////////////////////////////////////////////////

public void task6Test1() {
    // Arrange
    List<Integer> inLst = Arrays.asList(100, 201, 310, 400, 590);
    List<Integer> expectedOutLst = Arrays.asList(100, 300, 400, 400, 600);

    // Act
    List<Integer> outputList = task6FunctionName(inLst);

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





}
