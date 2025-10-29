package DSA;
//TWO Sum
// Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr= {2,7,11,15};
		int target= 26;
		
		int[] bruteForceResult= bruteForce(arr,target);
//		System.out.println(Arrays.toString(bruteForceResult));
		
		int[] bruteForceResultResultUsin= betterApproach(arr,target);
		System.out.println(Arrays.toString(bruteForceResultResultUsin));
		
		}
	//1. Brute Force Approach- Time O(n)^2 and space complexity O(1)
	public static int[] bruteForce(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;		
	}
	
	//2. Better Approach Time Complexity = O(n) Space Complexity = O(n)
	public static int[] betterApproach(int[] arr, int target) {
		HashMap<Integer, Integer> map= new HashMap<>();
		 for(int i=0;i<arr.length;i++) {
			 int difference= target-arr[i];
			 
			 if(map.containsKey(difference)) {
				 return new int[] {map.get(difference),i};
			 }
			 map.put(arr[i], i);
			 
			 	
		 }
		 return null;
	}
}
