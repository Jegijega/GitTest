package Midterms;

import acm.program.ConsoleProgram;

public class distinct2022 extends ConsoleProgram {
	public void run() {
		String ended = "";
		String ans = "";
		int max = 0;
		while (!ended.equals("END")) {
			ended = readLine("Enter String: ");
			int counter = ended.length();
			for (int i = 0; i < ended.length(); i++) {
				for (int j = 0; j < i; j++) {
					if (ended.charAt(i) == ended.charAt(j)) {
						counter--;
						break;
					}
				}
			}
			if (max < counter) {
				max = counter;
				ans = ended;
			}
		}
		println(ans);
	}
}
