package com;
import java.util.Scanner;

public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two variables");
		int a = scan.nextInt();
		int b = scan.nextInt();
		Calculator obj = new Calculator();
		Addition obj1 = new Addition(a,b);
		
		
		
		
		
		System.out.println("additon is "+obj.Add(a,b));
		System.out.println("Sub is  "+obj.Sub(a,b));
		System.out.println("Sub is  "+obj.Multiply(a,b));
		System.out.println("Sub is  "+obj.Division(a,b));
		System.out.println("Sub is  "+obj.Modulus(a,b));
		}
	int Add(int i, int j){
		int c= i+j;
		return c;
	}
	int Sub(int i, int j){
		int c= i-j;
		return c;
	}
	int Multiply(int i, int j){
		int c= i*j;
		return c;
	}
	int Division(int i, int j){
		int c= i/j;
		return c;
	}
	int Modulus(int i, int j){
		int c= i%j;
		return c;
	}
	

}
class Addition{
	Addition(int u,int v){
		int c = u+v;
		System.out.println(c);
	}
}