import javax.swing.*;
/*
	Uppgift 3.8, temperaturer
	David Persson
	2017-09-25
*/

public class uppgift8{
	public static void main(String[]args){
		int max;
		String ms = ShowInputDialog(null, "Väder");
		int m = Integer.parseInt(ms);
		String tis = ShowInputDialog(null, "Väder");
		int ti = Integer.parseInt(tis);
		max = Math.max(m, ti);
		String os = ShowInputDialog(null, "Väder");
		int o = Integer.parseInt(os);
		max = Math.max(max, o);
		String to = ShowInputDialog(null, "Väder");
		int t = Integer.parseInt(to);
		max = Math.max(max, t);
		String fr = ShowInputDialog(null, "Väder");
		int f = Integer.parseInt(fr);
		max = Math.max(max, f);
		String lo = ShowInputDialog(null, "Väder");
		int l = Integer.parseInt(lo);
		max = Math.max(max, l);
		String so = ShowInputDialog(null, "Väder");
		int s = Integer.parseInt(so);
		max = Math.max(max, so); 
		
		
		
	}
}