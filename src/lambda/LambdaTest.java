package lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaTest{
	
	
	public static void main(String[] args) {
		
		Lambda add = (int a , int b) -> a + b; 
		Lambda sub = (a,b) -> a-b;
		Lambda xxx = (int a,int b) -> { return a * b; };
		Lambda ccc = (a,b) -> a/b;
		Lambda qqq = (a,b) -> a%b;
		
		System.out.println("add: "+add.method01(55,20));
		System.out.println("sub: "+sub.method01(55,20));
		System.out.println("xxx: "+xxx.method01(55,20));
		System.out.println("ccc: "+ccc.method01(55,20));
		System.out.println("qqq: "+qqq.method01(55,20));

		


//		int[] arr = {1,2,3,4};
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j= 0 ; j < arr.length; j++) {
//				for(int k = 0; k < arr.length; k++) {
//					if((arr[i] != arr[j]) && (arr[i] != arr[k]) && (arr[j] != arr[k])) {
//						System.out.println(arr[i] +""+arr[j]+"" +arr[k]);
//						sum++;
//					}
//				}
//			}
//		}
//		System.out.println("sum:"+sum);
		
	}
	
}
