import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;




class RemoveGoods extends JPanel{
	private GridBagLayout gL = new GridBagLayout();
	private MainFrame mf ;
	

	public RemoveGoods(MainFrame mf) {
		this.mf=mf;
		createRemoveGoods();
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
	
	public void createRemoveGoods() {

		 		JPanel P1 = new JPanel();
		 		JPanel P2 = new JPanel();
		 		JPanel P4 = new JPanel();
		
				JLabel One = new JLabel("��ǰ�̸�");
				JLabel Two = new JLabel("");
				JLabel Four = new JLabel("��ǰ�з�");
				
				JLabel Blank1 = new JLabel("        ");
				JLabel Blank2 = new JLabel("");
				JLabel Blank4 = new JLabel("                                                 ");
				
				JTextField ForOne = new JTextField(20);
				
				Vector<String> v = new Vector<String>();
				v.add("����");
				v.add("����");
				v.add("���ڱ��");
				
				JComboBox ForFour = new JComboBox(v);
				
				
				JPanel [] panel = {P2, P1, P4};
				JLabel [] label = {Two, One, Four};
				JLabel [] blank = {Blank2, Blank1, Blank4};
				JTextField [] textfield = {ForOne};

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

				// ũ������
				Menu.setPreferredSize(new Dimension(40, 40));
				Power.setPreferredSize(new Dimension(40, 40));

				// ��ġ
				Top.add(Menu);
				Top.add(Space);
				Top.add(Power);
				
				Menu.addActionListener(new MenuListener());
				Power.addActionListener(new OffListener());	
				
				
				JLabel Explain = new JLabel("�� ǰ �� ��");
				
				Category.add(Explain);
				
				
				Mid.setLayout(new GridLayout(3, 1, 0, 0));
				
				for(int i = 0; i < 3; i++) {
					if(i < 1) {
						Mid.add(panel[i]);
						panel[i].add(label[i]);
						panel[i].add(blank[i]);
					}
					else if(i < 2) {
						Mid.add(panel[i]);
						panel[i].add(label[i]);
						panel[i].add(blank[i]);
						panel[i].add(textfield[i-1]);
					}
					else {
						Mid.add(panel[i]);
						panel[i].add(label[i]);
						panel[i].add(blank[i]);
						panel[i].add(ForFour);
					}
				}
				
				JButton Enter = new JButton("�����Է�");
				Enter.setPreferredSize(new Dimension(120, 50));
				Bottom.add(Enter);
				
				
				ActionListener ForEnter = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						VectorMethod vm = new VectorMethod();
						Vector<String> name = new Vector<String>();
						Vector<String> weight = new Vector<String>();
						Vector<Integer> price = new Vector<Integer>();
						
						if(ForFour.getSelectedItem().equals("����")) {
							vm.RFN(name);
							vm.RFW(weight);
							vm.RFP(price);
							for(int i = 0; i < name.size(); i++) {
								if(ForOne.getText().equals(name.get(i))) {
									name.remove(i);
									weight.remove(i);
									price.remove(i);
								}
								
							}
							vm.WFN(name);
							vm.WFW(weight);
							vm.WFP(price);
						}
						else if(ForFour.getSelectedItem().equals("����")) {
							vm.RTN(name);
							vm.RTW(weight);
							vm.RTP(price);
							if(name.size() < 6) {
								for(int i = 0; i < name.size(); i++) {
									if(ForOne.getText().equals(name.get(i))) {
										name.remove(i);
										weight.remove(i);
										price.remove(i);
									}
									
								}}
							vm.WTN(name);
							vm.WTW(weight);
							vm.WTP(price);
						}
						else {
							vm.RMN(name);
							vm.RMW(weight);
							vm.RMP(price);
							for(int i = 0; i < name.size(); i++) {
								if(ForOne.getText().equals(name.get(i))) {
									name.remove(i);
									weight.remove(i);
									price.remove(i);
								}
								
							}
							vm.WMN(name);
							vm.WMW(weight);
							vm.WMP(price);
						}
						ForOne.setText("");
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
