package OtherDSA;
//Java program to count vowels in a string
import java.util.*;
public class countVowelsInString {
	public static void main(String[] args) {
		String str = "Welcome to Java Programming";
		//System.out.println(usingTradionalMethos(str));
		System.out.println(usingHashSet(str));

		
	}
	
	public static int usingTradionalMethos(String str) {
		str = str.toLowerCase();
		int count = 0;
		
		for(char ch : str.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
		}
		return count;		
	}
	
	// 2. Optimized Using a HashSet (Best Balance of Speed & Readability)
	public static int usingHashSet(String str) {
		str = str.toLowerCase();
		int count = 0;
		
		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
		for (char ch : str.toCharArray()) {
            if (vowels.contains(ch)) {
                count++;
            }
        }
		return count;
	}

}
