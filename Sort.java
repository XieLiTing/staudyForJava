
/*
"12 0 99 -7 30 4 100 13"
要求对字符串中的数值进行排序。生成一个数值从小到大新字符串。

"-7 0 4 12 13 30 99 100"

思路：
1，将字符串切割。变成字符串数组。
2，将字符串数组转成int数组。
3，int数组排序。
4，将int数组变成字符串。

*/
import java.util.*;
class Sort{
	public static void main(String[] args){
		String str = "12 0 99 -7 30 4 100 13";
		String str2 = numberStringSort(str);
		System.out.println(str2);
	}
	
	public static String numberStringSort(String s){
		String[] str = splitString(s);
		int[] arr = stringToArray(str);
		Arrays.sort(arr);
		return intToString(arr);
		
	}
	
	public static String[] splitString(String str){
		return str.split(" ");
	}
	
	public static int[] stringToArray(String[] str){
		int[] nums = new int[str.length];
		for(int i=0; i<str.length; i++ ){
			nums[i] = Integer.parseInt(str[i]);
		}
		return nums;
	}
	
	public static String intToString(int[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<arr.length; i++){
			if(i != arr.length-1){
				sb.append(arr[i]+" ");
			}else{
				sb.append(arr[i]);
			}
		}
		return sb.toString();
	}
}