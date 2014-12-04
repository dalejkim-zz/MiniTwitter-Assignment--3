package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JList;

import twitterUser.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.Color;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class UserControlPanel extends JFrame {

	private JPanel contentPane;
	private UserUI ui;
	private User user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//creation of a new user control panel
	}
		
	public void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserControlPanel frame = new UserControlPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserControlPanel(UserUI ui, User user) {
		this.ui = ui;
		this.user = user;
	}
	
	/**
	 * Create the frame.
	 */
	public UserControlPanel() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 418);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		final JLabel label = new JLabel();
		JTextArea textArea_1 = new JTextArea();
		final JLabel label1 = new JLabel();
		
		JButton btnFollowUser = new JButton("Follow User");
		btnFollowUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(label.getText());
				System.out.println("Stalking User!");
			}
		});
		btnFollowUser.setBounds(233, 10, 204, 36);
		contentPane.add(btnFollowUser);
		
		textArea.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent arg0) {
			}
		});
		textArea.setBounds(10, 12, 194, 34);
		contentPane.add(textArea);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		JList list = new JList();
		list.setBounds(10, 68, 427, 91);
		contentPane.add(list);
		
		textArea_1.setBounds(10, 170, 235, 52);
		contentPane.add(textArea_1);
		
		JList<String> tweets = new JList<String>();
		
		JButton btnTweet = new JButton("Post Tweet");
		btnTweet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_1.setText(label1.getText());
				System.out.println("Posted Tweet!");
				tweets.add(textArea_1.getText());
			}
		});
		btnTweet.setBounds(274, 170, 163, 45);
		contentPane.add(btnTweet);
		
		DefaultListModel<String> model2 = new DefaultListModel<String>();
		JList list_1 = new JList();
		list_1.setBounds(10, 233, 427, 136);
		contentPane.add(list_1);
	}
}
