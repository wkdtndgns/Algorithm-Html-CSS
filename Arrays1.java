package lec;

import java.util.Arrays;
import java.util.Random;

public class Arrays1 {

	static Random random =new Random();
	
	static int[] makeIntArray(int count){
		
		
		int[] a=new int[count];
		for(int i=0; i<count; ++i)
			a[i]=random.nextInt(count);
		return a;
	}
	
	
	public static void main(String[] args){
	
		int[] a =makeIntArray(20);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	
		int index =Arrays.binarySearch(a, 5);
		System.out.printf("index of 10: %d\n", index);
		
		int[] b =Arrays.copyOf(a, a.length);	//새배열의 
		System.out.printf("Arrays.equals(a,b): %b\n",Arrays.equals(a,b));		//이건 equality 비교
		
		System.out.printf("a.equals(b) : %b \n",a.equals(b));		//아이덴티디 비교 
		System.out.println(a.toString());
		
	
	}
}
