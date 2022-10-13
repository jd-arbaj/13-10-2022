/*
 * 3.Write a method reverse() that receives a string str as a parameter and returns
 *  the characters in str in reverse order. Thus, if the value sent to reverse() 
 *  is "I me ", the method returns " em I".
 */


package com.string.demo.bll;
import java.util.Scanner;
public class ReverseStringTest {

	public static void main(String[] args) {

				//Scanner object for input string.
				Scanner sc = new Scanner(System.in);
				
				//User message.
				System.out.println("Enter a string : ");
				String str = sc.nextLine();
				System.out.println("Origional string : "+str);
				
				//Calling reverseString method
				reverseString(str);
				
				//Close scanner object
				sc.close();
			}
			public static void reverseString(String str) {
				for(int i=str.length()-1; i>=0; i--) {
					if(i==str.length()-1)
						System.out.print("Reverse string : ");
					System.out.print(str.charAt(i));
				}
			}

	}


