package vidiVox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("ViDiVox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel bottomRowButtonsPanel = new JPanel();
		contentPane.add(bottomRowButtonsPanel, BorderLayout.SOUTH);
		bottomRowButtonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Play button clicked
				
			}
		});
		bottomRowButtonsPanel.add(btnPlay);
		
		JButton btnPause = new JButton("Pause");
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Pause button clicked
				
			}
		});
		bottomRowButtonsPanel.add(btnPause);
		
		JButton btnFastforward = new JButton("FastForward");
		btnFastforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Fast forward button clicked
				
			}
		});
		bottomRowButtonsPanel.add(btnFastforward);
		
		JButton btnReverse = new JButton("Reverse");
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Reverse button clicked
				
			}
		});
		bottomRowButtonsPanel.add(btnReverse);
		
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Stop button clicked
				
			}
		});
		bottomRowButtonsPanel.add(btnStop);
		
		JPanel topRowButtonsPanel = new JPanel();
		contentPane.add(topRowButtonsPanel, BorderLayout.NORTH);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Save button clicked
				
			}
		});
		topRowButtonsPanel.add(btnSave);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Open button clicked
				
			}
		});
		topRowButtonsPanel.add(btnOpen);
		
		JButton btnCommentary = new JButton("Commentary");
		btnCommentary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Commentary button clicked
				
			}
		});
		topRowButtonsPanel.add(btnCommentary);
		
		JPanel mediaPlayerPanel = new JPanel();
		contentPane.add(mediaPlayerPanel, BorderLayout.CENTER);
	}

}
