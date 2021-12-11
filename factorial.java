
public class factorial {
	public static int factorial(int target) {
		if(target == 0) {
			return 1;
		}
		else {
			return target * factorial(target-1); 
		}
	}
	
	/*
	public static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		else {
			return fib(n - 1) + fib(n - 2); //the method calls itself, fib, which is why it's recursive
		}
	}
	*/
	public static void main(String[] args) {
		//int n = 5; //should get 120
		System.out.println(factorial(5));
	}
}
