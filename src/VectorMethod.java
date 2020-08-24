import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JLabel;

public class VectorMethod {
	Vector<String> shopvec = new Vector<String>();
	Vector<String> shopvec2 = new Vector<String>();
	Vector<String> shopvec3 = new Vector<String>();
	public VectorMethod() {
		
	}
	
	//음식이름 불러오기
	public void RFN(Vector<String> c) {
		c.clear();
		
		try {
			FileInputStream NameFile = new FileInputStream("Food(name).txt");
			
			InputStreamReader NameReader = new InputStreamReader(NameFile, "UTF-8");
			
			BufferedReader bufReader = new BufferedReader(NameReader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
				c.add(line);
			}
			bufReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	//도구이름 불러오기
	public void RTN(Vector<String> c) {
		c.clear();
		
		try {
			FileInputStream NameFile = new FileInputStream("Tools(name).txt");
			
			InputStreamReader NameReader = new InputStreamReader(NameFile, "UTF-8");
			
			BufferedReader bufReader = new BufferedReader(NameReader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
				c.add(line);
			}
			bufReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	//전자기기이름 불러오기
	public void RMN(Vector<String> c) {
		c.clear();
		
		try {
			FileInputStream NameFile = new FileInputStream("Moblie Device(name).txt");
			
			InputStreamReader NameReader = new InputStreamReader(NameFile, "UTF-8");
			
			BufferedReader bufReader = new BufferedReader(NameReader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
				c.add(line);
			}
			bufReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

	
	//음식무게 불러오기
	public void RFW(Vector<String> c) {
		c.clear();
		
		try {
			FileInputStream WeightFile = new FileInputStream("Food(weight).txt");
			
			InputStreamReader WeightReader = new InputStreamReader(WeightFile, "UTF-8");
			
			BufferedReader bufReader = new BufferedReader(WeightReader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
				c.add(line);
			}
			bufReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	//도구무게 불러오기
	public void RTW(Vector<String> c) {
		c.clear();
		
		try {
			FileInputStream WeightFile = new FileInputStream("Tools(weight).txt");
			
			InputStreamReader WeightReader = new InputStreamReader(WeightFile, "UTF-8");
			
			BufferedReader bufReader = new BufferedReader(WeightReader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
				c.add(line);
			}
			bufReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	//전자기기무게 불러오기
	public void RMW(Vector<String> c) {
		c.clear();
		
		try {
			FileInputStream WeightFile = new FileInputStream("Moblie Device(weight).txt");
			
			InputStreamReader WeightReader = new InputStreamReader(WeightFile, "UTF-8");
			
			BufferedReader bufReader = new BufferedReader(WeightReader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
				c.add(line);
			}
			bufReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	
	
	//음식가격 불러오기
	public void RFP(Vector<Integer> c) {
		c.clear();
		
		try {
			FileInputStream PriceFile = new FileInputStream("Food(Price).txt");
			
			InputStreamReader PriceReader = new InputStreamReader(PriceFile, "UTF-8");
			
			BufferedReader bufReader = new BufferedReader(PriceReader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
					int lineint = Integer.parseInt(line);
					c.add(lineint);

			}
			bufReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	//도구가격 불러오기
	public void RTP(Vector<Integer> c) {
		c.clear();
		
		try {
			FileInputStream PriceFile = new FileInputStream("Tools(Price).txt");
			
			InputStreamReader PriceReader = new InputStreamReader(PriceFile, "UTF-8");
			
			BufferedReader bufReader = new BufferedReader(PriceReader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
					int lineint = Integer.parseInt(line);
					c.add(lineint);

			}
			bufReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	//전자기기가격 불러오기
	public void RMP(Vector<Integer> c) {
		c.clear();
		
		try {
			FileInputStream PriceFile = new FileInputStream("Moblie Device(Price).txt");
			
			InputStreamReader PriceReader = new InputStreamReader(PriceFile, "UTF-8");
			
			BufferedReader bufReader = new BufferedReader(PriceReader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
					int lineint = Integer.parseInt(line);
					c.add(lineint);

			}
			bufReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	
	//음식이름 저장하기
	public void WFN(Vector<String> c) {
		
		try {
			for(int i = 0; i < c.size(); i++) {
				if(i == 0) {
					FileOutputStream NameWriter = new FileOutputStream("Food(name).txt");
					OutputStreamWriter pls = new OutputStreamWriter(NameWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i > 0 && i < c.size() - 1) {
					FileOutputStream NameWriter = new FileOutputStream("Food(name).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(NameWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i == c.size() - 1) {
					FileOutputStream NameWriter = new FileOutputStream("Food(name).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(NameWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.close();
				}
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		}
	
	//도구이름 저장하기
	public void WTN(Vector<String> c) {
		
		try {
			for(int i = 0; i < c.size(); i++) {
				if(i == 0) {
					FileOutputStream NameWriter = new FileOutputStream("Tools(name).txt");
					OutputStreamWriter pls = new OutputStreamWriter(NameWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i > 0 && i < c.size() - 1) {
					FileOutputStream NameWriter = new FileOutputStream("Tools(name).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(NameWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i == c.size() - 1) {
					FileOutputStream NameWriter = new FileOutputStream("Tools(name).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(NameWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.close();
				}
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		}
	
	//전자기기이름 저장하기
	public void WMN(Vector<String> c) {
		
		try {
			for(int i = 0; i < c.size(); i++) {
				if(i == 0) {
					FileOutputStream NameWriter = new FileOutputStream("Moblie Device(name).txt");
					OutputStreamWriter pls = new OutputStreamWriter(NameWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i > 0 && i < c.size() - 1) {
					FileOutputStream NameWriter = new FileOutputStream("Moblie Device(name).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(NameWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i == c.size() - 1) {
					FileOutputStream NameWriter = new FileOutputStream("Moblie Device(name).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(NameWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.close();
				}
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		}
	
	
	//음식무게 저장하기
	public void WFW(Vector<String> c) {
		
		try {
			for(int i = 0; i < c.size(); i++) {
				if(i == 0) {
					FileOutputStream WeightWriter = new FileOutputStream("Food(weight).txt");
					OutputStreamWriter pls = new OutputStreamWriter(WeightWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i > 0 && i < c.size() - 1) {
					FileOutputStream WeightWriter = new FileOutputStream("Food(weight).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(WeightWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i == c.size() - 1) {
					FileOutputStream WeightWriter = new FileOutputStream("Food(weight).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(WeightWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.close();
				}
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		}
	
	//도구무게 저장하기
	public void WTW(Vector<String> c) {
		
		try {
			for(int i = 0; i < c.size(); i++) {
				if(i == 0) {
					FileOutputStream WeightWriter = new FileOutputStream("Tools(weight).txt");
					OutputStreamWriter pls = new OutputStreamWriter(WeightWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i > 0 && i < c.size() - 1) {
					FileOutputStream WeightWriter = new FileOutputStream("Tools(weight).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(WeightWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i == c.size() - 1) {
					FileOutputStream WeightWriter = new FileOutputStream("Tools(weight).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(WeightWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.close();
				}
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		}
	
	//전자기기무게 저장하기
	public void WMW(Vector<String> c) {
		
		try {
			for(int i = 0; i < c.size(); i++) {
				if(i == 0) {
					FileOutputStream WeightWriter = new FileOutputStream("Moblie Device(weight).txt");
					OutputStreamWriter pls = new OutputStreamWriter(WeightWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i > 0 && i < c.size() - 1) {
					FileOutputStream WeightWriter = new FileOutputStream("Moblie Device(weight).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(WeightWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.newLine();
					B.close();
				}
				if(i == c.size() - 1) {
					FileOutputStream WeightWriter = new FileOutputStream("Moblie Device(weight).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(WeightWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					B.write(c.get(i));
					B.close();
				}
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		}
	
	
	
	//음식가격 저장하기
	public void WFP(Vector<Integer> c) {
		
		try {
			for(int i = 0; i < c.size(); i++) {
				if(i == 0) {
					FileOutputStream PriceWriter = new FileOutputStream("Food(price).txt");
					OutputStreamWriter pls = new OutputStreamWriter(PriceWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					int I = c.get(i);
					String s = Integer.toString(I);				
					B.write(s);
					B.newLine();
					B.close();
				}
				if(i > 0 && i < c.size() - 1) {
					FileOutputStream PriceWriter = new FileOutputStream("Food(price).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(PriceWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					int I = c.get(i);
					String s = Integer.toString(I);	
					B.write(s);
					B.newLine();
					B.close();
				}
				if(i == c.size() - 1) {
					FileOutputStream PriceWriter = new FileOutputStream("Food(price).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(PriceWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					int I = c.get(i);
					String s = Integer.toString(I);	
					B.write(s);
					B.close();
				}
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		}
	
	//도구가격 저장하기
	public void WTP(Vector<Integer> c) {
		
		try {
			for(int i = 0; i < c.size(); i++) {
				if(i == 0) {
					FileOutputStream PriceWriter = new FileOutputStream("Tools(price).txt");
					OutputStreamWriter pls = new OutputStreamWriter(PriceWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					int I = c.get(i);
					String s = Integer.toString(I);	
					B.write(s);
					B.newLine();
					B.close();
				}
				if(i > 0 && i < c.size() - 1) {
					FileOutputStream PriceWriter = new FileOutputStream("Tools(price).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(PriceWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					int I = c.get(i);
					String s = Integer.toString(I);	
					B.write(s);
					B.newLine();
					B.close();
				}
				if(i == c.size() - 1) {
					FileOutputStream PriceWriter = new FileOutputStream("Tools(price).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(PriceWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					int I = c.get(i);
					String s = Integer.toString(I);	
					B.write(s);
					B.close();
				}
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		}
	
	//전자기기가격 저장하기
	public void WMP(Vector<Integer> c) {
		
		try {
			for(int i = 0; i < c.size(); i++) {
				if(i == 0) {
					FileOutputStream PriceWriter = new FileOutputStream("Moblie Device(price).txt");
					OutputStreamWriter pls = new OutputStreamWriter(PriceWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					int I = c.get(i);
					String s = Integer.toString(I);	
					B.write(s);
					B.newLine();
					B.close();
				}
				if(i > 0 && i < c.size() - 1) {
					FileOutputStream PriceWriter = new FileOutputStream("Moblie Device(price).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(PriceWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					int I = c.get(i);
					String s = Integer.toString(I);	
					B.write(s);
					B.newLine();
					B.close();
				}
				if(i == c.size() - 1) {
					FileOutputStream PriceWriter = new FileOutputStream("Moblie Device(price).txt", true);
					OutputStreamWriter pls = new OutputStreamWriter(PriceWriter, "UTF-8");
					BufferedWriter B = new BufferedWriter(pls);
					int I = c.get(i);
					String s = Integer.toString(I);	
					B.write(s);
					B.close();
				}
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		}
	
	//쇼핑카트에 정보 추가
	public void WSL(JLabel name, JLabel weight, int price) {
		
		try {
				shopvec.add(name.getText());
					FileWriter SCNameWriter = new FileWriter("ShoppingList(name).txt");
					for (int i=0; i<shopvec.size();i++) {
						SCNameWriter.write(shopvec.elementAt(i), 0, shopvec.elementAt(i).length());
						SCNameWriter.write("\r\n",0,2);
					}
			/* SCNameWriter.write("\r\n",0,2); */
					SCNameWriter.close();
					/*
					 * FileOutputStream SCNameWriter = new
					 * FileOutputStream("ShoppingList(name).txt", true); OutputStreamWriter pls =
					 * new OutputStreamWriter(SCNameWriter, "UTF-8"); BufferedWriter B = new
					 * BufferedWriter(pls); B.write(name.getText()); B.close();
					 */
					shopvec2.add(weight.getText());
					FileWriter SCWeightWriter = new FileWriter("ShoppingList(weight).txt");
					for (int i=0; i<shopvec2.size();i++) {
						SCWeightWriter.write(shopvec2.elementAt(i),0,shopvec2.elementAt(i).length());
						SCWeightWriter.write("\r\n",0,2);
					}
					SCWeightWriter.close();
					
					shopvec3.add(String.valueOf(price));
					FileWriter SCPriceWriter = new FileWriter("ShoppingList(price).txt");
					for (int i=0; i<shopvec3.size();i++) {
						SCPriceWriter.write(shopvec3.elementAt(i),0,shopvec3.elementAt(i).length());
						SCPriceWriter.write("\r\n",0,2);
					}
					SCPriceWriter.close();			
		}
		catch (IOException e) {
			System.out.println(e);
		}
		}
	
	//쇼핑카트 정보 불러오기
	public void RSL(Vector<String> c, Vector<String> b, Vector<Integer> a) {
		c.clear();
		b.clear();
		a.clear();
		
		try {
			
			FileReader Namein = new FileReader("ShoppingList(name).txt");
			Scanner scn = new Scanner(Namein);
			while(scn.hasNext()) {
				c.add(scn.nextLine());
			} Namein.close();
			
			FileReader Weightin = new FileReader("ShoppingList(weight).txt");
			Scanner scw = new Scanner(Weightin);
			while(scw.hasNext()) {
				b.add(scw.nextLine());
			} Weightin.close();
			
			FileReader Pricein = new FileReader("ShoppingList(price).txt");
			Scanner scp = new Scanner(Pricein);
			while(scp.hasNext()) {
				a.add(Integer.valueOf(scp.nextLine()));
			} Pricein.close();
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

}