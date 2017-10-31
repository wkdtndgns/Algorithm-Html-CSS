package algo.a;

import java.util.Random;



public class RandomamHO {

	static void random(){
		Random random = new Random();

		int[] a = new int[5];


		for (int i = 0; i < a.length; ++i)
			a[i] = random.nextInt(9);


		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
	}
	


	public static void main(String[] args) {


		
		for(int i=0; i<100; i++){
			random();
			
			
			System.out.print("  ");
		}

		random();
		
		
		
	}



}


