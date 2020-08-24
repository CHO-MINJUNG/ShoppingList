
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public Main main = null;
	public GoodsShow goodsshow = null;
	public MainShow mainshow = null;
	public AddGoods addgoods = null;
	public RemoveGoods removegoods = null;
	public ShoppingList shoppinglist = null;
	public PurchaseList purchaselist = null;
	public AllGoodsShow allgoodsshow = null;
	
	public void change(String panelName) {
		if(panelName.equals("goodsshow")) {
			getContentPane().removeAll();
			getContentPane().add(goodsshow);
			revalidate();
			repaint();
		}else if(panelName.equals("mainshow")) {
			getContentPane().removeAll();
			getContentPane().add(mainshow);
			revalidate();
			repaint();
		}
		else if(panelName.contentEquals("addgoods")) {
			getContentPane().removeAll();
			getContentPane().add(addgoods);
			revalidate();
			repaint();
		}
		else if(panelName.contentEquals("removegoods")) {
			getContentPane().removeAll();
			getContentPane().add(removegoods);
			revalidate();
			repaint();
		}
		else if(panelName.contentEquals("shoppinglist")) {
			getContentPane().removeAll();
			this.shoppinglist = new ShoppingList(this);
			getContentPane().add(shoppinglist);
			revalidate();
			repaint();
		}
		else if(panelName.contentEquals("purchaselist")) {
			getContentPane().removeAll();
			this.purchaselist = new PurchaseList(this);
			getContentPane().add(purchaselist);
			revalidate();
			repaint();
		}else if(panelName.contentEquals("allgoodsshow")) {
			getContentPane().removeAll();
			this.allgoodsshow = new AllGoodsShow(this);
			getContentPane().add(allgoodsshow);
			revalidate();
			repaint();
		}
		else {
			getContentPane().removeAll();
			getContentPane().add(main);
			revalidate();
			repaint();
		}
	}
	
	public MainFrame(){
		this.setTitle("ºÓ«Œ∏ÆΩ∫∆Æ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 700);
		
		this.goodsshow = new GoodsShow(this);
		this.main = new Main(this);
		this.mainshow = new MainShow(this);
		this.addgoods = new AddGoods(this);
		this.removegoods = new RemoveGoods(this);
		this.shoppinglist = new ShoppingList(this);
		this.purchaselist = new PurchaseList(this);
		this.allgoodsshow = new AllGoodsShow(this);
		
		this.add(main);
		// set visible
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MainFrame();

	}

}
