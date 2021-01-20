package com.border;

public class BorderDTO {
	private int midx;
	private int bidx;
	private String btitle;
	private String bcontext;
	private String bdate;
	
	public BorderDTO() {
		super();
	}
	public BorderDTO(int midx, int bidx, String btitle, String bcontext, String bdate) {
		super();
		this.midx = midx;
		this.bidx = bidx;
		this.btitle = btitle;
		this.bcontext = bcontext;
		this.bdate = bdate;
	}
	public int getMidx() {
		return midx;
	}
	public void setMidx(int midx) {
		this.midx = midx;
	}
	public int getBidx() {
		return bidx;
	}
	public void setBidx(int bidx) {
		this.bidx = bidx;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontext() {
		return bcontext;
	}
	public void setBcontext(String bcontext) {
		this.bcontext = bcontext;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
}
