import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AllGoodsShow extends JPanel {
	private MainFrame mf;
	JPanel Top = new JPanel();
	private GridBagLayout gL = new GridBagLayout();
	JPanel Bottom = new JPanel();
	public AllGoodsShow(MainFrame mf) {
		this.mf = mf;
		
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
		JLabel MenuExplain = new JLabel("모든품목");
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
		
		
		Bottom.setLayout(new GridLayout(0,1,10,10));
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
				JLabel jla = new JLabel("카테고리: Food  "+" "+"품명: "+fn+fw+"  "+fp);
				Bottom.add(jla);
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
				JLabel jla = new JLabel("카테고리: Tools  "+" "+"품명: "+fn+fw+"  "+fp);
				Bottom.add(jla);
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
				JLabel jla = new JLabel("카테고리: Mobile Device   품명: "+fn+fw+"  "+fp);
				Bottom.add(jla);
				sum++;
				deviceSum++;
		
	}
}catch(IOException e ) {
	
}
		JLabel allJL = new JLabel(" 음식 수량: "+foodSum+" 도구 수량: "+toolSum+" 전자기기 수량: "+deviceSum);
		JLabel allJL2 = new JLabel("총 수량: "+sum+" 총 가격: "+priceSum);
		Bottom.add(new JLabel(""));
		Bottom.add(allJL);
		Bottom.add(allJL2);
		this.add(Bottom);
		
	}
}
