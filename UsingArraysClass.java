import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String[] args){
		int[] myArrays = new int[5];
		
		Arrays.fill(myArrays,10);
		
		for(int myNum : myArrays){
			System.out.printf("%d%n",myNum);
		}
		
		int[] numbers = {6,2,5,9,1,3,7,4,8,10};
		Arrays.sort(numbers);
		
		int[] copy = Arrays.copyOf(numbers,10);
		System.out.println("=========== Where we copy array ==============");
		for(int copyNum : copy){
			System.out.printf("%d%n",copyNum);
		}
		
		int index = Arrays.binarySearch(numbers,7);
		System.out.println("The element index is " + index);
		
		System.out.println("=========== Where we printed numbers array ==============");
		for(int num : numbers){
		System.out.printf("%d%n",num);
		}
	}
}