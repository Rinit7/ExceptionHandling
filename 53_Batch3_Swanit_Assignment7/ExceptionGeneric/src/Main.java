import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean d=true;
		while(d==true) {
			System.out.println("\n1. Test Exception Handling");
			System.out.println("2. Generic classes");
			System.out.println("3. Lambda Function");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");

			int c=s.nextInt();
			switch(c) {
			case 1:
				ExceptionHandling t = new ExceptionHandling();
		        t.testArithmeticException();
		        t.testNullPointerException();
		        t.testArrayIndexOutOfBoundsException();
		        t.testIllegalArgumentException();
		        t.testClassCastException();
		        t.testNumberFormatException();
		        t.testFileNotFoundException();
		        t.testIOException();
		        break;
		        
			case 2:
				Pair<Integer, String> p1 = new Pair<>(1, "One");
		        p1.display();
		        Pair<String, String> p2 = new Pair<>("Key", "Value");
		        p2.display();
		        break;
		    
			case 3:
				MathOperation addition = (a, b) -> a + b;
		        MathOperation subtraction = (a, b) -> a - b;

		        System.out.println("Addition: " + operate(5, 3, addition));
		        System.out.println("Subtraction: " + operate(5, 3, subtraction));
		        break;
		        
			case 4:
				d=false;
				break;
				
			default:
				System.out.println("Wrong Choice. Enter a value from 1-4.");
				break;
			}
		}
        
    }
	public static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
