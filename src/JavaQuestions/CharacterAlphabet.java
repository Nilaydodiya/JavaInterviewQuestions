package JavaQuestions;

public class CharacterAlphabet {

	public static void main(String[] args) {

		
		char a = 'v';
		
		if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
		{
			System.out.println(a+" Entered character is Alphabet");
		}
		else
		{
			System.out.println("Entered character is not Alphabet");
		}
	}

}
