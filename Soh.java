package oh;

public class Soh {
		
	public static void main(String[] args){


		
		
		
		char A,B,C,D,E,F,G,H;
		String[] arrays=new String[7];	//크기가 7인 배열 선언 
		
		
		arrays[0] ="19:00~19:30";
		arrays[1] ="19:30~20:00";
		arrays[2] ="20:00~20:30";
		arrays[3] ="20:30~21:00";
		arrays[4] ="21:00~21:30";
		arrays[5] ="21:30~22:00";
		arrays[6] ="22:00~22:30";
		arrays[7] ="22:30~23:00";
		
		for(int i=0; i<arrays.length; i++){				// 배열의 저장된 길이만큼 반복문 돌림	
			System.out.print(arrays
					[i] );	
			System.out.print(" ");
		}



	}



}
