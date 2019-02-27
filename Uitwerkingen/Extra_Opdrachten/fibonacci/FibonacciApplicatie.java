package Extra_Opdrachten.fibonacci;

public class FibonacciApplicatie {

	public static void main(String[] args) {
		int[] fibonacciReeks = new int[20];
		fibonacciReeks[0] = 1;
		fibonacciReeks[1] = 1;
		System.out.println(1);
		System.out.println(1);

		for (int i = 2; i < 20; i++) {
			fibonacciReeks[i] = fibonacciReeks[i-1] + fibonacciReeks[i-2];
			System.out.println(fibonacciReeks[i]);
		}
	}

}
