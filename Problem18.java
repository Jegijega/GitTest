import acm.program.ConsoleProgram;

public class Problem18 extends ConsoleProgram{
	public void run(){
		int a = readInt("enter first number ");
		int b = readInt("enter second number ");
//		if(a > b){
//			println(a);
//		}	else{
//			println(b);
//		}
		int c = Math.max(a,b);
		println(c);
		int[] array= new int[10];
		println (array);
	}
}
