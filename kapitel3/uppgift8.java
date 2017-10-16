import javax.swing.*;
/*
	Uppgift 3.8, temperaturer
	David Persson
	2017-09-25
*/

public class uppgift8{
	public static void main(String[]args){
		int max;
		String ms = JOptionPane.showInputDialog(null, "Väder");
		int m = Integer.parseInt(ms);
		String tis = JOptionPane.showInputDialog(null, "Väder");
		int ti = Integer.parseInt(tis);
		max = Math.max(m, ti);
		String os = JOptionPane.showInputDialog(null, "Väder");
		int o = Integer.parseInt(os);
		max = Math.max(max, o);
		String to = JOptionPane.showInputDialog(null, "Väder");
		int t = Integer.parseInt(to);
		max = Math.max(max, t);
		String fr = JOptionPane.showInputDialog(null, "Väder");
		int f = Integer.parseInt(fr);
		max = Math.max(max, f);
		String lo = JOptionPane.showInputDialog(null, "Väder");
		int l = Integer.parseInt(lo);
		max = Math.max(max, l);
		String so = JOptionPane.showInputDialog(null, "Väder");
		int s = Integer.parseInt(so);
		max = Math.max(max, s); 
		
		
		JOptionPane.showMessageDialog(null, max + " C");


	}
}