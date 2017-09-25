import javax.swing.*;

/*	
	Uppgift 3.5
	David Persson
	2017-09-25
*/

public class uppgift5{
	public static void main(String[]args){
		String kostnad = JOptionPane.showInputDialog(null, "Hur mycket kostar varan?");
		
		int pris = Integer.parseInt(kostnad);
		double moms = pris * 0.2;
		double pris_moms = pris + moms;

		JOptionPane.showMessageDialog(null, pris_moms+"kr"+ "\n" + moms +"kr");

	}
}