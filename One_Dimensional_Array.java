import java.util.Scanner;

public class One_Dimensional_Array{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] marks = new int[10]; 
		int counter = 1;
		
		for(int i = 0; i < 10; i++){
			System.out.printf("Enter the element:  ",counter);
			
			marks[i] = scan.nextInt();
			
			counter++;
		}
		    System.out.printf("The element of the array are:");
		for(int l = 0; l < 10; l++){
			if(marks[l] == 5 || marks[l] % 2 == 0){
				System.out.printf("%d number is an even  number%n",marks[l]);
			}
			else{
				System.out.printf("%d number is an odd  number%n",marks[l]);
			}
			System.out.printf("%d,",marks[l]);
		}	
			
	}
	
	
}