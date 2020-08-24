import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;




class AddGoods extends JPanel{
	private GridBagLayout gL = new GridBagLayout();
	private MainFrame mf ;
	

	public AddGoods(MainFrame mf) {
		this.mf=mf;
		createAddGoods();
	}
	
	public void GLAdd(Component c, int x, int y, int w, int h, double z) {
		GridBagConstraints unknown = new GridBagConstraints();
		unknown.fill = GridBagConstraints.BOTH;
		unknown.gridx = x;
		unknown.gridy = y;
		unknown.gridwidth = w;
		unknown.gridheight = h;
		unknown.weighty = z;
		this.gL.setConstraints(c, unknown);
		this.add(c);
	}
	
	class MenuListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.change("mainshow");
		}
	}
	class OffListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mf.dispose();
		}
	}
	
	public void createAddGoods() {

		 		JPanel P1 = new JPanel();
		 		JPanel P2 = new JPanel();
		 		JPanel P3 = new JPanel();
		 		JPanel P4 = new JPanel();
		
				JLabel One = new JLabel("상품이름");
				JLabel Two = new JLabel("상품정보");
				JLabel Three = new JLabel("상품가격");
				JLabel Four = new JLabel("상품분류");
				
				JLabel Blank1 = new JLabel("        ");
				JLabel Blank2 = new JLabel("        ");
				JLabel Blank3 = new JLabel("        ");
				JLabel Blank4 = new JLabel("                                                 ");
				
				JTextField ForOne = new JTextField(20);
				JTextField ForTwo = new JTextField(20);
				JTextField ForThree = new JTextField(20);
				
				Vector<String> v = new Vector<String>();
				v.add("음식");
				v.add("도구");
				v.add("전자기기");
				
				JComboBox ForFour = new JComboBox(v);
				
				
				JPanel [] panel = {P1, P2, P3, P4};
				JLabel [] label = {One, Two, Three, Four};
				JLabel [] blank = {Blank1, Blank2, Blank3, Blank4};
				JTextField [] textfield = {ForOne, ForTwo, ForThree};

				JPanel Top = new JPanel();
				JPanel Category = new JPanel();
				JPanel Mid = new JPanel();
				JPanel Bottom = new JPanel();

				this.setLayout(this.gL);
				
				GLAdd(Top, 0, 0, 1, 1, 0.01);
				GLAdd(Category, 0, 1, 1, 1, 0.03);
				GLAdd(Mid, 0, 2, 1, 1, 0.92);
				GLAdd(Bottom, 0, 3, 1, 1, 0.04);
				
				Top.setVisible(true);
				Category.setVisible(true);
				Mid.setVisible(true);
				Bottom.setVisible(true);

				JButton Menu = new JButton();
				JButton Power = new JButton();
				JLabel Space = new JLabel("                                                                                                                        ");

				Menu.addActionListener(new MenuListener());
				Power.addActionListener(new OffListener());	
				
				// 크기지정
				Menu.setPreferredSize(new Dimension(40, 40));
				Power.setPreferredSize(new Dimension(40, 40));

				// 배치
				Top.add(Menu);
				Top.add(Space);
				Top.add(Power);
				
				
				JLabel Explain = new JLabel("상 품 추 가");
				
				Category.add(Explain);
				
				
				Mid.setLayout(new GridLayout(4, 1, 0, 0));
				
				for(int i = 0; i < 4; i++) {
					if(i < 3) {
						Mid.add(panel[i]);
						panel[i].add(label[i]);
						panel[i].add(blank[i]);
						panel[i].add(textfield[i]);
					}
					else {
						Mid.add(panel[i]);
						panel[i].add(label[i]);
						panel[i].add(blank[i]);
						panel[i].add(ForFour);
					}
				}
				
				JButton Enter = new JButton("정보입력");
				Enter.setPreferredSize(new Dimension(120, 50));
				Bottom.add(Enter);
				
				
				ActionListener ForEnter = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						VectorMethod vm = new VectorMethod();
						Vector<String> name = new Vector<String>();
						Vector<String> weight = new Vector<String>();
						Vector<Integer> price = new Vector<Integer>();
						
						if(ForFour.getSelectedItem().equals("음식")) {
							vm.RFN(name);
							vm.RFW(weight);
							vm.RFP(price);
							if(name.size() < 6) {
							name.add(ForOne.getText());
							weight.add(ForTwo.getText());
							String p = ForThree.getText();
							int i = Integer.parseInt(p);
							price.add(i);
							vm.WFN(name);
							vm.WFW(weight);
							vm.WFP(price);}
						}
						else if(ForFour.getSelectedItem().equals("도구")) {
							vm.RTN(name);
							vm.RTW(weight);
							vm.RTP(price);
							if(name.size() < 6) {
							name.add(ForOne.getText());
							weight.add(ForTwo.getText());
							String p = ForThree.getText();
							int i = Integer.parseInt(p);
							price.add(i);
							vm.WTN(name);
							vm.WTW(weight);
							vm.WTP(price);}
						}
						else {
							vm.RMN(name);
							vm.RMW(weight);
							vm.RMP(price);
							if(name.size() < 6) {
							name.add(ForOne.getText());
							weight.add(ForTwo.getText());
							String p = ForThree.getText();
							int i = Integer.parseInt(p);
							price.add(i);
							vm.WMN(name);
							vm.WMW(weight);
							vm.WMP(price);}
						}
						ForOne.setText("");
						ForTwo.setText("");
						ForThree.setText("");
					}
				};
				
				Enter.addActionListener(ForEnter);
				
				setVisible(true);
				
				class MyActionListener implements ActionListener{
					public void actionPerformed(ActionEvent e) {
						mf.change("main");
						}

				}
				
				}
}
