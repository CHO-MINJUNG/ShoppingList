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
	JButton showGoods= new JButton("상품 보기");
	JButton showAdd= new JButton("상품 추가");
	JButton showRemove= new JButton("상품 제거");
	JButton shoppingList= new JButton("장바구니");
	JButton purchaseList= new JButton("구매 목록");
	JButton allgoodsshow = new JButton("모든 품목 보기");
	
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
		JLabel MenuExplain = new JLabel("메 뉴");
		JLabel LeftSpace = new JLabel("                                                        ");
		JLabel RightSpace = new JLabel("                                                        ");

		// 크기지정
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
			
			
		// 밑에부분 배치
			showGoods.setPreferredSize(new Dimension(400,80));
			showAdd.setPreferredSize(new Dimension(400,80));
			showRemove.setPreferredSize(new Dimension(400,80));
			shoppingList.setPreferredSize(new Dimension(400,80));
			purchaseList.setPreferredSize(new Dimension(400,80));
			allgoodsshow.setPreferredSize(new Dimension(400,80));
			
			//밑부분 설정
			Bottom.setLayout(new GridLayout(7,1,20,20));
			Bottom.add(showGoods);
			Bottom.add(showAdd);
			Bottom.add(showRemove);
			Bottom.add(shoppingList);
			Bottom.add(purchaseList);
			Bottom.add(allgoodsshow);
			
			//버튼 액션 설정
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
