package algorithm;

public class RecursionTest {
	
	public static void main(String[] args){
		
	}
	
	public static void addByOne(int num){
		num++;
		System.out.println(num);
		if(num > 1000)
		addByOne(num);
	}
}
