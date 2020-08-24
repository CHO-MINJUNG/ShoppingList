import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MainShow extends JPanel {
	private MainFrame mf ;
	private GridBagLayout gL = new GridBagLayout();

	JPanel Top =new JPanel();
	JPanel Bottom = new JPanel();
	JButton showGoods= new JButton("��ǰ ����");
	JButton showAdd= new JButton("��ǰ �߰�");
	JButton showRemove= new JButton("��ǰ ����");
	JButton shoppingList= new JButton("��ٱ���");
	JButton purchaseList= new JButton("���� ���");
	JButton allgoodsshow = new JButton("��� ǰ�� ����");
	
	class OffListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.dispose();
		}
	}
	

	
	public MainShow(MainFrame mf) {
		this.mf = mf;
		Top.setLayout(gL);
		JButton Menu = new JButton();
		JButton Power = new JButton();
		JLabel MenuExplain = new JLabel("�� ��");
		JLabel LeftSpace = new JLabel("                                                        ");
		JLabel RightSpace = new JLabel("                                                        ");

		// ũ������
		Menu.setPreferredSize(new Dimension(40, 40));
		Power.setPreferredSize(new Dimension(40, 40));
		
		
		Top.add(Menu);
		Top.add(LeftSpace);
		Top.add(MenuExplain);
		Top.add(RightSpace);
		Top.add(Power);
		
		Power.addActionListener(new OffListener());	
		
			GridBagConstraints unknown = new GridBagConstraints();
			unknown.fill = GridBagConstraints.BOTH;
			unknown.gridx = 0;
			unknown.gridy = 0;
			unknown.gridwidth = 1;
			unknown.gridheight = 1;
			unknown.weighty = 0.01;
			this.gL.setConstraints(Top, unknown);
			this.add(Top);
			
			
		// �ؿ��κ� ��ġ
			showGoods.setPreferredSize(new Dimension(400,80));
			showAdd.setPreferredSize(new Dimension(400,80));
			showRemove.setPreferredSize(new Dimension(400,80));
			shoppingList.setPreferredSize(new Dimension(400,80));
			purchaseList.setPreferredSize(new Dimension(400,80));
			allgoodsshow.setPreferredSize(new Dimension(400,80));
			
			//�غκ� ����
			Bottom.setLayout(new GridLayout(7,1,20,20));
			Bottom.add(showGoods);
			Bottom.add(showAdd);
			Bottom.add(showRemove);
			Bottom.add(shoppingList);
			Bottom.add(purchaseList);
			Bottom.add(allgoodsshow);
			
			//��ư �׼� ����
			showGoods.addActionListener(new goodsListener());
			Menu.addActionListener(new mainListener());
			showAdd.addActionListener(new addListener());
			showRemove.addActionListener(new removeListener());
			shoppingList.addActionListener(new shoppingListener());
			purchaseList.addActionListener(new purchaseListener());
			allgoodsshow.addActionListener(new allgoodsListener());
			
			this.add(Top);
			this.add(Bottom);

			
}
	class goodsListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.change("goodsshow");
		}
}
	class allgoodsListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.change("allgoodsshow");
		}
	}
	class purchaseListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.change("purchaselist");
		}
}
	class mainListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.change("main");
		}
}
	class addListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.change("addgoods");
		}
	}
	class removeListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.change("removegoods");
		}
	}
	class shoppingListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.change("shoppinglist");
		}
	}
}
