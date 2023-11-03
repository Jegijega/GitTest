import acm.program.*;

public class work extends ConsoleProgram {
	public void run() {
		println("Enter values to compute Pythagorean theorem.");
		int numA = readInt("a: ");
		int numB = readInt("b: ");
		println("c = " + phitag(numA, numB));
	}
	
	private double phitag(int numA, int numB){
		double numC = Math.sqrt(numA*numA+numB*numB);
		println("sakbfakj");
		return numC;
		
	}
}