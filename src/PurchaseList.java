import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class PurInfo extends JPanel {
	String name;
	String price;
	Calendar date;
	PurInfo(String name,String price){
		this.name=name;
		this.price=price;
		this.date = Calendar.getInstance();
		this.setLayout(new GridLayout(1,3));
		this.add(new JLabel(name));
		this.add(new JLabel(price));
		this.add(new JLabel("구매 완료"));
	}
}

public class PurchaseList extends JPanel {
	private MainFrame mf;
	JPanel Top = new JPanel();
	private GridBagLayout gL = new GridBagLayout();
	JPanel Bottom = new JPanel();
	Vector<String> vname = new Vector<String>();
	Vector<String> vprice = new Vector<String>();
	
	public PurchaseList(MainFrame mf) {
		this.mf=mf;
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

		// 구매리스트 불러오기
		try {
			FileReader in = new FileReader("PurchaseList(name).TXT");
			Scanner sc = new Scanner(in);
			while(sc.hasNext()) {
				String str =sc.nextLine();
				vname.add(str);
			}
			in.close();
			FileReader in2 = new FileReader("PurchaseList(price).TXT");
			Scanner sc2 = new Scanner(in2);
			while(sc2.hasNext()) {
				vprice.add(sc2.nextLine());
			}
			in2.close();
		}catch(IOException e) {
			System.out.println("파일입출력오류");
		}
		// Top UI
		Top.setLayout(gL);
		JButton Menu = new JButton();
		JButton Power = new JButton();
		JLabel MenuExplain = new JLabel("구매목록");
		JLabel LeftSpace = new JLabel("                                                     ");
		JLabel RightSpace = new JLabel("                                                     ");

		// 크기지정
		Menu.setPreferredSize(new Dimension(40, 40));
		Power.setPreferredSize(new Dimension(40, 40));

		Menu.addActionListener(new MenuListener());
		Power.addActionListener(new OffListener());	

		Top.add(Menu);
		Top.add(LeftSpace);
		Top.add(MenuExplain);
		Top.add(RightSpace);
		Top.add(Power);	
		
		

		GridBagConstraints unknown = new GridBagConstraints();
		unknown.fill = GridBagConstraints.BOTH;
		unknown.gridx = 0;
		unknown.gridy = 0;
		unknown.gridwidth = 1;
		unknown.gridheight = 1;
		unknown.weighty = 0.01;
		this.gL.setConstraints(Top, unknown);
		this.add(Top);
		
		// 구매목록부분 UI
		Bottom.setLayout(new GridLayout(0,1));
		PurInfo ph[] = new PurInfo[vname.size()];
		for(int i=0; i<vname.size();i++) {
			ph[i] = new PurInfo(vname.elementAt(i),vprice.elementAt(i));
			Bottom.add(ph[i]);
		}		
		this.add(Bottom);
	}
}
