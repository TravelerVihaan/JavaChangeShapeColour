import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main {

	private JFrame frame;
	private JGraph graphPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JComboBox<Color> comboBox = new JComboBox<Color>();
		frame.getContentPane().add(comboBox, BorderLayout.NORTH);
		comboBox.addItem(Color.black);
		comboBox.addItem(Color.red);
		comboBox.addItem(Color.green);
		comboBox.addItem(Color.blue);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				graphPanel.setColor((Color)comboBox.getSelectedItem());
				graphPanel.repaint();
			}
		});
		graphPanel = new JGraph((Color)comboBox.getSelectedItem());
		graphPanel.repaint();
		frame.getContentPane().add(graphPanel, BorderLayout.CENTER);
	}

}
