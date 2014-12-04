package app;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;

import twitterUser.User;

@SuppressWarnings("serial")
public class AdminControlPanel extends JFrame {

	private JPanel contentPane;
	private User user;
	private DefaultMutableTreeNode node;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//run
	}
		
	public void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminControlPanel frame = new AdminControlPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminControlPanel(User user, DefaultMutableTreeNode node) {
		this.user = user;
		this.node = node;
	}
	
	/**
	 * Create the frame.
	 */
	public AdminControlPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
//		DefaultTreeModel tree = new DefaultTreeModel(root);
//		JTree treeModel = new JTree(tree);
//		treeModel.setBounds(0, 0, 188, 362);
//		contentPane.add(tree);
		
		JTree tree = new JTree();
		tree.setBounds(0, 0, 188, 362);
		contentPane.add(tree);
		
		JTextArea textArea = new JTextArea();
		final JLabel label = new JLabel();
		JTextArea textArea_1 = new JTextArea();
		final JLabel label1 = new JLabel();
		DefaultListModel<String> model = new DefaultListModel<String>();
		
		JButton btnNewButton_1 = new JButton("Add User");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(label.getText());
				System.out.println("You are now stalking this user!");
			}
		});
		btnNewButton_1.setBounds(386, 6, 188, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add Group");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_1.setText(label1.getText());
				System.out.println("Group added! Woohoo!");
			}
		});
		btnNewButton_2.setBounds(386, 67, 188, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Open User View");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserControlPanel userCP = new UserControlPanel();
				userCP.run();
				dispose();
				contentPane.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(198, 141, 376, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Show User Total");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5.setBounds(198, 220, 176, 50);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Show Group Total");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_6.setBounds(386, 220, 188, 50);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Show Messages Total");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_7.setBounds(198, 281, 176, 50);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Show Positive Percentage");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_8.setBounds(386, 281, 188, 50);
		contentPane.add(btnNewButton_8);
		
		textArea.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent arg0) {
			}
		});
		textArea.setBounds(198, 21, 162, 35);
		contentPane.add(textArea);
		
		textArea_1.setBounds(198, 82, 162, 35);
		contentPane.add(textArea_1);
		
		JLabel lblEnterUserId = new JLabel("Enter User ID:");
		lblEnterUserId.setBounds(199, 1, 103, 22);
		contentPane.add(lblEnterUserId);
		
		JLabel lblEnterGroupId = new JLabel("Enter Group ID:");
		lblEnterGroupId.setBounds(198, 67, 76, 14);
		contentPane.add(lblEnterGroupId);
	}
}
