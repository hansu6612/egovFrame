package bbs.notice.service;

public class NoticeVO {
	private int bdNo;
	private String bdTitle;
	private String bdContents;
	private String bdCreDate;
	private String bdWriter;
	private String fixtop;
	private int bdCount;


	public String getFixtop() {
		return fixtop;
	}

	public void setFixtop(String fixtop) {
		this.fixtop = fixtop;
	}

	public int getBdNo() {
		return bdNo;
	}
	
	public void setBdNo(int bdNo) {
		this.bdNo = bdNo;
	}
	
	public String getBdTitle() {
		return bdTitle;
	}
	
	public void setBdTitle(String bdTitle) {
		this.bdTitle = bdTitle;
	}
	
	public String getBdContents() {
		return bdContents;
	}
	
	public void setBdContents(String bdContents) {
		this.bdContents = bdContents;
	}
	
	public String getBdCreDate() {
		return bdCreDate;
	}
	
	public void setBdCreDate(String bdCreDate) {
		this.bdCreDate = bdCreDate;
	}
	
	public String getBdWriter() {
		return bdWriter;
	}
	
	public void setBdWriter(String bdWriter) {
		this.bdWriter = bdWriter;
	}
	

	
	public int getBdCount() {
		return bdCount;
	}
	
	public void setBdCount(int bdCount) {
		this.bdCount = bdCount;
	}
}
