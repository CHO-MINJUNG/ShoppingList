import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



class GoodsShow extends JPanel {
	private GridBagLayout gL = new GridBagLayout();
	private GridBagLayout gL2= new GridBagLayout();
	private MainFrame mf ;
	JScrollPane scrollpane ;
	
	// 쇼핑카트추가 메소드
	public void ShoppingAdd(String name, String weight, String price) {
		try {
			FileWriter out1 = new FileWriter("ShoppingList(name).txt");
			FileWriter out2 = new FileWriter("ShoppingList(weight).txt");
			FileWriter out3 = new FileWriter("ShoppingList(price).txt");
			
			out1.write(name);
			out2.write(weight);
			out3.write(price);
			out1.write("\r\n",0,2);
			out2.write("\r\n",0,2);
			out3.write("\r\n",0,2);
			
		}catch(IOException e) {
			System.out.println("제대로 입력해");
		}
	}

	public GoodsShow(MainFrame mf) {
		this.mf=mf;
		createGoodsShow();
	}

	//버튼 액션 설정
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

	public void GLAdd2(JPanel b, Component c, int x, int y, int w, int h, double z1, double z2) {
		GridBagConstraints unknown = new GridBagConstraints();
		unknown.fill = GridBagConstraints.BOTH;
		unknown.gridx = x;
		unknown.gridy = y;
		unknown.gridwidth = w;
		unknown.gridheight = h;
		unknown.weightx = z1;
		unknown.weighty = z2;
		this.gL2.setConstraints(c, unknown);
		b.add(c);
	}

	public void createGoodsShow() {
		// Mid구역분할
		JPanel OneBox = new JPanel();
		JPanel TwoBox = new JPanel();
		JPanel ThreeBox = new JPanel();
		JPanel FourBox = new JPanel();
		JPanel FiveBox = new JPanel();
		JPanel SixBox = new JPanel();

		// 구성요소 생성
		JLabel One1 = new JLabel();
		JLabel One2 = new JLabel();
		JLabel One3 = new JLabel();
		JLabel One4 = new JLabel();
		JLabel One5 = new JLabel();
		JButton One6 = new JButton("추가");

		JLabel Two1 = new JLabel();
		JLabel Two2 = new JLabel();
		JLabel Two3 = new JLabel();
		JLabel Two4 = new JLabel();
		JLabel Two5 = new JLabel();
		JButton Two6 = new JButton("추가");

		JLabel Three1 = new JLabel();
		JLabel Three2 = new JLabel();
		JLabel Three3 = new JLabel();
		JLabel Three4 = new JLabel();
		JLabel Three5 = new JLabel();
		JButton Three6 = new JButton("추가");

		JLabel Four1 = new JLabel();
		JLabel Four2 = new JLabel();
		JLabel Four3 = new JLabel();
		JLabel Four4 = new JLabel();
		JLabel Four5 = new JLabel();
		JButton Four6 = new JButton("추가");

		JLabel Five1 = new JLabel();
		JLabel Five2 = new JLabel();
		JLabel Five3 = new JLabel();
		JLabel Five4 = new JLabel();
		JLabel Five5 = new JLabel();
		JButton Five6 = new JButton("추가");

		JLabel Six1 = new JLabel();
		JLabel Six2 = new JLabel();
		JLabel Six3 = new JLabel();
		JLabel Six4 = new JLabel();
		JLabel Six5 = new JLabel();
		JButton Six6 = new JButton("추가");

		// Mid요소 리스트화
		JPanel[] Box = { OneBox, TwoBox, ThreeBox, FourBox, FiveBox, SixBox };
		JLabel[] NameLabel = { One1, Two1, Three1, Four1, Five1, Six1 };
		JLabel[] WeightLabel = { One2, Two2, Three2, Four2, Five2, Six2 };
		JLabel[] BlankLabel1 = { One3, Two3, Three3, Four3, Five3, Six3 };
		JLabel[] PriceLabel = { One4, Two4, Three4, Four4, Five4, Six4 };
		JLabel[] BlankLabel2 = { One5, Two5, Three5, Four5, Five5, Six5 };
		JButton[] AddButton = { One6, Two6, Three6, Four6, Five6, Six6 };
		
		
		// Button 액션
		class AddButtonAction1 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				
			}
		}
		class AddButtonAction2 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				mf.change("mainshow");
			}
		}
		class AddButtonAction3 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				mf.change("mainshow");
			}
		}
		class AddButtonAction4 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				mf.change("mainshow");
			}
		}
		class AddButtonAction5 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				mf.change("mainshow");
			}
		}
		class AddButtonAction6 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				mf.change("mainshow");
			}
		}
		

		// 4분류
		JPanel Top = new JPanel();
		JPanel Category = new JPanel();
		JPanel Mid = new JPanel();
		JPanel Bottom = new JPanel();

		this.setLayout(this.gL);


		// Top설정
		// Top의 버튼, 텍스트필드, 라벨제작.(라벨은 버튼과 텍스트필드 사이의 디자인을 위한 공백)
		JButton Menu = new JButton();
		JTextField SearchWrite = new JTextField("검색할 상품을 입력하세요", 24);
		JButton SearchEnter = new JButton();
		JButton Power = new JButton();
		JLabel LeftSpace = new JLabel("        "); // 공백 8칸
		JLabel RightSpace = new JLabel("        "); // 공백 8칸

		// 크기지정
		Menu.setPreferredSize(new Dimension(40, 40));
		Power.setPreferredSize(new Dimension(40, 40));
		SearchEnter.setPreferredSize(new Dimension(43, 22));

		//버튼 액션 설정
		Menu.addActionListener(new MyActionListener());
		Power.addActionListener(new OffListener());	

		// 배치
		Top.add(Menu);
		Top.add(LeftSpace);
		Top.add(SearchWrite);
		Top.add(SearchEnter);
		Top.add(RightSpace);
		Top.add(Power);

		// Category 버튼 생성
		JButton Food = new JButton("음식");
		JButton Tools = new JButton("도구");
		JButton MoblieDevice = new JButton("전자기기");

		Category.setLayout(new GridLayout(1, 4, 11, 0));

		// Category 버튼 추가
		Category.add(Food);
		Category.add(Tools);
		Category.add(MoblieDevice);

		// Mid설정
		Mid.setLayout(new GridLayout(6, 1, 0, 0));

		// 버튼 외 표기
		for (int i = 0; i < 6; i++) {
			Mid.add(Box[i]);
			AddButton[i].setSize(50, 30);
			Box[i].setLayout(this.gL2);
			GLAdd2(Box[i], NameLabel[i], 0, 0, 1, 1, 0.0, 0.9);
			GLAdd2(Box[i], WeightLabel[i], 1, 0, 1, 1, 0.0, 0.9);
			GLAdd2(Box[i], BlankLabel1[i], 2, 0, 1, 1, 0.9, 0.9);
			GLAdd2(Box[i], PriceLabel[i], 3, 0, 1, 1, 0.1, 0.9);
			GLAdd2(Box[i], BlankLabel2[i], 2, 1, 3, 1, 0.7, 0.1);
			GLAdd2(Box[i], AddButton[i], 3, 1, 1, 1, 0.0, 0.1);
			Box[i].setVisible(true);
			NameLabel[i].setVisible(true);
			WeightLabel[i].setVisible(true);
			PriceLabel[i].setVisible(true);
			BlankLabel2[i].setVisible(true);
			AddButton[i].setVisible(true);
		}

		// 배치 및 비율조정
		GLAdd(Top, 0, 0, 1, 1, 0.01);
		GLAdd(Category, 0, 1, 1, 1, 0.03);
		GLAdd(Mid, 0, 2, 1, 1, 0.92);
		GLAdd(Bottom, 0, 3, 1, 1, 0.04);

		Top.setVisible(true);
		Category.setVisible(true);
		Mid.setVisible(true);
		Bottom.setVisible(true);










		ActionListener BeFood = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				VectorMethod v = new VectorMethod();
				Vector<String> NameVector = new Vector<String>();
				Vector<String> WeightVector = new Vector<String>();
				Vector<Integer> PriceVector = new Vector<Integer>();
				v.RFN(NameVector);
				v.RFW(WeightVector);
				v.RFP(PriceVector);

				for(int i = 0; i < 6; i++) {
					if(i <= NameVector.size() - 1) {
						NameLabel[i].setText(NameVector.get(i));
						WeightLabel[i].setText(WeightVector.get(i));
						//int를 string으로 변환
						int Price = PriceVector.get(i);
						String P = Integer.toString(Price);				
						PriceLabel[i].setText(P);

						NameLabel[i].setVisible(true);
						WeightLabel[i].setVisible(true);
						PriceLabel[i].setVisible(true);
						AddButton[i].setVisible(true);

					}
					else {
						NameLabel[i].setText("");
						WeightLabel[i].setText("");
						PriceLabel[i].setText("");
						NameLabel[i].setVisible(false);
						WeightLabel[i].setVisible(false);
						PriceLabel[i].setVisible(false);
						AddButton[i].setVisible(false);

					}
				}
				
				Food.setBackground(Color.yellow);
				Tools.setBackground(null);
				MoblieDevice.setBackground(null);
			}

		};
		Food.addActionListener(BeFood);



		ActionListener BeTools = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//txt불러오기
				VectorMethod v = new VectorMethod();
				Vector<String> NameVector = new Vector<String>();
				Vector<String> WeightVector = new Vector<String>();
				Vector<Integer> PriceVector = new Vector<Integer>();
				v.RTN(NameVector);
				v.RTW(WeightVector);
				v.RTP(PriceVector);

				for(int i = 0; i < 6; i++) {
					if(i <= NameVector.size() - 1) {
						NameLabel[i].setText(NameVector.get(i));
						WeightLabel[i].setText(WeightVector.get(i));
						//int를 string으로 변환
						int Price = PriceVector.get(i);
						String P = Integer.toString(Price);				
						PriceLabel[i].setText(P);

						NameLabel[i].setVisible(true);
						WeightLabel[i].setVisible(true);
						PriceLabel[i].setVisible(true);
						AddButton[i].setVisible(true);

					}
					else {
						NameLabel[i].setText("");
						WeightLabel[i].setText("");
						PriceLabel[i].setText("");
						NameLabel[i].setVisible(false);
						WeightLabel[i].setVisible(false);
						PriceLabel[i].setVisible(false);
						AddButton[i].setVisible(false);

					}
				}
				Food.setBackground(null);
				Tools.setBackground(Color.yellow);
				MoblieDevice.setBackground(null);
			}
		};

		Tools.addActionListener(BeTools);

		ActionListener BeMoblieDevice = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//txt불러오기
				VectorMethod v = new VectorMethod();
				Vector<String> NameVector = new Vector<String>();
				Vector<String> WeightVector = new Vector<String>();
				Vector<Integer> PriceVector = new Vector<Integer>();
				v.RMN(NameVector);
				v.RMW(WeightVector);
				v.RMP(PriceVector);

				for(int i = 0; i < 6; i++) {
					if(i <= NameVector.size() - 1) {
						NameLabel[i].setText(NameVector.get(i));
						WeightLabel[i].setText(WeightVector.get(i));
						//int를 string으로 변환
						int Price = PriceVector.get(i);
						String P = Integer.toString(Price);				
						PriceLabel[i].setText(P);

						NameLabel[i].setVisible(true);
						WeightLabel[i].setVisible(true);
						PriceLabel[i].setVisible(true);
						AddButton[i].setVisible(true);

					}
					else {
						NameLabel[i].setText("");
						WeightLabel[i].setText("");
						PriceLabel[i].setText("");
						NameLabel[i].setVisible(false);
						WeightLabel[i].setVisible(false);
						PriceLabel[i].setVisible(false);
						AddButton[i].setVisible(false);

					}
				}
				Food.setBackground(null);
				Tools.setBackground(null);
				MoblieDevice.setBackground(Color.yellow);}
		};

		MoblieDevice.addActionListener(BeMoblieDevice);

		ActionListener AllButton = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Mid.removeAll();
				Mid.setLayout(new GridLayout(0,1));
				int foodSum = 0;
				int toolSum = 0;
				int deviceSum = 0;
				int priceSum = 0;
				int sum=0;
				try {
					
					FileInputStream fr = new FileInputStream("Food(name).txt");
					InputStreamReader FoodRea = new InputStreamReader(fr, "UTF-8");
					FileInputStream fr2 = new FileInputStream("Food(weight).txt");
					InputStreamReader FoodRea2 = new InputStreamReader(fr2, "UTF-8");
					FileInputStream fr3 = new FileInputStream("Food(price).txt");
					InputStreamReader FoodRea3 = new InputStreamReader(fr3, "UTF-8");
					
					Scanner frsc = new Scanner(FoodRea);
					Scanner frsc2 = new Scanner(FoodRea2);
					Scanner frsc3 = new Scanner(FoodRea3) ;
					while(frsc.hasNext()) {
						String fn = frsc.nextLine();
						String fw = frsc2.nextLine();
						String fp = frsc3.nextLine();
						priceSum += Integer.valueOf(fp);
						JLabel jla = new JLabel("Fooe"+fn+fw+fp);
						Mid.add(jla);
						sum++;
						foodSum++;
					}
				}catch(IOException e1) {
					
				}
				try {
					FileInputStream fr = new FileInputStream("Tools(name).txt");
					InputStreamReader ToolRea = new InputStreamReader(fr, "UTF-8");
					FileInputStream fr2 = new FileInputStream("Tools(weight).txt");
					InputStreamReader ToolRea2 = new InputStreamReader(fr2, "UTF-8");
					FileInputStream fr3 = new FileInputStream("Tools(price).txt");
					InputStreamReader ToolRea3 = new InputStreamReader(fr3, "UTF-8");
					Scanner frsc = new Scanner(ToolRea);
					Scanner frsc2 = new Scanner(ToolRea2);
					Scanner frsc3 = new Scanner(ToolRea3) ;
					while(frsc.hasNext()) {
						String fn = frsc.nextLine();
						String fw = frsc2.nextLine();
						String fp = frsc3.nextLine();
						priceSum += Integer.valueOf(fp);
						JLabel jla = new JLabel("Tools"+fn+fw+fp);
						Mid.add(jla);
						sum++;
						toolSum++;
					}
				}catch(IOException e2) {
					
				}
				try {
					FileInputStream fr = new FileInputStream("Moblie Device(name).txt");
					InputStreamReader DeviceRea = new InputStreamReader(fr, "UTF-8");
					FileInputStream fr2 = new FileInputStream("Moblie Device(weight).txt");
					InputStreamReader DeviceRea2 = new InputStreamReader(fr2, "UTF-8");
					FileInputStream fr3 = new FileInputStream("Moblie Device(price).txt");
					InputStreamReader DeviceRea3 = new InputStreamReader(fr3, "UTF-8");
					Scanner frsc = new Scanner(DeviceRea);
					Scanner frsc2 = new Scanner(DeviceRea2);
					Scanner frsc3 = new Scanner(DeviceRea3) ;
					while(frsc.hasNext()) {
						String fn = frsc.nextLine();
						String fw = frsc2.nextLine();
						String fp = frsc3.nextLine();
						priceSum += Integer.valueOf(fp);
						JLabel jla = new JLabel("Mobile Device"+fn+fw+fp);
						Mid.add(jla);
						sum++;
						deviceSum++;
					}
				}catch(IOException e3) {
					
				}
				
				
				
				revalidate();
				repaint();
				
				
			}
				/*int total = 0;
				VectorMethod v = new VectorMethod();
				Vector<String> FN = new Vector<String>();
				Vector<String> FW = new Vector<String>();
				Vector<Integer> FP = new Vector<Integer>();
				Vector<String> TN = new Vector<String>();
				Vector<String> TW = new Vector<String>();
				Vector<Integer> TP = new Vector<Integer>();
				Vector<String> MN = new Vector<String>();
				Vector<String> MW = new Vector<String>();
				Vector<Integer> MP = new Vector<Integer>();
				v.RFN(FN);
				v.RFW(FW);
				v.RFP(FP);
				v.RTN(TN);
				v.RTW(TW);
				v.RTP(TP);
				v.RMN(MN);
				v.RMW(MW);
				v.RMP(MP);
				System.out.println("-------------------------------------------------------------------");
				System.out.println("모든 품목의 갯수 : " + (FN.size() + TN.size() + MN.size()) + "개");
				System.out.println("음식의 갯수 : " + FN.size() + "개   /  도구의 갯수 : " + TN.size() + "개   /  전자기기의 갯수 : " + MN.size() + "개");
				System.out.println("-------------------------------------------------------------------");
				for(int i =0; i < FN.size(); i++) {
					System.out.println(FN.get(i) + FW.get(i) + "   " + "[" + FP.get(i) + "원]");
				}
				for(int i =0; i < TN.size(); i++) {
					System.out.println(TN.get(i) + TW.get(i) + "   " + "[" + TP.get(i) + "원]");
				}
				for(int i =0; i < MN.size(); i++) {
					System.out.println(MN.get(i) + MW.get(i) + "   " + "[" + MP.get(i) + "원]");
				}
				for(int i =0; i < FN.size(); i++) {
					total += FP.get(i);
				}
				for(int i =0; i < TN.size(); i++) {
					total += TP.get(i);
				}
				for(int i =0; i < MN.size(); i++) {
					total += MP.get(i);
				}
				System.out.println("-------------------------------------------------------------------");
				System.out.println("총 합산 가격 : " + total);

			}
		};*/
			
		};
		
		VectorMethod SL = new VectorMethod();


		ActionListener AddShoppingList1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Vector<String> SLN = new Vector<String>();
				Vector<String> SLW = new Vector<String>();
				Vector<Integer> SLP = new Vector<Integer>();
				
				SL.RSL(SLN, SLW, SLP);
				String string = PriceLabel[0].getText();
				int i = Integer.parseInt(string);
				SL.WSL( NameLabel[0], WeightLabel[0], i);
			}
		};

		AddButton[0].addActionListener(AddShoppingList1);

		ActionListener AddShoppingList2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Vector<String> SLN = new Vector<String>();
				Vector<String> SLW = new Vector<String>();
				Vector<Integer> SLP = new Vector<Integer>();

				SL.RSL(SLN, SLW, SLP);
				String string = PriceLabel[1].getText();
				int i = Integer.parseInt(string);
				SL.WSL( NameLabel[1], WeightLabel[1], i);
			}
		};

		AddButton[1].addActionListener(AddShoppingList2);

		ActionListener AddShoppingList3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Vector<String> SLN = new Vector<String>();
				Vector<String> SLW = new Vector<String>();
				Vector<Integer> SLP = new Vector<Integer>();

				SL.RSL(SLN, SLW, SLP);
				String string = PriceLabel[2].getText();
				int i = Integer.parseInt(string);
				SL.WSL(NameLabel[2], WeightLabel[2], i);
			}
		};

		AddButton[2].addActionListener(AddShoppingList3);

		ActionListener AddShoppingList4 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Vector<String> SLN = new Vector<String>();
				Vector<String> SLW = new Vector<String>();
				Vector<Integer> SLP = new Vector<Integer>();

				SL.RSL(SLN, SLW, SLP);
				String string = PriceLabel[3].getText();
				int i = Integer.parseInt(string);
				SL.WSL(NameLabel[3], WeightLabel[3], i);
			}
		};

		AddButton[3].addActionListener(AddShoppingList4);

		ActionListener AddShoppingList5 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Vector<String> SLN = new Vector<String>();
				Vector<String> SLW = new Vector<String>();
				Vector<Integer> SLP = new Vector<Integer>();

				SL.RSL(SLN, SLW, SLP);
				String string = PriceLabel[4].getText();
				int i = Integer.parseInt(string);
				SL.WSL( NameLabel[4], WeightLabel[4], i);
			}
		};

		AddButton[4].addActionListener(AddShoppingList5);

		ActionListener AddShoppingList6 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Vector<String> SLN = new Vector<String>();
				Vector<String> SLW = new Vector<String>();
				Vector<Integer> SLP = new Vector<Integer>();

				SL.RSL(SLN, SLW, SLP);
				String string = PriceLabel[5].getText();
				int i = Integer.parseInt(string);
				SL.WSL( NameLabel[5], WeightLabel[5], i);
			}
		};

		AddButton[5].addActionListener(AddShoppingList6);
	}
}









