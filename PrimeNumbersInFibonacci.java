class PrimeNumbersInFibonacci {

	public static void getPrimeNumbers(long n) {
		long fib = 0;
		long first = 1;
		long second = 1;

		long i = 2;
		while(i <= n) {
			fib = first + second;
			first = second;
			second = fib;
			if(fib == 2) {
				System.out.println(2);
			}
			boolean isPrime = true;
			for(long j=fib-1;j>=fib/2;j--) {
				if(j > 1 && fib % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(fib);
			}
			i++;
		}


	}

	public static void main(String args[]) {
		PrimeNumbersInFibonacci.getPrimeNumbers(7);
	}
}