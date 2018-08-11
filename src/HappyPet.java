import javax.swing.JOptionPane;

public class HappyPet {

	// 2.
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1.
		String answer = JOptionPane.showInputDialog(null, "what kind of pet do you want to buy");
		// 7.
		// 3.
		int task = JOptionPane.showOptionDialog(null, "What do want to do to make your pet happy", "HappyPet", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "cuddle", "take a walk ", "serve food", "serve water" }, null);

		// 5.
		// 6.

		// 4.
		if (task == 0) {
			JOptionPane.showMessageDialog(null, answer + " is happy");
		} else if (task == 1) {
			JOptionPane.showMessageDialog(null, answer + " is tired");
		} else if (task == 2) {
			JOptionPane.showMessageDialog(null, answer + " is satisfied");
		} else if (task == 3) {
			JOptionPane.showMessageDialog(null, answer + " is hydrated");
		}else {
			JOptionPane.showMessageDialog(null, "error");
		}
for (int i = 0; i < args.length; i++) {
	
}
		
	}
}

// 1. Ask the user what kind of pet they want to buy, and store their answer
// in__(done)
// a variable

// 2. Add the following variable to the next line: static int happinessLevel =
// 0;
// this will be used to store the happiness of your pet__(done)

// 3. Use showOptionDialog to ask the user what they want to do to make their
// pet happy
// (eg: cuddle, food, water, take a walk, groom, clean up poop).
// Make sure to customize the title and question too.__(done)

// 4. Create methods to handle each of your user selections.
// Each method should create a pop-up with the pet's response (eg. cat might
// purr when pet),
// and INCREMENT the pet's happiness Level.

// 5. Use user input to call the appropriate method created in step 4.

// 6. If you determine the happiness level is large enough, tell the
// user that he loves his pet and use break; to exit for loop.

// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
