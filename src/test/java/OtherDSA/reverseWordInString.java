package OtherDSA;

//Reverse each word in a sentence 
//Input = "reverse each word in a string"; 
//Output = "esrever hcae drow ni a gnirts" 

public class reverseWordInString {
	public static void main(String[] args) {
        String str= "reverse each word in a string";
        String[] arr= str.split(" ");
        String reverse="";
        for(String c : arr){
            char[] arr1= c.toCharArray();
            for(int i=arr1.length-1;i>=0;i--){
                reverse=reverse+arr1[i];
            }
             reverse += " ";
        }
        System.out.print(reverse);
	}
}
