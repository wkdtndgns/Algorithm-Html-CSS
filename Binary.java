package algo.a;

import java.util.Scanner;


public class Binary {

	static int solution(int n){

		String s =null;
		int count=0;
		int max=0;

		s=String.valueOf(Integer.toBinaryString(n));

		for(int i=0; i<s.length();i++){

			if(s.charAt(i)=='0'){	//  i자리의 글이 0일떄 
				count++;
				
			}
			else if(s.charAt(i)=='1'){  //  i자리의 글이 1일떄 
				
			
				if(max<count)
					max=count;
				count=0;

			}
		}

		
		return max;
	}






	public static void main(String[] args){

		int result =0;


		Scanner input=new Scanner(System.in);		// 데이터를 받아 input에 저장 
		System.out.println("값 입력:");
		result= input.nextInt();		//실적 변수에 input에서 받은 데이터 저장 

		System.out.println(solution(result));



	}


}
