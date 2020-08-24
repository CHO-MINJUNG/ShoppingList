import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


class ShopInfo extends JPanel {
	String name;
	String weight;
	String price;
	JButton remo = new JButton("삭제");
	JButton pur = new JButton("구매");
	ShopInfo(String name,String weight, String price){
//		this.setSize(500, 500);
		this.name=name;
		this.price=price;
		this.weight = weight;
		this.setLayout(new GridLayout(1,5));
		this.add(new JLabel(name));
		this.add(new JLabel(weight));
		this.add(new JLabel(price));
		this.add(remo);
		this.add(pur);
	}
}



public class ShoppingList extends JPanel {
	private MainFrame mf;
	JPanel Top = new JPanel();
	private GridBagLayout gL = new GridBagLayout();
	JPanel Bottom = new JPanel();
	Vector<String> vname = new Vector<String>();
	Vector<String> vweight = new Vector<String>();
	Vector<String> vprice = new Vector<String>();
	
	Vector<String> purName = new Vector<String>();
	Vector<String> purPrice = new Vector<String>();
	public ShoppingList() {}
	
	
	public ShoppingList(MainFrame mf) {
		this.mf = mf;
		try {
			FileReader in = new FileReader("ShoppingList(name).txt");
			Scanner sc = new Scanner(in);
			while(sc.hasNext()) {
				vname.add(sc.nextLine());
			}
			in.close();
			FileReader in2 = new FileReader("ShoppingList(weight).txt");
			Scanner sc2 = new Scanner(in2);
			while(sc2.hasNext()) {
				vweight.add(sc2.nextLine());
			}
			in2.close();
			FileReader in3 = new FileReader("ShoppingList(price).txt");
			Scanner sc3 = new Scanner(in3);
			while(sc3.hasNext()) {
				vprice.add(sc3.nextLine());
			}
			in3.close();

		}catch(IOException e) {
			System.out.println("파일입출력오류");
		}
		
		ShopInfo sh[] = new ShopInfo[vname.size()];
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
		
		
		Top.setLayout(gL);
		JButton Menu = new JButton();
		JButton Power = new JButton();
		JLabel MenuExplain = new JLabel("장바구니");
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


		// 쇼핑리스트 부분 UI
		Bottom.setLayout(new GridLayout(0,1));
		for(int i=0; i<vname.size();i++) {
			sh[i] = new ShopInfo(vname.elementAt(i),vweight.elementAt(i),vprice.elementAt(i));
			Bottom.add(sh[i]);
		}		
		this.add(Bottom);
				
		// 삭제 버튼
		
		for(int i=0; i<vname.size(); i++) {
			removeListener removeL = new removeListener();
			removeL.getnum(i);
			sh[i].remo.addActionListener(removeL);
		}
		// 구매 버튼
		for(int i=0; i<vname.size(); i++) {
			purchaseListener purchaseL = new purchaseListener();
			purchaseL.getnum(i);
			sh[i].pur.addActionListener(purchaseL);
		}
	}
	
	// 삭제 버튼 동작
	class removeListener implements ActionListener{
		int setN = 0;
		public void getnum(int t) {
			this.setN=t;
		}
		public void actionPerformed(ActionEvent e) {
			vname.remove(setN);
			vweight.remove(setN);
			vprice.remove(setN);
			try {
				FileWriter out = new FileWriter("ShoppingList(name).txt");
				for(int i=0;i<vname.size();i++) {
					out.write(vname.elementAt(i),0,vname.elementAt(i).length());
					out.write("\r\n",0,2);
				}
				out.close();
			}catch(IOException t) {
				System.out.println();
			}
			try {
				FileWriter out2 = new FileWriter("ShoppingList(price).txt");
				for(int i=0;i<vprice.size();i++) {
					out2.write(vprice.elementAt(i),0,vprice.elementAt(i).length());
					out2.write("\r\n",0,2);
				}
				out2.close();
			}catch(IOException t) {
				System.out.println();
			}
			try {
				FileWriter out3 = new FileWriter("ShoppingList(weight).txt");
				for(int i=0;i<vweight.size();i++) {
					out3.write(vweight.elementAt(i),0,vweight.elementAt(i).length());
					out3.write("\r\n",0,2);
				}
				out3.close();
			}catch(IOException t) {
				System.out.println();
			}
			mf.change("shoppinglist");
		}
	}
	
	// 구매버튼 동작
	class purchaseListener implements ActionListener{
		int setN = 0;
		public void getnum(int t) {
			this.setN=t;
		}
		public void actionPerformed(ActionEvent e) {
			if(purName.size()==0) {
				try {
					FileReader frname = new FileReader("PurchaseList(name).TXT");
					FileReader frprice = new FileReader("PurchaseList(price).TXT");
					Scanner frnameSc = new Scanner(frname);
					Scanner frpriceSc = new Scanner(frprice);
					int sum=0;
					while(frnameSc.hasNext()) {
						purName.add(frnameSc.next());
						purPrice.add(frpriceSc.next());
						sum++;
					}
				}catch(IOException efrname) {
					
				}
				
				
			}
			
			
			purName.add(vname.elementAt(setN));
			purPrice.add(vprice.elementAt(setN));
			try {
				FileWriter out = new FileWriter("PurchaseList(name).TXT");
					for(int i=0; i<purName.size(); i++) {
						out.write(purName.elementAt(i),0,purName.elementAt(i).length());
						out.write("\r\n",0,2);	
					}
					
				out.close();
			}catch(IOException ep) {
				System.out.println("입출력오류");
			}
			try {
				FileWriter out2 = new FileWriter("PurchaseList(price).TXT");
				for(int i=0; i<purPrice.size(); i++) {
					out2.write(purPrice.elementAt(i),0,purPrice.elementAt(i).length());
					out2.write("\r\n",0,2);	
				}
				out2.close();
			}catch(IOException t) {
				System.out.println();
			}
		}
	}
	
	
}

				