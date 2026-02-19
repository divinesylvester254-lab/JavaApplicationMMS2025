public class OperatorsPart1{
	public static void main(String[] args){
		//assignment operators(=)
		int num = 50;
		System.out.printf("the value of num is %d",num);
		
		//Arithmetic operators(+,-,+,/,%)
		int num1 = 100;
		int num2 = 200;
		
	    int addition = num1 + num2;
		System.out.printf("the sum of %d and %d is %d%n",num1,num2,addition);
		
		int subtraction = num1 - num2;
		System.out.printf("The difference between %d and %d is %d%n",num1,num2,subtraction);
		
		int multiplication = num1 * num2;
		System.out.printf("The product of %d and %d is %d%n",num1,num2,multiplication);
		
		double quotient = (double)num1/num2;
		System.out.printf("The product of %d and %d is %f%n",num1,num2,quotient);
		
		int remainder = num1%num2;
		System.out.printf("The remainder of %d and %d is %d%n",num1,num2,remainder);
		
		
		//compound assinment operators
	    num1 += num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 -= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 *= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 /= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 %= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		//Relational Operators(>,<,>=,!=,==)
		int number1 = 20, number2 = 50;
		
		boolean isGreater = number1 > number2;
		System.out.printf("Is %d > %d? %b%n",number1,number2,isGreater);
		
		boolean isLessThan = number1 < number2;
		System.out.printf("Is %d < %d? %b%n",number1,number2,isLessThan);
		
		boolean isGreaterThanOrEqualTo = number1 >= number2;
		System.out.printf("Is %d >= %d? %b%n",number1,number2,isGreaterThanOrEqualTo);
		
		boolean isLessThanorEqualTo = number1 <= number2;
		System.out.printf("Is %d <= %d? %b%n",number1,number2,isLessThanorEqualTo);
		
		boolean isNotEqualTo = number1 != number2;
		System.out.printf("Is %d != %d? %b%n",number1,number2,isNotEqualTo);
		
		boolean isEqualTo = number1 == number2;
		System.out.printf("Is %d == %d? %b%n",number1,number2,isEqualTo);
	}
}