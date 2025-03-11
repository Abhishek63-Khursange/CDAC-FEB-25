//  Q1: Write a program to swap two numbers without using a third variable and without using arithmetic operators like + or -. Hint: Use bitwise XOR ^ operator
/*
class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 7;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
} 

// Q2: Write a program to check whether a given number is even or odd using only bitwise operators. Hint: Use n & 1 to check

import java.util.Scanner;

 class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check using bitwise AND
        if ((n & 1) == 0) {
            System.out.println(n + " is an Even number.");
        } else {
            System.out.println(n + " is an Odd number.");
        }

        scanner.close();
    }
} 

   // Q9: Implement a Java program that checks if a number is within a specific range (20 to50) without using if-else.Hint: Use logical AND (&&) in a print statement
   
 class rangeCheck{
	 public static void main(String args[])
	 {
		 int num=19;
		 System.out.println(num>=20 && num<=50);
		 
 }}


// Q18

class Check {
    public static void main(String args[]) {
        int marks = 60;
        String result = (marks >= 40) ? "pass" : "fail"; // Use String
        System.out.println(result);
    }
}

//Q19

class checkCase{
	public static void main(String args[])
	{
		char name='A';
		
	    String result=(Character.isUpperCase(name))? "Uppercase" : "Lowercase" ;
		System.out.println(result);
}}


//Q17 Implement a Java program that finds the minimum of four numbers using nested ternary operators.

class MinOfFour {
    public static void main(String[] args) {
        int a = 15, b = 10, c = 25, d = 5;

        int min = (a < b) ? 
                     ((a < c) ? ((a < d) ? a : d) : (c < d ? c : d)) 
                  :  ((b < c) ? ((b < d) ? b : d) : (c < d ? c : d));

        System.out.println("The minimum number is: " + min);
    }
}

		
//Q16
//Write a program that determines whether a given number is positive, negative, or zero using only the ternary  operator


class checkNumber{
	public static void main(String args[]){
		 byte num =-25;
		String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        
        System.out.println("The number is: " + result);
}}



//18
//Write a Java program to multiply a number by 8 without using * or / operators. Hint: Use bitwise left shift (<<)

class multi{
	public static void main(String args[])
	{
		int num=5;                       
		int multinum=num<<3;
		System.out.println(multinum);
	}
}

//Q10
//Write a program to determine  a character is a vowel or a consonant using the ternary operators

class checkVowel{
	public static void main(String args[])
	{
		char ch='a';	
		String result = (ch >= 'a' && ch <= 'z') ? 
                        ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 
                        "Vowel" : "Consonant") : "Not an alphabet";

        System.out.println("The character is: " + result);
	}
}


//Q6
//Write a program to find the largest of three numbers using only the ternary operator(? :).
import java.util.Scanner;
class largestFind{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your 3 numbers: ");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("3 numbers  are: "+a +b +c);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		String result=(a>b)?((a>c)?"a is a largest":(c>b)?"C is largest" :"b is largest"):(b>c)?"B is largest":"c is largest";
		System.out.println(result);
		
		
		
}}


//Q7
// Implement a Java program that checks whether a given year is a leap year or not using logical (&&, ||) operator
import java.util.Scanner;
class checkLeap{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
}}


//Q8
//Write a program that takes three boolean inputs and prints true if at least two of them are true. Hint: Use logical operator (&& ||)

import java.util.Scanner;
class Bool{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 number: ");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("3 numbers  are: "+a +b +c);
		System.out.println("a="+a);
		System.out.println("b="+b);
        System.out.println("c="+c);
 
        boolean result=(a>b && a>c || b>c && b<a);
		 System.out.println(result);
		
}}


//Q11
 //Write a program to check if a given number is a power of 2 using bitwise operators. Hint: n & (n - 1) == 0 for positive numbers.
 
 import java.util.Scanner;

class PowerCheck {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is not a power of 2.");
        }
        
        scanner.close();
    }
}

//Q12
// Write a Java program to multiply a number by 8 without using * or / operators. Hint: Use bitwise left shift (<<).

import java.util.Scanner;

class MultiplyByEight {
    public static int multiplyByEight(int num) {
        return num << 3; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int result = multiplyByEight(num);
        System.out.println("Result after multiplying by 8: " + result);
        
        scanner.close();
    }
}


//Q20
// Implement a Java program that returns the absolute value of a given number using the ternary operator (without using Math.abs()).

import java.util.Scanner;

 class AbsoluteValue {
    public static int absolute(int num) {
        return (num < 0) ? -num : num; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int absValue = absolute(num);
        System.out.println("Absolute value: " + absValue);
        
        scanner.close();
    }
}

//Q24
// Write a program that prints all even numbers from 1 to 100 using only bitwise AND  (&) and for loop.

class EvenNumbersBitwise {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100:");
        
        for (int i = 1; i <= 100; i++) {
            if ((i & 1) == 0) { // Checking if the least significant bit is 0 (even number)
                System.out.print(i + " ");
            }
        }
    }
}

//Q3: 
//Implement a program that calculates the sum of digits of an integer using modulus (%) and division (/) operators.


import java.util.Scanner;

 class SumOfDigits {
    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        
        // Taking absolute value to handle negative numbers
        num = (num < 0) ? -num : num;
        
        while (num > 0) {
            sum += num % 10; // Extract the last digit using modulus
            num /= 10; // Remove the last digit using division
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        int sum = calculateSumOfDigits(num);
        System.out.println("Sum of digits: " + sum);
        
        scanner.close();
    }
}


//Q4 
//Write a program to find whether a given number is divisible by 3 without using the modulus (%) or division (/) operators. Hint: Use subtraction and bitwise shifts.

import java.util.Scanner;

class DivisibilityByThree {
    public static boolean isDivisibleByThree(int num) {
        num = (num < 0) ? -num : num; // Convert negative to positive
        
        while (num >= 3) {
            int sum = 0;
            while (num > 0) {
                sum += num & 1; // Extract least significant bit
                num >>= 1; // Right shift to divide by 2
            }
            num = sum; // Assign sum back to num
        }
        
        return (num == 0 || num == 3); // If final result is 0 or 3, it's divisible
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isDivisibleByThree(num)) {
            System.out.println(num + " is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3.");
        }
        
        scanner.close();
    }
}


//Q5
// Write a Java program to swap two numbers using the += and -= operators only.
import java.util.Scanner;
class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping without using a third variable, using += and -=
        a += b; // a = a + b
        b = a - b; // b = (a + b) - b = a
        a -= b; // a = (a + b) - a = b
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}


//Q23
// Given a number, find whether it is odd or even using the & bitwise operator and print the result without using if-else.

import java.util.Scanner;
class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println(num + " is " + ((num & 1) == 0 ? "Even" : "Odd"));
        
        scanner.close();
    }
}


//Q22
// Implement a calculator that takes two numbers and an operator (+, -, *, /) as input and prints the result using only switch-case.
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num2 != 0 ? num1 / num2 : Double.NaN; // Handling division by zero
                break;
            default:
                System.out.println("Invalid operator!");
                scanner.close();
                return;
        }
        
        System.out.println("Result: " + result);
        scanner.close();
    }
}

*/