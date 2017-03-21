package lf;

import java.awt.*;

import javax.swing.*;

public class LocationFinder extends JFrame {
	private JFrame frame = new JFrame();
	private JLabel lblBuilding;
	private JButton btnBuilding;
	private JButton btnBack = new JButton("Bakåt");
	private JLabel lblBackground = new JLabel();
	private ImageIcon locationFinder = new ImageIcon("images/Locationfinder.png");
	private ImageIcon OR_E233 = new ImageIcon("images/orkanenE233.png");
	private JLabel lblShowImage = new JLabel();
	private JPanel panelOrkanen = new JPanel(new BorderLayout());

	public LocationFinder() {
		JPanel panel = new JPanel(new BorderLayout());
		JPanel southPanel = new JPanel(new GridLayout(2, 1));
		lblBuilding = new JLabel("Välj byggnad");
		btnBuilding = new JButton("OrkanenE233");

		setSize(600, 600);
		setVisible(true);

		panel.add(lblBackground, BorderLayout.CENTER);
		lblBackground.setIcon(locationFinder);
		southPanel.add(lblBuilding, BorderLayout.CENTER);
		southPanel.add(btnBuilding,BorderLayout.SOUTH);
		panel.add(southPanel, BorderLayout.SOUTH);

		add(panel);

		btnBuilding.addActionListener(e -> showImage());
	}

	public void showImage() {

		frame.setVisible(true);
		frame.setSize(1371, 720);

		frame.add(panelOrkanen);
		panelOrkanen.add(lblShowImage, BorderLayout.CENTER);
		panelOrkanen.add(btnBack, BorderLayout.SOUTH);
		lblShowImage.setIcon(OR_E233);
		btnBack.addActionListener(e -> closeImage());
//		frame.add(btnBack);
	}
	public void closeImage() {
		frame.setVisible(false);
		
	}

	public static void main(String[] args) {
		LocationFinder lf = new LocationFinder();
		lf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		lf.setSize(600, 600);
		lf.setVisible(true);
		lf.pack();
	}
}
