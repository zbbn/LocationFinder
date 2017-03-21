package lf;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LocationFinderGUI extends JFrame implements ActionListener {
	private JFrame frame = new JFrame();
	private JLabel lblBuilding = new JLabel("Välj sal",SwingConstants.CENTER);
	private JButton btnORE223, btnORE337, btnORF312;
	private JButton btnBack = new JButton("Bakåt");
	private JLabel lblBackground = new JLabel();
	private ImageIcon locationFinder = new ImageIcon("images/Locationfinder.png");
	private ImageIcon ORE223 = new ImageIcon("images/ORE233.png");
	private ImageIcon ORE337 = new ImageIcon("images/ORE337.png");
	private ImageIcon ORF312 = new ImageIcon("images/ORF312.png");
	private JLabel lblShowImage = new JLabel();
	private JPanel panelOrkanen = new JPanel(new BorderLayout());
	private JPanel panel = new JPanel(new BorderLayout());
	private JPanel southPanel = new JPanel(new GridLayout(4, 1));

	public LocationFinderGUI() {
		btnORE223 = new JButton("OrkanenE233");
		btnORE337 = new JButton("OrkanenE337");
		btnORF312 = new JButton("OrkanenF312");
		
		setSize(600, 600);
		setVisible(true);

		panel.add(lblBackground, BorderLayout.CENTER);
		lblBackground.setIcon(locationFinder);
		southPanel.add(lblBuilding);
		southPanel.add(btnORE223);
		southPanel.add(btnORE337);
		southPanel.add(btnORF312);
		panel.add(southPanel, BorderLayout.SOUTH);

		southPanel.setBackground(Color.WHITE);
		lblBuilding.setForeground(Color.ORANGE);
		
		add(panel);
		
		
		btnORE223.addActionListener(this);
		btnORE337.addActionListener(this);
		btnORF312.addActionListener(this);
	}

	public void showImage(ImageIcon icon) {
		frame.setVisible(true);
		frame.setSize(1371, 720);

		frame.add(panelOrkanen);
		panelOrkanen.add(lblShowImage, BorderLayout.CENTER);
		panelOrkanen.add(btnBack, BorderLayout.SOUTH);
		lblShowImage.setIcon(icon);
		btnBack.addActionListener(e -> closeImage());

	}
	public void closeImage() {
		frame.setVisible(false);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o == btnORE223) {
			showImage(ORE223);
		} 
		if(o == btnORE337) {
			showImage(ORE337);
		}
		if(o == btnORF312) {
			showImage(ORF312);
		}
	}

	public static void main(String[] args) {
		LocationFinderGUI lf = new LocationFinderGUI();
		lf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		lf.setSize(600, 600);
		lf.setVisible(true);
		lf.pack();
	}
}
