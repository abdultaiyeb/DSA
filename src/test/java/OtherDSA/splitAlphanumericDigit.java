package OtherDSA;
//Java program to split an alphanumeric digit without using split method

public class splitAlphanumericDigit {
	public static void main(String[] args) {
		String str= "Welcome234To567Java89Programming0@#!!";
		
		StringBuilder letters= new StringBuilder();
		StringBuilder digits= new StringBuilder();
		
		char[] arr=str.toCharArray();
		
		for(char c :arr) {
			if(Character.isAlphabetic(c)) {
				letters.append(c);
			}else if(Character.isDigit(c)) {
				digits.append(c);
			}
		}
		System.out.println(letters);
		System.out.println(digits);

	}

}
