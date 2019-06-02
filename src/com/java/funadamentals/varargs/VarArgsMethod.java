/**
 * 
 */
package com.java.funadamentals.varargs;

/**
 * @author dammalapati
 *
 */
public class VarArgsMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(10, 20, 30);
		m1(12, 32);
		m1();
		m1(43);
	}
	
	public static void m1(int... x) {
		int total = 0;
		for (int x1 : x) {
			total = total+x1;
		}
		System.out.println("var args total is "+total);
	}
	
	public static void m1(int x) {
		System.out.println("general method output is "+x);
	}
}
