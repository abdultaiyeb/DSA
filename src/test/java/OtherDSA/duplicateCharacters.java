package OtherDSA;

import java.util.*;
import java.util.Map.Entry;

// How to print duplicate characters from the string?
public class duplicateCharacters {
	public static void main(String[] args) {
		String str= "programming";
		
		HashMap<Character,Integer> map= new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		for(Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey());
			}
		}						
	}

}
