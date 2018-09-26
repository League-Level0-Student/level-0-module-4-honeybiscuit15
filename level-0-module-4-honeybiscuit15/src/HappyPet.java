import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2.done
		static int happinessLevel = 0;

	
		public static void main(String[] args) {
			// 1.done
			String answer = JOptionPane.showInputDialog(null, "what kind of pet do you want to buy");
			// 7.
			// 3.done
			int task = JOptionPane.showOptionDialog(null, "What do want to do to make your pet happy", "HappyPet", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {  "None","take a walk ", "serve food", "serve water", "cuddle" }, null);

			// 5.		 
			for (happinessLevel=0 ;happinessLevel < task; happinessLevel++) {
				JOptionPane.showMessageDialog(null, happinessLevel, "Happiness Level",0);
			}
			// 6.
if (happinessLevel == 10) {
	JOptionPane.showMessageDialog(null, "You really love your" + answer);
}
		
			// 4.done
			if (task == 0) {
				JOptionPane.showMessageDialog(null, answer + "ok");
			} else if (task == 1) {
				JOptionPane.showMessageDialog(null, answer + " is tired");
			} else if (task == 2) {
				JOptionPane.showMessageDialog(null, answer + " is satisfied");
			} else if (task == 3) {
				JOptionPane.showMessageDialog(null, answer + " is hydrated");
			}else {
				JOptionPane.showMessageDialog(null, "is happy");
			}
	
			// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
			
		}
	}
//4. Create methods to handle each of your user selections.
//Each method should create a pop-up with the pet's response (eg. cat might
//purr when pet),
//and INCREMENT the pet's happiness Level.
//5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
// 7. REPEAT steps 3 - 6 enough times to make your pet happ

