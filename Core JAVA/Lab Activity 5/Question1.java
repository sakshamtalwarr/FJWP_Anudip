// 1. Write a Java program that demonstrates various operations on a 3D array: 

//       -> 1. Initializing the 3D array with random values. 

//       -> 2. Finding the maximum value in the array.  

//       -> 3. Calculating the average of all elements. 

//       -> 4. Displaying the array. 

import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        int depth = 3, rows = 3, cols = 3;
        int[][][] array = new int[depth][rows][cols];

        Random random = new Random();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int totalElements = depth * rows * cols;

        System.out.println("3D Array:");
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    array[i][j][k] = random.nextInt(100) + 1;
                    sum += array[i][j][k];
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                    }
                }
            }
        }

        double average = (double) sum / totalElements;

        for (int i = 0; i < depth; i++) {
            System.out.println("Depth " + (i + 1) + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Average of all elements: " + average);
    }
}
