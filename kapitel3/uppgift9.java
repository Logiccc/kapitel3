import javax.swing.*;
/*	
	Uppgift 3_9
	David Persson
	2017-10-02
*/


public class uppgift9{
	public static void main(String[]args){
		double r;

		r = Math.random();
		r = 100 * r;
		r = r - r%1;
		int i = (int) r;


		JOptionPane.showMessageDialog(null, i);

	}
}