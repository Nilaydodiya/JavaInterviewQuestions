package JavaQuestions;


public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'c';
		if (ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch== 'u' )
		{
			System.out.println(ch+" is Vowel");
		}
		else 
		{
			System.out.println(ch+" is Consonant");
		}
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" is Vowel");
		break;
		default:
			System.out.println(ch+" is Consonant");
		break;
		}
	
	}

}
