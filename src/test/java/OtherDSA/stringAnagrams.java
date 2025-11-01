package OtherDSA;

import java.util.Arrays;

//String Anagrams: Determine if two strings are anagrams of each other
public class stringAnagrams {
	public static void main(String[] args) {
		String str1= "silent";
		String str2= "listen";
		
		char[] arr1= str1.toLowerCase().toCharArray();
		char[] arr2= str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.print("Strings are anagram");
		}else {
			System.out.print("Strings are NOT anagram");
		}	
	}
}
