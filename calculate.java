public class calculate {
	
	public static void main(String[] arg) {
		System.out.println("calculate...");
		int a = Integer.valueOf(arg[0]);
		int b = Integer.valueOf(arg[1]);
		int summ = a + b;
		int umn = a * b;
		int dif = a - b;
		int del = a / b;
		int step1 = a * a;
		int step2 = b * b;

		System.out.println("Summ  " + summ);
		System.out.println("Umnojenie   " + umn);
		System.out.println("Vichetanie   " + dif);
		System.out.println("Delenie   " + del);
		System.out.println("Stepen1   " + step1);
		System.out.println("Stepen2   " + step2);
	}
}