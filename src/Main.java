
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



class Main extends JPanel {
	private JPanel mainPanel;
	private JPanel midPanel;
	private JPanel lastPanel;
	private MainFrame mf;
	
	public Main(MainFrame mf) {
		this.mf = mf;
		// new Panel
		this.mainPanel = new JPanel();
		this.midPanel = new JPanel();
		this.lastPanel = new JPanel();

		//set Layout
		setLayout(new GridLayout(3,1));
		setBackground(Color.orange);
		
		// set visible
		//this.setVisible(true);

		// set MainPanel 
		mainPanel.setBackground(Color.orange);
		// set MidPanel
		midPanel.setLayout(new FlowLayout());
		midPanel.setBackground(Color.orange);
		// create Panel
		JLabel mainName = new JLabel("���� ���θ�");
		mainName.setFont(new Font("Serif", Font.BOLD, 11));
		mainName.setFont(mainName.getFont().deriveFont(64.0f));
		midPanel.add(mainName);
		midPanel.add(new JLabel(" "));
		// set lastPanel
		lastPanel.setLayout(new FlowLayout());
		lastPanel.setBackground(Color.orange);
		// create Button - "�޴�����"
		JButton openMenu = new JButton("�޴� ����");
		openMenu.setFont(new Font("�޴� ����",Font.PLAIN,20));
		openMenu.setPreferredSize(new Dimension(150,90));
		lastPanel.add(openMenu);
		//"�޴�����" �۵� ����
		openMenu.addActionListener(new MyActionListener());
		// create Button - "����"
		JButton closeButton = new JButton("����");
		closeButton.setFont(new Font("����",Font.PLAIN,20));
		closeButton.setPreferredSize(new Dimension(150,90));
		lastPanel.add(closeButton);
		closeButton.addActionListener(new OffListener());
		
		//add Panel
				add(this.mainPanel);
				add(this.midPanel);
				add(this.lastPanel);

	}
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.change("mainshow");
		}
	}
	class OffListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.dispose();
		}
	}
	
}

