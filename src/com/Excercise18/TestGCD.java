/*--------------------------------------------------------------------
Name: Jaime Palencia
Student ID: U94665425
COP 2805C - Java Programming 2
Spring /2017
Assignment # 4
Plagiarism Statement
I certify that this assignment is my own work and that I
have not copied in part or whole or otherwise plagiarized 
the work of other students and/or persons.
--------------------------------------------------------------------*/

package com.Excercise18;

import java.util.Scanner;

public class TestGCD {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in); 	// Scanner called keyIn for User Input.
		System.out.println("Enter Two Integers: ");	// Prompt User for 2 Integers.
		int m = keyIn.nextInt();
		int n = keyIn.nextInt();

		System.out.println("GCD Of " + m + " & " + n + ": " + findGCD(m, n));	// Calculate GCD and then Display.
		keyIn.close();
	}

	//GCD Method
	private static int findGCD(int m, int n) {
		if (m % n == 0) {
			return n;
		} else {
			return findGCD(n, m % n);
		}
	}
}
