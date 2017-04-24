package lf;

import javax.swing.JFrame;

public class LocationFinderController extends JFrame {

	public static void main(String[] args) {
		LocationFinder lf = new LocationFinder();
		lf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		lf.setSize(600, 600);
		lf.setVisible(true);
		lf.pack();
	}
	}


