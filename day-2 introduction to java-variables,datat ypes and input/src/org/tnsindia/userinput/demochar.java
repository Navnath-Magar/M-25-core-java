package org.tnsindia.userinput;

import java.util.Scanner;

public class demochar extends demoOninteger {

	public static void main(String[] args) {
		//user-input for char data-type
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the value : ");
				char x=s.next().charAt(2);
				System.out.println("The result will be: ");
				System.out.print(x);
			}

		

	}


