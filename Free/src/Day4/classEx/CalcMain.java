package Day4.classEx;

public class CalcMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.intro();	
		
		int a = calc.abs(-10);
		System.out.println(a);
		int b = calc.sum(5, 10);
		System.out.println(b);
		double c = calc.sum(1,5,71);
		System.out.println(c);		
	}

}
