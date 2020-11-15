package model;

/**
 * Calculator class that'll do addition, subtraction, multiplication, 
 * division, and modulo. Takes in two objects and returns a Binary.
 * 
 * @author 
 * @version 2.3
 *
 */
public class BinaryCalculator implements Calculator {

	/**
	 * Add two objects and returns a Binary.
	 * 
	 * @param num1 first object
	 * @param num2 second object
	 */
	@Override
	public Binary add(Object num1, Object num2) {
		Binary a = (Binary) num1;
		Binary b = (Binary) num2;
		String aStr = a.getNumber(); //bin str
		String bStr = b.getNumber(); //bin str
		int aInt = Integer.parseInt(aStr, 2); //int
		int bInt = Integer.parseInt(bStr, 2); //int 
		int result = aInt + bInt; // int
		String resultStr = Integer.toBinaryString(result); //bin str
		return new Binary(resultStr);
	}

	/**
	 * Subtracts the second object with the first object.
	 * Returns a Binary.
	 * 
	 * @param num1 first object
	 * @param num2 second object
	 */
	@Override
	public Binary subtract(Object num1, Object num2){
		Binary a = (Binary) num1;
		Binary b = (Binary) num2;
		String aStr = a.getNumber(); //bin str
		String bStr = b.getNumber(); //bin str
		int aInt = Integer.parseInt(aStr, 2); //int
		int bInt = Integer.parseInt(bStr, 2); //int 
		int result = aInt - bInt; // int
		String resultStr = Integer.toBinaryString(result); //bin str
		return new Binary(resultStr);
	}

	/**
	 * Multiply the two objects together. Returns a Binary.
	 * 
	 * @param num1 first object
	 * @param num2 second object
	 */
	@Override
	public Binary multiply(Object num1, Object num2) {
		Binary a = (Binary) num1;
		Binary b = (Binary) num2;
		String aStr = a.getNumber(); //bin str
		String bStr = b.getNumber(); //bin str
		int aInt = Integer.parseInt(aStr, 2); //int
		int bInt = Integer.parseInt(bStr, 2); //int 
		int result = aInt * bInt; // int
		String resultStr = Integer.toBinaryString(result); //bin str
		return new Binary(resultStr);
	}

	/**
	 * Divide the first object with the second object.
	 * Returns a Binary.
	 * 
	 * @param num1 first object
	 * @param num2 second object
	 */
	@Override
	public Binary divide(Object num1, Object num2) {
		Binary a = (Binary) num1;
		Binary b = (Binary) num2;
		String aStr = a.getNumber(); //bin str
		String bStr = b.getNumber(); //bin str
		int aInt = Integer.parseInt(aStr, 2); //int
		int bInt = Integer.parseInt(bStr, 2); //int 
		int result = aInt / bInt; // int
		String resultStr = Integer.toBinaryString(result); //bin str
		Binary resultBin = new Binary(resultStr);
		return resultBin;
	}
	
	/**
	 * Mods the first object with the second object.
	 * Returns a Binary.
	 * 
	 * @param num1 first object
	 * @param num2 second object
	 */
	@Override
	public Binary mod(Object num1, Object num2) {
		Binary a = (Binary) num1;
		Binary b = (Binary) num2;
		String aStr = a.getNumber(); //bin str
		String bStr = b.getNumber(); //bin str
		int aInt = Integer.parseInt(aStr, 2); //int
		int bInt = Integer.parseInt(bStr, 2); //int 
		int result = aInt % bInt; // int
		String resultStr = Integer.toBinaryString(result); //bin str
		return new Binary(resultStr);
	}
}
