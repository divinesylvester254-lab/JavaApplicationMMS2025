import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("1.calculate Area of a Square");
		System.out.println("2.calculate Area of a Rectangle");
		System.out.println("3.calculate Area of a Triangle");
		
		System.out.println("Ente your choice: ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			    System.out.println("Enter the length of the square ");
				int squareLength = input.nextInt();
				MethodOverLoading.area(squareLength);
			break;
			
			case 2:
			    System.out.println("Enter the breath of the rectangle ");
				int rectangleLength = input.nextInt();
				
				System.out.printf("Enter the breadth of the rectangle ");
				int breadthLength = input.nextInt();
				
				MethodOverLoading.area(rectangleLength,breadthLength );
			break;
				
			case 3:
			    System.out.println("Enter the length of the triangle ");
				int triangleLength = input.nextInt();
				
				System.out.print("Enter the base of the triangle ");
				double base = input.nextDouble();
				
				MethodOverLoading.area(triangleLength,base );
			break;
			
			default:
		}
	}
	
	public static void area(int length){
		int areaOfSquare = (int)Math.pow(length,2);
		System.out.printf("The area of the square is %d",areaOfSquare);
	}
	
	public static void area(int length,int breadth){
		int areaOfRectangle = length * breadth;
		System.out.printf("The area of the rectangle is %d",areaOfRectangle);
	}
	
	public static void area(int length,double base){
		double areaOfTriangle = 0.5 * length * base;
		System.out.printf("The area of the triangle is %.2f",areaOfTriangle);
	}
}