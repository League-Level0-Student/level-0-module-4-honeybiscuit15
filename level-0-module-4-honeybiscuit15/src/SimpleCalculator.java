
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
		for (int i = 0; i < 4; i++) {
			// 1. Get 2 numbers from the user and convert them to integer.
			String number =
					JOptionPane.showInputDialog(null, "choose two numbers");		
			int num1 = Integer.parseInt(number);
			System.out.println(number);
			
			String amount =
					JOptionPane.showInputDialog(null, "choose two numbers");		
			int num2 = Integer.parseInt(amount);
			System.out.println(amount);
			
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "What operation do you want to use", "Simple Calculator", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Addition", "Subtraction", "Multiplication", "Division" },
					null);

			// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
			if (operation == 0) {
				System.out.println(num1 + num2);
			}else if (operation == 1) {
				System.out.println(num1 - num2);
			} else if (operation == 2) {
				System.out.println(num1 * num2);
			} else if (operation == 3) {
				System.out.println(num1 / num2);
			}else {
				JOptionPane.showMessageDialog(null, "ERROR");
			}
		}
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	
	static void add(int num1,int num2) {
		num1 = 3;
		num2 = 4;
		System.out.println(num1 + num2);
				
	}
	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int num1,int num2) {
		num1 = 3;
		num2 = 4;
		System.out.println(num1 - num2);
				
	}
	static void multiply(int num1,int num2) {
		num1 = 3;
		num2 = 4;
		System.out.println(num1 * num2);
				
	}
	static void divide(int num1,int num2) {
		num1 = 3;
		num2 = 4;
		System.out.println(num1 / num2);
				
	}

}