package com.member;

public class MemberDTO {
	private int midx;
	private String mid;
	private String mpass;
	private String mname;
	private String mdate;
	
	public MemberDTO() {
		super();
	}
	public MemberDTO(int midx, String mid, String mpass, String mname, String mdate) {
		super();
		this.midx = midx;
		this.mid = mid;
		this.mpass = mpass;
		this.mname = mname;
		this.mdate = mdate;
	}
	public int getMidx() {
		return midx;
	}
	public void setMidx(int midx) {
		this.midx = midx;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpass() {
		return mpass;
	}
	public void setMpass(String mpass) {
		this.mpass = mpass;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
}
