import javax.swing.*;

/*	uppgift4
	David Persson
	2017-09-25
*/

public class uppgift4{
	public static void main(String[]args){
		String s = JOptionPane.showInputDialog(null, "Antal minuter per månad?");
		int min = Integer.parseInt(s);
		
		s = JOptionPane.showInputDialog(null, "Pris per minut?");
		double minutpris = Double.parseDouble(s);

		double k = min * minutpris;
		JOptionPane.showMessageDialog(null, k + "kr");
	}
}