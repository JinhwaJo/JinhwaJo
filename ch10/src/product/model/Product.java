package product.model;

public class Product {
	private int pno;
	private String pname;
	private long price;
	private int pcnt;
	
	public Product() {}
	public Product(int pno, String pname, long price, int pcnt) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this. pcnt = pcnt;
	}
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getPcnt() {
		return pcnt;
	}
	public void setPcnt(int pcnt) {
		this.pcnt = pcnt;
	}
	
}
