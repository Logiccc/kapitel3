import javax.swing.*;

/*	uppgift 3.3
	David Persson
	2017-09-25
*/


public class uppgift3{
	public static void main(String[]args){
		String radien1 = JOptionPane.showInputDialog(null, "Raiden tack. ");

		double pi = 3.1415926536;
		double radien = Double.parseDouble(radien1);

		double area = pi * (radien * radien);
		double omkrets = (2 * pi) * radien;
		JOptionPane.showMessageDialog(null, area + "\n" + omkrets);

	}
}