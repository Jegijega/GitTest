import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram {
	public void run() {
		while (true) {
			int n = readInt("Enter number ");
			int reversed = reverse(n);
			println(reversed);
		}
	}

	private int reverse(int n) {
		int result = 0;
		int r;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			result = result * 10 + r;
		}
		return result;
	}
}