package com.list.test;

public class ProductDTO {
	private int pid;
	private String pname;
	private int pprice;
	private String pimage1;
	private String pdetail;
	private String prdate;
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(int pid, String pname, int pprice, String pimage1, String pdetail, String prdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pimage1 = pimage1;
		this.pdetail = pdetail;
		this.prdate = prdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public String getPimage1() {
		return pimage1;
	}
	public void setPimage1(String pimage1) {
		this.pimage1 = pimage1;
	}
	public String getPdetail() {
		return pdetail;
	}
	public void setPdetail(String pdetail) {
		this.pdetail = pdetail;
	}
	public String getPrdate() {
		return prdate;
	}
	public void setPrdate(String prdate) {
		this.prdate = prdate;
	}

	
}
