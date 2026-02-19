package datastructure;

import java.util.Arrays;
import java.util.Random;

import oopmodeling.Planet;

public class ArrayTest {

	public static void main(String[] args) {
		String[] names = { "Pablo", "Juan", };
		Planet[] planets = { new Planet(), new Planet() };
		int[] numeros1 = {47,66,24,21};
		System.out.println(names[1]);
		int[]scores = {67,35,4,50};

		sumup();

		int[] nums = new int[2000];
		initializeArray(nums);

		findMaxiMin();
		incrementSalary(); 
		reverse(numeros1);
		
		//switch any two alements at two positions in an array
		switchValues(numeros1, 0, 4);
		switchValues(numeros1,2,9);
		switchValues(numeros1,20,90);
		switchValues(null,20,90);
		switchValues(numeros1,-20,90);
		int[] sliced = slice(scores,2,24);
		System.out.println(Arrays.toString(sliced));
		
		
		//create an array with a capacity of strong 10000 integers
		nums = new int [10000];
		System.out.println("the length of the number array is " + nums.length);

		while (true) {
			break;
		}

		float[] salaries = { 17, 8, 14.32f, 9 };
		// {17,8,14.32f,9};
		salaries[0] = salaries[0] + 10;// increment the value of the firt data by 10 stored in the array
		System.out.println(salaries[0]);
		salaries[1] = salaries[1] + 10;
		System.out.println(salaries[1]);
		salaries[2] = salaries[2] + 10;
		salaries[3] = salaries[3] + 10;
		// Automatizaciondel proceso con bucles
		for (int i = 0; i < salaries.length; i++) {

		}
		
	}
	/**
	 * 
	 * @param scores
	 * @param start
	 * @param end
	 * @return
	 */

	private static int[] slice(int[] arr, int start, int end) {
		if(arr == null) {
			return null;
		}
		if(start < 0 || end < 0 || start >= arr.length || end >= arr.length) {
			return null;
		}
		
		System.out.println(arr);
		
		int[]result = new int[end + start + 1];
		//result[0] = arr[start + 0];
		//result[0] = arr[start + 1];
		//result[0] = arr[start + 2];		
		for (int i =0; 1 < result.length; i++)
			result[1] =arr[start + i];
		
		
		return null;
	}
	/**
	 * Reverse the order of the elements in array 
	 * arr the array that we are going to reverse
	 * @param arr
	 */

	private static void reverse(int[] arr) {
		int index1 = 0;
		int index2 = arr.length -1;
		
		for(int i = 0; i < arr.length / 2; i++) {
			int element = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = element;
			index1++;
			index2--;
		}
		System.out.println(Arrays.toString(arr));
		index1 = 0;
		index2 = arr.length -1;
		while(index1 < index2) {
			int element = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = element;
			index1++;
			index2--; 
		}
		
		
	}

	private static void incrementSalary() {
		
	
		
		
		
	}

	static void switchValues(int[] arr,int index1, int index2) {
		
		if(arr == null) {
			return;
		}
		// >= means greater or equal
		//Theindex of the last element in an array is arr.lenght -1
		if(index1 >= arr.length|| index2 >= arr.length) {
			return;
		}
		//if(arr.length)
		int dato= arr [index1];
		arr[index1] = arr[index2];
		arr[index2] = dato;
		
		
	}
		

	private static void sumup() {
		// TODO Auto-generated method stub
		int[] scores = { 12, 34, 3423, 32 };
		System.out.println(scores[0]);// Access to the first element in the array
		System.out.println(scores[1]);// Retrieve the second element
		System.out.println(scores[2]);

		try {
			System.out.println(scores[3445]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			int total = scores[0] + scores[1] + scores[2];
			System.out.println("The total score is " + total);
			int totalScore = 0;
			for (int i = 0; i < scores.length; i++) {
				totalScore = totalScore + scores[i];
				System.out.println("totalScore = " + totalScore);
			}
			// Create an array with a capacity of storing 10000 integers
			int[] nums = new int[10000];
			System.out.println("the length of the number array is " + nums.length);

		}

	}

	private static void findMaxiMin() {
		// TODO Auto-generated method stub

	}

	private static void initializeArray(int[] nums) {
		Random random = new Random();
		// TODO Auto-generated method stub
		int len = nums.length;
		int j = 0;
		while (len > j) {

			nums[j] = random.nextInt(-10000, 10000000);
			j = j + 1; // This operation is the same as j++
		}

	}

}