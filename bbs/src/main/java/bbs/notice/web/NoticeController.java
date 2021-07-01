package bbs.notice.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import bbs.common.service.SearchVO;
import bbs.notice.service.NoticeService;
import bbs.notice.service.NoticeVO;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;


@Controller
@RequestMapping(value="/notice/")
public class NoticeController {

	@Resource(name ="noticeService")
	private NoticeService noticeService;
	
	@Resource(name ="propertiesService")
	private EgovPropertyService propertyService;

	// 공지사항 리스트
	@RequestMapping(value = "list.do")
	public String noticeList(@ModelAttribute("searchVO") SearchVO searchVO, Model model) throws Exception {
		
		searchVO.setPageUnit(propertyService.getInt("pageUnit"));
		searchVO.setPageSize(propertyService.getInt("pageSize"));
		
		PaginationInfo paginationInfo = new PaginationInfo();
		
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(searchVO.getRecordCountPerPage());
		paginationInfo.setPageSize(searchVO.getPageSize());
		
		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());	
		                                                                               
		List<?> resultList = noticeService.noticeList(searchVO);
		List<?> fix = noticeService.noticeFixList(searchVO);
		int totalCnt = noticeService.noticeListCnt(searchVO);
		
		paginationInfo.setTotalRecordCount(totalCnt);
		
		model.addAttribute("fixtop",fix);
		model.addAttribute("paginationInfo", paginationInfo);
		model.addAttribute("searchVO", searchVO);
		model.addAttribute("resultList", resultList);
		return "bbs/notice/list";
	}

	// 공지사항 상세보기
	@RequestMapping(value = "view.do")
	public String noticeView(@ModelAttribute("noticeVO") NoticeVO noticeVO, Model model) throws Exception {

		EgovMap resultVO = noticeService.noticeDetail(noticeVO);
		int bdNo = (int) resultVO.get("bdNo");
		noticeService.noticeViewCount(noticeVO);
		model.addAttribute("resultVO", resultVO);

		return "bbs/notice/view";
	}

	// 공지사항 글 작성 페이지
	@RequestMapping(value = "write.do")
	public String noticeWrite(@ModelAttribute("noticeVO") NoticeVO noticeVO, Model model) throws Exception {
		model.addAttribute("flag", "write");
		model.addAttribute("noticeVO", noticeVO);
		return "bbs/notice/write";
	}

	// 공지사항 글 등록
	@RequestMapping(value="insert.do")
	public String noticeInsert(@ModelAttribute("noticeVO") NoticeVO noticeVO,
							RedirectAttributes redirectAttributes) throws Exception {
		
		noticeService.noticeInsert(noticeVO);
		return "redirect:/notice/list.do";
	}

	// 공지사항 글 수정 페이지
	@RequestMapping(value = "modify.do")
	public String noticeModify(@ModelAttribute("noticeVO") NoticeVO noticeVO, Model model) throws Exception {

		EgovMap resultVO = noticeService.noticeDetail(noticeVO);

		model.addAttribute("flag", "update");
		model.addAttribute("resultVO", resultVO);

		return "bbs/notice/modify";
	}

	// 공지사항 글 수정
	@RequestMapping(value = "update.do")
	public String noticeUpdate(@ModelAttribute("noticeVO") NoticeVO noticeVO, RedirectAttributes redirectAttributes)
			throws Exception {

		noticeService.noticeUpdate(noticeVO);

		return "redirect:/notice/list.do";
	}
	
	// 공지사항 글 삭제
	@RequestMapping("delete.do")
	public String noticeDelete(@ModelAttribute("noticeVO") NoticeVO noticeVO, RedirectAttributes redirectAttributes)
			throws Exception {

		noticeService.noticeDelete(noticeVO);
		return "redirect:/notice/list.do";
	}
}
