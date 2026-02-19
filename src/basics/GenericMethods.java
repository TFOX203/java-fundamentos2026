package basics;

import java.util.Arrays;

public class GenericMethods {
	public static void main(String[] args) {
		String[] names = {"Pablo","Juan","Ana","Justo","Ruben"};
		Integer[] scores = {12,1000,3423,34,2,20,3,2};
		switchValues(names, 0, 1);
		switchValues(scores, 0, 1);
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(scores));
		
 }
	/**
	 * 
	 * We can create generic methods to reach its maxium reusability of the code of methods
	 * @param  <Element> The name of the genereic type
	 */
		
	
	
	
 public static<Element> void switchValues(Element[] arr,int index1, int index2) {
		
	 
		if(arr == null) {
			return;
		}
		// >= means greater or equal
		//Theindex of the last element in an array is arr.lenght -1
		
		if(index1 < arr.length|| index2 <arr.length) {
			return;
		}
		//if(arr.length)
		Element dato= arr [index1];
		arr[index1] = arr[index2];
		arr[index2] = dato;
		
 }
}
