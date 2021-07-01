package bbs.common.service;

public class SearchVO {

	/** 페이지갯수 */
	private int pageUnit = 10;
	/** 페이지사이즈 */
	private int pageSize = 10;
	/** 현재페이지 */
	private int pageIndex = 1;
	/** 첫페이지 인덱스 */
	private int firstIndex = 1;
	/** 마지막페이지 인덱스 */
	private int lastIndex = 1;
	/** 페이지당 레코드 개수 */
	private int recordCountPerPage = 10;
	/** 검색종류1 */
	private String searchCnd1;
	/** 검색종류2 */
	private String searchCnd2;
	/** 검색어 */
	private String searchWrd="";
	
	private String bbsCode;
	
	private String userCode;
    
	public int getPageUnit() {
		return pageUnit;
	}
	public void setPageUnit(int pageUnit) {
		this.pageUnit = pageUnit;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getFirstIndex() {
		return firstIndex;
	}
	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}
	public int getLastIndex() {
		return lastIndex;
	}
	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}
	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}
	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}
	public String getSearchCnd1() {
		return searchCnd1;
	}
	public void setSearchCnd1(String searchCnd1) {
		this.searchCnd1 = searchCnd1;
	}
	public String getSearchCnd2() {
		return searchCnd2;
	}
	public void setSearchCnd2(String searchCnd2) {
		this.searchCnd2 = searchCnd2;
	}
	public String getSearchWrd() {
		return searchWrd;
	}
	public void setSearchWrd(String searchWrd) {
		this.searchWrd = searchWrd;
	}
	public String getBbsCode() {
		return bbsCode;
	}
	public void setBbsCode(String bbsCode) {
		this.bbsCode = bbsCode;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
}
