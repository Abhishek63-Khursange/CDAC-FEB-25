// Q10

/*

import java.util.HashSet;
import java.util.Scanner;

public class Q10IntersectionUnion {

    // Function to find union of two arrays
    public static void findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> union = new HashSet<>();

        for (int num : arr1) union.add(num);
        for (int num : arr2) union.add(num);

        System.out.print("Union: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Function to find intersection of two arrays
    public static void findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Intersection: ");
        for (int num : arr1) set.add(num);

        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                set.remove(num);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) arr1[i] = scanner.nextInt();

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) arr2[i] = scanner.nextInt();

        // Find union and intersection
        findUnion(arr1, arr2);
        findIntersection(arr1, arr2);

        scanner.close();
    }
}


//Q11

import java.util.Scanner;

public class Q11SubarraySum {

    public static void findSubarray(int[] arr, int target) {
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray with given sum found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        // Target sum
        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        findSubarray(arr, target);

        scanner.close();
    }
}

//Q12

import java.util.Scanner;

public class Q12ArrayCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[20];
        int even = 0, odd = 0, multipleOfThree = 0;

        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) even++;
            else odd++;
            if (arr[i] % 3 == 0) multipleOfThree++;
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        System.out.println("Multiples of 3: " + multipleOfThree);

        scanner.close();
    }
}

//Q13

import java.util.Scanner;

public class Q13MarksAggregation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] marks = new int[20][3]; // 20 students, 3 subjects
        int above75 = 0;
        int below40 = 0;

        // Input marks for each student
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }

        // Calculate percentage and count
        for (int i = 0; i < 20; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            float percentage = (total / 300.0f) * 100;

            if (percentage >= 75) {
                above75++;
            } else if (percentage <= 40) {
                below40++;
            }
        }

        // Display results
        System.out.println("Number of students securing 75% and above: " + above75);
        System.out.println("Number of students securing 40% and below: " + below40);

        scanner.close();
    }
}

//Q14

import java.util.Scanner;

public class Q14EvenOddArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[20];
        int[] even = new int[20];
        int[] odd = new int[20];
        int evenCount = 0, oddCount = 0;

        // Input array elements
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] % 2 == 0) {
                even[evenCount++] = arr[i];
            } else {
                odd[oddCount++] = arr[i];
            }
        }

        // Print even elements
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        // Print odd elements
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

//Q15

import java.util.ArrayList;

public class Q15SubarraysWithZeroSum {

    public static void findZeroSumSubarrays(int[] arr) {
        int n = arr.length;
        boolean found = false;

        // Generate all subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];

                // If sum becomes zero, print the subarray
                if (sum == 0) {
                    found = true;
                    System.out.print("Subarray with 0 sum: [");
                    for (int k = start; k <= end; k++) {
                        System.out.print(arr[k]);
                        if (k < end) System.out.print(", ");
                    }
                    System.out.println("]");
                }
            }
        }

        if (!found) {
            System.out.println("No subarray with zero sum found.");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        int[] nums2 = {1, 2, -3, 4, 5, 6};
        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};

        System.out.println("For nums1:");
        findZeroSumSubarrays(nums1);

        System.out.println("\nFor nums2:");
        findZeroSumSubarrays(nums2);

        System.out.println("\nFor nums3:");
        findZeroSumSubarrays(nums3);
    }
}

//Q16

import java.util.Arrays;

public class Q16MergeSortedArrays {

    public static void mergeSortedArrays(int[] A, int[] B) {
        int p = A.length;
        int q = B.length;
        int[] temp = new int[p + q];

        // Copy elements of A and B into temp array
        for (int i = 0; i < p; i++) {
            temp[i] = A[i];
        }
        for (int i = 0; i < q; i++) {
            temp[p + i] = B[i];
        }

        // Sort the temp array
        Arrays.sort(temp);

        // Fill the first p smallest elements into A
        for (int i = 0; i < p; i++) {
            A[i] = temp[i];
        }

        // Fill the remaining elements into B
        for (int i = 0; i < q; i++) {
            B[i] = temp[p + i];
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};

        mergeSortedArrays(A, B);

        // Display the result
        System.out.println("Sorted Array A: " + Arrays.toString(A));
        System.out.println("Sorted Array B: " + Arrays.toString(B));
    }
}

//Q1

import java.util.Scanner;

public class Q1MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        // Taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Finding min and max
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        // Output the results
        System.out.println("Smallest Element: " + min);
        System.out.println("Largest Element: " + max);

        scanner.close();
    }
}

//Q20

public class Q20MatrixSum {
    public static void main(String[] args) {
        // Example matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        // Print original matrices
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);
        
        // Calculate sum
        int[][] sumMatrix = matrixSum(matrix1, matrix2);
        
        // Print result
        System.out.println("\nSum of matrices:");
        printMatrix(sumMatrix);
    }
    
    public static int[][] matrixSum(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null || 
            matrix1.length != matrix2.length || 
            matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices must have the same dimensions");
            return null;
        }
        
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        return result;
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Null matrix");
            return;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Q21

public class Q21RowColumnSum {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Find row and column sums
        System.out.println("\nRow and Column Sums:");
        findRowAndColumnSum(matrix);
    }
    
    public static void findRowAndColumnSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Empty matrix");
            return;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Calculate row sums
        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i+1) + ": " + rowSum);
        }
        
        // Calculate column sums
        System.out.println("\nColumn sums:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j+1) + ": " + colSum);
        }
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Null matrix");
            return;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Q22

public class Q22MaxMatrixElement {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {14, 5, 6},
            {7, 8, 9}
        };
        
        // Print original matrix
        System.out.println("Matrix:");
        printMatrix(matrix);
        
        // Find maximum element
        int max = findMaxElement(matrix);
        
        // Print result
        System.out.println("\nMaximum element: " + max);
    }
    
    public static int findMaxElement(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Empty matrix");
            return Integer.MIN_VALUE;
        }
        
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        
        System.out.println("Maximum element " + max + " found at position: (" + maxRow + "," + maxCol + ")");
        return max;
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Null matrix");
            return;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

//Q18

public class Q18PrintMatrix {
    public static void main(String[] args) {
        // Example matrix (3x4)
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        // Print matrix dimensions
        System.out.println("Matrix dimensions: " + matrix.length + "x" + matrix[0].length);
        
        // Print the matrix
        System.out.println("Matrix elements row-wise:");
        printMatrixRowWise(matrix);
    }
    
    public static void printMatrixRowWise(int[][] matrix) {
        // Check if the matrix is empty
        if (matrix == null || matrix.length == 0) {
            System.out.println("Empty matrix");
            return;
        }
        
        // Get dimensions
        int m = matrix.length;    // Number of rows
        int n = matrix[0].length; // Number of columns
        
        // Iterate through each row
        for (int i = 0; i < m; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

//Q19

public class Q19MatrixTranspose {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Get transpose of the matrix
        int[][] transpose = transposeMatrix(matrix);
        
        // Print transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose);
        
        // Example of a non-square matrix
        int[][] nonSquareMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        System.out.println("\nOriginal Non-square Matrix (2x3):");
        printMatrix(nonSquareMatrix);
        
        int[][] nonSquareTranspose = transposeMatrix(nonSquareMatrix);
        
        System.out.println("\nTransposed Non-square Matrix (3x2):");
        printMatrix(nonSquareTranspose);
    }
    
    public static int[][] transposeMatrix(int[][] matrix) {
        // Check if the matrix is empty
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Create a new matrix with swapped dimensions
        int[][] transpose = new int[cols][rows];
        
        // Fill the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        return transpose;
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Q23
public class Q23MatrixMultiplication {
    public static void main(String[] args) {
        // Example matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        
        // Print original matrices
        System.out.println("Matrix A (2x3):");
        printMatrix(matrixA);
        
        System.out.println("\nMatrix B (3x2):");
        printMatrix(matrixB);
        
        // Multiply matrices
        int[][] result = matrixMultiplication(matrixA, matrixB);
        
        // Print result
        System.out.println("\nResult of A × B:");
        printMatrix(result);
    }
    
    public static int[][] matrixMultiplication(int[][] A, int[][] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0) {
            System.out.println("Empty matrices");
            return null;
        }
        
        if (A[0].length != B.length) {
            System.out.println("Cannot multiply: Number of columns in first matrix must equal number of rows in second matrix");
            return null;
        }
        
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return result;
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Null matrix");
            return;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

//Q24

public class Q24RotateMatrix {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Rotate matrix
        int[][] rotated = rotateMatrix90(matrix);
        
        // Print rotated matrix
        System.out.println("\nMatrix after 90° clockwise rotation:");
        printMatrix(rotated);
    }
    
    public static int[][] rotateMatrix90(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            System.out.println("Matrix must be square for rotation");
            return null;
        }
        
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // For 90° clockwise rotation: rotated[j][n-1-i] = matrix[i][j]
                rotated[j][n-1-i] = matrix[i][j];
            }
        }
        
        return rotated;
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Null matrix");
            return;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Q25

public class Q25DiagonalSum {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Print original matrix
        System.out.println("Matrix:");
        printMatrix(matrix);
        
        // Calculate diagonal sums
        int[] diagonalSums = findDiagonalSum(matrix);
        
        // Print results
        System.out.println("\nPrimary diagonal (top-left to bottom-right): " + diagonalSums[0]);
        System.out.println("Secondary diagonal (top-right to bottom-left): " + diagonalSums[1]);
        System.out.println("Sum of both diagonals: " + (diagonalSums[0] + diagonalSums[1]));
    }
    
    public static int[] findDiagonalSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            System.out.println("Matrix must be square for diagonal sum");
            return new int[]{0, 0};
        }
        
        int n = matrix.length;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        
        for (int i = 0; i < n; i++) {
            // Primary diagonal: elements where row index equals column index
            primaryDiagonalSum += matrix[i][i];
            
            // Secondary diagonal: elements where row index + column index = n-1
            secondaryDiagonalSum += matrix[i][n-1-i];
        }
        
        return new int[]{primaryDiagonalSum, secondaryDiagonalSum};
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Null matrix");
            return;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//Q2

import java.util.Scanner;

public class Q2ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reversing the array
        int left = 0, right = n - 1;
        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        // Output the reversed array
        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

//Q3

import java.util.Scanner;

public class Q3SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Check for valid input
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int[] arr = new int[n];

        // Taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Finding the second largest element
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest before updating largest
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num; // Update second largest if it’s smaller than largest but greater than current secondLargest
            }
        }

        // Checking if there is a valid second largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be the same).");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }

        scanner.close();
    }
}

//Q4

import java.util.Scanner;

public class Q4EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Counting even and odd numbers
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;  // Number is even
            } else {
                oddCount++;   // Number is odd
            }
        }

        // Output the results
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);

        scanner.close();
    }
}

//Q5
import java.util.Scanner;

public class Q5SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculating sum and average
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / n; // Typecasting to get a decimal value

        // Output the results
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        scanner.close();
    }
}

//Q6

import java.util.Scanner;

public class Q6RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0; // Edge case: empty array

        int i = 0; // Slow pointer for unique elements

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) { // Found a new unique element
                i++; // Move slow pointer
                arr[i] = arr[j]; // Update unique position
            }
        }
        
        return i + 1; // New size of the unique elements array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Taking sorted array input
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Removing duplicates
        int newLength = removeDuplicates(arr);

        // Output the modified array
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}

//Q7

import java.util.Scanner;

public class Q7RotateArray {
    // Function to reverse a part of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array to the right by k positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking input for k (rotation count)
        System.out.print("Enter the number of positions to rotate (k): ");
        int k = scanner.nextInt();

        // Rotating the array
        rotateRight(arr, k);

        // Output the rotated array
        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

//Q8

import java.util.Arrays;

public class Q8MergeSortedArrays {

    // Function to merge two sorted arrays without extra space
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int gap = (n + m + 1) / 2; // Initial gap

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < (n + m)) {
                if (j < n) { // Both elements in arr1
                    if (arr1[i] > arr1[j]) {
                        // Swap if elements are out of order
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                } else if (i < n) { // One element in arr1 and the other in arr2
                    if (arr1[i] > arr2[j - n]) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                } else { // Both elements in arr2
                    if (arr2[i - n] > arr2[j - n]) {
                        int temp = arr2[i - n];
                        arr2[i - n] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }
                i++;
                j++;
            }

            if (gap == 1)
                break;
            gap = (gap + 1) / 2; // Reduce the gap
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 9 };
        int[] arr2 = { 2, 3, 6, 7 };

        System.out.println("Before Merging:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        merge(arr1, arr2);

        System.out.println("\nAfter Merging:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}

//Q9

import java.util.Scanner;

public class Q9MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum; // Missing number = Expected - Actual
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the size of the array (n-1): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and display the missing number
        int missingNumber = findMissingNumber(arr, n + 1);
        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}

//Q17

import java.util.Arrays;

public class q17MaximumProductPair {
    public static void main(String[] args) {
        // Example input array
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        
        // Find maximum product pair
        findMaxProductPair(nums);
    }
    
    public static void findMaxProductPair(int[] nums) {
        if (nums == null || nums.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }
        
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        int maxI = 0, maxJ = 0;
        
        // Approach 1: Brute force method - checking all possible pairs
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        
        System.out.println("Pair is (" + nums[maxI] + ", " + nums[maxJ] + "), Maximum Product: " + maxProduct);
        
        // Alternative approach: Sort the array and check specific pairs
        // This would be more efficient for larger arrays
        System.out.println("\nAlternative solution using sorting:");
        findMaxProductPairUsingSorting(nums.clone());
    }
    
    public static void findMaxProductPairUsingSorting(int[] nums) {
        int n = nums.length;
        
        // Sort the array
        Arrays.sort(nums);
        
        // The maximum product could be either:
        // 1. Product of the two largest numbers (if both are positive or both are negative)
        // 2. Product of the two smallest numbers (if both are negative)
        int product1 = nums[n-1] * nums[n-2]; // Two largest numbers
        int product2 = nums[0] * nums[1];     // Two smallest numbers
        
        if (product1 > product2) {
            System.out.println("Pair is (" + nums[n-2] + ", " + nums[n-1] + "), Maximum Product: " + product1);
        } else {
            System.out.println("Pair is (" + nums[0] + ", " + nums[1] + "), Maximum Product: " + product2);
        }
    }
}


//Q

