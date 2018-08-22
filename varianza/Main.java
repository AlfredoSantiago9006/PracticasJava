package varianza;

public class Main {
	public static void main(String[] args) {
		B objectB;
		A a= f(objectB);
		B b= f(objectB);
		C c= f(objectB);//covarianza
		
		f(new A());//contravarianza 
		f(new B());
		f(new C());
	}
	
	public static B f(B param) {
		return new B();
	}
	
}
