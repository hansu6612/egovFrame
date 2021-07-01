package bbs.notice.service;

import java.util.List;

import bbs.common.service.SearchVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;


public interface NoticeService {
	
	public List<?> noticeList(SearchVO searchVO) throws Exception;

	public List<?> noticeFixList(SearchVO searchVO) throws Exception;
	
	public int noticeListCnt(SearchVO searchVO)throws Exception;
	
	public void noticeInsert(NoticeVO noticeVO) throws Exception;
	
	public EgovMap noticeDetail(NoticeVO noticeVO) throws Exception;
	
	public void noticeDelete(NoticeVO noticeVO) throws Exception;
	
	public void noticeUpdate(NoticeVO noticeVO) throws Exception;
	
	public void noticeViewCount(NoticeVO noticeVO) throws Exception;
}
