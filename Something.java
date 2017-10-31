package lab;

public class Something {

	int a;
	static int b;

	void m1(){}
	static void m2(){}


	static void sub(){

		a=1;		// static을 안썼으므로 여기서 쓸수가없음
		
		b=2;

		m1();	 //에러가 뜸  static 변수가 아니므로  
		
		m2();
		Something obj = new Something();
		Something obj2 = new Something();
		
		
		obj.a=3;
		obj.b=4;		// error 남   b가 static이므로 obj 안에 들어 있지 않으므로 error
		obj.m1();		
		obj.m2();		//
	}
}
