package pac;
public class Number {
	private int pnum;
	private void pmethod() {
		pnum = 10;
	}
	int dnum;	//default
//	public int getDnum() {
//		return dnum;
//	}
//	public void setDnum(int data) {
//		dnum = data;
//		
//	}
	
	public void dmethod() {	//default
		System.out.println(pnum);
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public int getPrnum() {
		return prnum;
	}
	public void setPrnum(int prnum) {
		this.prnum = prnum;
	}
	public int getDnum() {
		return dnum;
	}
	public void setDnum(int dnum) {
		this.dnum = dnum;
	}
	public int punum;
	public void pumethod() {
		System.out.println(pnum);
	}
	
	protected int prnum;
	public void prmethod() {}
}