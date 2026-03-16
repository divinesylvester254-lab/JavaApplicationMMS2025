import java.util.Random;

public class PasswordGenerator{
	public static void main(String[] args){
		System.out.println("Generated Password: " + generatorPassword());
	}
	public static String generatorPassword() {
		
		Random random = new Random();
		
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^()-_=+<>?/{}[]";
		
		String allCharacters = upper + lower + numbers + symbols;
		
		String password = "";
		
		for (int i = 0; i < 18; i++){
			int index = random.nextInt(allCharacters.length());
			password += allCharacters.charAt(index);
		}
		
		return password;
	}
}