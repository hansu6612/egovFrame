package bbs.notice.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import bbs.common.service.SearchVO;
import bbs.notice.service.NoticeService;
import bbs.notice.service.NoticeVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("noticeService")
public class NoticeServiceImpl extends EgovAbstractServiceImpl implements NoticeService{
	
	
	@Resource(name = "NoticeDAO")
	private NoticeDAO noticeDAO;
	
	@Resource(name = "egovNttCodeGnrService")
	private EgovIdGnrService egovNttCodeGnrService;
	
	@Override
	public List<?> noticeList(SearchVO searchVO) throws Exception {
		return noticeDAO.noticeList(searchVO);
	}

	public int noticeListCnt(SearchVO searchVO) throws Exception {
		return noticeDAO.noticeListCnt(searchVO);
	}
	
	public void noticeInsert(NoticeVO noticeVO) throws Exception {
		int popupCode = egovNttCodeGnrService.getNextIntegerId();
		noticeVO.setBdNo(popupCode);
		
		noticeDAO.noticeInsert(noticeVO);
	}
	
	public EgovMap noticeDetail(NoticeVO noticeVO) throws Exception {
		return noticeDAO.noticeDetail(noticeVO);
	}

	public void noticeDelete(NoticeVO noticeVO) throws Exception {
		noticeDAO.noticeDelete(noticeVO);
	}

	public void noticeUpdate(NoticeVO noticeVO) throws Exception {
		noticeDAO.noticeUpdate(noticeVO);
	}

	public void noticeViewCount(NoticeVO noticeVO) throws Exception {
		noticeDAO.noticeViewCount(noticeVO);
	}

	@Override
	public List<?> noticeFixList(SearchVO searchVO) throws Exception {
		return noticeDAO.noticeFixList(searchVO);
	}


}
