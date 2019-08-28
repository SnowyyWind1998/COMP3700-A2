/**
 * Zeyu Wang
 * zzw0044@auburn.edu
 * Comp 3700 assignment 2
 * Finder
 * Create a class called Finder with two function: findMax(int[] intArray). Thosefunctions return the max
 * or min input array. They would also return null in case the array in null or empty.
 */
public class Finder {
    public Finder() {
        System.out.println("Running...");
    }

    public Integer findMax(int[] intArray) {
        if(intArray == null) {
            System.out.println("Return null since the array is empty.");
            return null;
        }

        else if(intArray.length == 0) {
            System.out.println("Return null since the array is null.");
            return null;
        }

        int max = intArray[0];

        for(int i = 0;i < intArray.length;i++ ) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println("Max is "+ max + ". Return the max.");
        return max;
    }

    public Integer findMin(int[] intArray) {
        if (intArray == null) {
            System.out.println("Return null since the array is empty.");
            return null;
        } else if (intArray.length == 0) {
            System.out.println("Return null since the array is null.");
            return null;
        } else {
            int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
            }
        }
            System.out.println("Min is "+ min +". Return the min.");
            return min;
    }
    }
}
