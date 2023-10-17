import java.math.BigDecimal;

import acm.program.ConsoleProgram;

public class Problem17 extends ConsoleProgram{
//	public void run(){
//		double d = readDouble("Enter number ");
//		int a = (int) d;
//		double b = d - a;
//		println(a);
//		println(b);
//		
	
	}
	
	private void calculateInBigDecimal(){
		double d = readDouble("Enter number ");
		String dAsAString = "" + d;
		BigDecimal decimal = new BigDecimal(d);
		println(decimal);
		
		int integerPart = decimal.intValue();
		BigDecimal fractionPart = decimal.remainder(BigDecimal.ONE);
		
		println("integerPart: " + integerPart);
		println("fractionPart: " + fractionPart);
	}
}
