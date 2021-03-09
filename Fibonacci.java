package practiceproject;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		System.out.println(fib(6));
	}
	
	public static int fib(int n) {
		if(n <= 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		int previous = 0;
		int current = 1;
		int total = 0;
		for(int i = 2; i <= n; i++) {
			total = previous + current;
			previous = current;
			current = total;
		}
		return total;
	}
}

