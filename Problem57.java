import acm.program.ConsoleProgram;

//დაწერეთ მეთოდი, რომელსაც გადაეცემა ორი სტრინგი და აბრუნებს true-ს თუკი ეს ორის
//სტრინგი ერთმანეთის ანაგრამაა, ხოლო წინააღმდე შემთხვევაში აბრუნებს false-ს. ჩათვალეთ,
//რომ ორივე სტრინგი მხოლოდ ლათინური ალფავიტის პატარა ასოებისგან შედგება.
//იმპლემენტაცია გააკეთეთ მასივების გამოყენებით შემდეგი ალგორითმით: თითოეული
//სიტყვისთვის დათვალეთ თითოეული სიმბოლოს რაოდენობა(‘a’-‘z’) და შეინახეთ მასივში.
//შემდეგ შეადარეთ ერთმანეთს მასივები.

public class Problem57 extends ConsoleProgram{
	private int[] array1;
	private int[] array2;
	
	public void run(){
		String word1 = readLine("enter word ");
		String word2 = readLine("enter word ");
		println(anagram(word1, word2));
	}

	private boolean anagram(String word1, String word2) {
		array1 = new int[26];
		for(int i = 0; i < 26; i++){
			int count = 0;
			for(int j = 0; j < word1.length(); j++){
				if((int)'a' + i == (int)word1.charAt(i)){
					count++;
				}
			}
			array1[i] = count;
		}
		array2 = new int[26];
		for(int i = 0; i < 26; i++){
			int count = 0;
			for(int j = 0; j < word2.length(); j++){
				if((int)'a' + i == (int)word2.charAt(i)){
					count++;
				}
			}
			array2[i] = count;
		}
		for(int i = 0; i < 26; i++){
			if(array1[i] != array2[i]){
				return false;
			}
		}
		return true;
	}
}
