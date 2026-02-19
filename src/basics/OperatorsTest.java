package basics;

public class OperatorsTest {
	
	public static void main(String[] args) {
		
		aritmeticalOperationTest();
		unaryoperatorstest();
		assignmentOperatorsTest();
				
	}

	private static void assignmentOperatorsTest() {
		int number1 = 3;
		int number2 = 20;
		float result = number1 + number2;
		System.out.println(result);
		result += number1;//result =result + number1;
	}

	private static void unaryoperatorstest() {
		int num1 = -234;
		num1++;
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		System.out.println(num1++);
		
		num1--;
		--num1;
		System.out.println(num1 ==234);
		System.out.println(!(num1 ==234));
		
	
	
		
		
	}

	private static void aritmeticalOperationTest() {
		int num1,num2,num3;
		num1 =3;
		System.out.println(num1);
		num2 = 5;
		System.out.println(num2);
		num3 = 7;
		System.out.println(num3);
		int result;
		/**
		 * 1 Se leenlos valores de los operadores
		 * 2 Se realizan la operacion con los operadores
		 * 3 Se asignan el resultadode la operacion a la variable al lado izquierdo
		 */
		result =num1 + num2;
		System.out.println("The result is " + result);
		
		//subtraction
		result =result + num3;
		System.out.println("The result is " + result);
		//multiplication
		result = result * 2;
		System.out.println("The result is " + result);
		//division
		result = result / 2;
		System.out.println("The result is " + result);
		// TODO Auto-generated method stub
		
	}

}
