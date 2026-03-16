public class CommandLineArguments{
	public static void main(String[] args){
		System.out.print("Enter any input: ");
		
		for(String input : args){
			System.out.println(input);
		}
	}
}