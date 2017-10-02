import javax.swing.*;

public class upppgift1{
	public static void main(String[]args){
				String s = JOptionPane.showInputDialog(null, "Antal minuter per månad?");
		int min = Integer.parseInt(s);
		
		s = JOptionPane.showInputDialog(null, "Pris per minut?");
		double minutpris = Double.parseDouble(s);

		double k = min * minutpris;
		double procent = k * 0.1;
		double procentpris = k - procent;
		JOptionPane.showMessageDialog(null, k + "kr");

		if (k  > 1000) {
			
			JOptionPane.showMessageDialog(null, procentpris + "kr");
		}

		else 
				JOptionPane.showMessageDialog(null, k + "kr");
		
	}
} 