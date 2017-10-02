import javax.swing.*;

public class uppgift3{
	public static void main(String[] args) {
		int points = Integer.parseInt(JOptionPane.showInputDialog(null, "How menny point u get?"));



		if (points > 50){
			JOptionPane.showMessageDialog(null, "DU ljuger");
		}
		else if (points >= 45){
			JOptionPane.showMessageDialog(null, "Hola Joel");
		}
		else if 
			(points >= 40){
				JOptionPane.showMessageDialog(null, "Du har tyvar bara B. DU are not JOEL!!!");
			}
		else if (points >= 35) {
				JOptionPane.showMessageDialog(null, "Du har C");
		}
		else if (points >= 30){
				JOptionPane.showMessageDialog(null, "Du har D");
		}
		else if (points >= 25){
				JOptionPane.showMessageDialog(null, "Du har bara E");
		}
	}
}