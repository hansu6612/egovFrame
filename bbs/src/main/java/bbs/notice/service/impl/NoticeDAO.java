package bbs.notice.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import bbs.common.service.SearchVO;
import bbs.notice.service.NoticeVO;
import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Repository("NoticeDAO")
public class NoticeDAO extends EgovComAbstractDAO {
	
	public List<?> noticeList (SearchVO searchVO) throws Exception {
		return selectList("noticeList", searchVO);
	}
	public List<?> noticeFixList (SearchVO searchVO) throws Exception {
		return selectList("noticeFixList", searchVO);
	}
	
	public int noticeListCnt(SearchVO searchVO) throws Exception {
		return (Integer) selectOne("noticeListCnt", searchVO);
	}
	
	public void noticeInsert(NoticeVO noticeVO) throws Exception {
		insert("noticeInsert", noticeVO);
	}
	
	public EgovMap noticeDetail(NoticeVO noticeVO) throws Exception {
		return selectOne("noticeDetail", noticeVO);
	}
	
	public void noticeDelete(NoticeVO noticeVO) throws Exception {
		delete("noticeDelete", noticeVO);
	}
	
	public void noticeUpdate(NoticeVO noticeVO)throws Exception{
		update("noticeUpdate", noticeVO);
	}
	
	public void noticeViewCount(NoticeVO noticeVO)throws Exception{
		update("noticeViewCount", noticeVO);
	}
}
